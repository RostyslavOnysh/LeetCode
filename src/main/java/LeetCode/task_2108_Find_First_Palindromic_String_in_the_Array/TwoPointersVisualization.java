package LeetCode.task_2108_Find_First_Palindromic_String_in_the_Array;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.List;

class ComplexityVisualization1 extends JPanel {
    private String word;
    private int left;
    private int right;
    private boolean isPalindrome;

    public ComplexityVisualization1() {
        this.word = "";
        this.left = 0;
        this.right = 0;
        this.isPalindrome = false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Time and Memory Complexity Visualization");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(3, 1));
            frame.getContentPane().setBackground(new Color(0, 0, 0, 50));

            // Data series for time complexity
            XYSeries timeSeries = new XYSeries("Time Complexity");
            // Data series for memory complexity
            XYSeries memorySeries = new XYSeries("Memory Complexity");

            // Populate the data series
            for (int n = 1; n <= 100; n++) {
                for (int m = 1; m <= 20; m++) {
                    timeSeries.add(n, n * m);
                    memorySeries.add(n, n * m);
                }
            }

            // Create datasets
            XYSeriesCollection timeDataset = new XYSeriesCollection(timeSeries);
            XYSeriesCollection memoryDataset = new XYSeriesCollection(memorySeries);

            // Create charts
            JFreeChart timeChart = createChart(timeDataset, "Time Complexity",
                    "Number of Words (n)", "Complexity (O(n * m))");
            JFreeChart memoryChart = createChart(memoryDataset, "Memory Complexity",
                    "Number of Words (n)", "Complexity (O(n * m))");

            // Add charts to the frame
            frame.add(new ChartPanel(timeChart));
            frame.add(new ChartPanel(memoryChart));

            List<String> words = List.of("abc", "car", "ada", "racecar", "cool");
            ComplexityVisualization1 panel = new ComplexityVisualization1();
            frame.add(panel);
            frame.setSize(800, 600);
            frame.setVisible(true);

            new Thread(() -> {
                Solution solution = new Solution(panel);
                for (String word : words) {
                    panel.setWord(word);
                    boolean result = solution.isPalindrome(word);
                    if (result) {
                        panel.setPalindrome(true);
                        break;
                    }
                }
            }).start();
        });
    }

    private static JFreeChart createChart(XYSeriesCollection dataset, String title, String xAxisLabel, String yAxisLabel) {
        JFreeChart chart = ChartFactory.createXYLineChart(
                title,
                xAxisLabel,
                yAxisLabel,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();
        plot.setDomainPannable(true);
        plot.setRangePannable(true);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        domainAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, true);
        renderer.setSeriesShapesVisible(0, false);
        plot.setRenderer(renderer);

        return chart;
    }

    public void setWord(String word) {
        this.word = word;
        this.left = 0;
        this.right = word.length() - 1;
        this.isPalindrome = false;
        repaint();
    }

    public void movePointers(int left, int right) {
        this.left = left;
        this.right = right;
        repaint();
    }

    public void setPalindrome(boolean isPalindrome) {
        this.isPalindrome = isPalindrome;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (word == null || word.isEmpty()) return;

        int width = getWidth();
        int height = getHeight();
        int charWidth = width / word.length();
        int y = height / 2;

        g.setColor(Color.WHITE);
        for (int i = 0; i < word.length(); i++) {
            if (i == left || i == right) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.WHITE);
            }
            g.drawString(String.valueOf(word.charAt(i)), i * charWidth + charWidth / 2, y);
        }

        if (isPalindrome) {
            g.setColor(Color.GREEN);
            g.drawString("Palindrome found: " + word, 10, height - 20);
        }
    }

    static class Solution {
        private final ComplexityVisualization1 panel;

        public Solution(ComplexityVisualization1 panel) {
            this.panel = panel;
        }

        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                panel.movePointers(left, right);
                try {
                    Thread.sleep(500); // Pause for visualization
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}