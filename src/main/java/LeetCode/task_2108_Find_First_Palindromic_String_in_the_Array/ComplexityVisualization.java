package LeetCode.task_2108_Find_First_Palindromic_String_in_the_Array;

import java.awt.*;
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


public class ComplexityVisualization {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Time and Memory Complexity Visualization");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(2, 1));

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
            frame.pack();
            frame.setVisible(true);
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
}