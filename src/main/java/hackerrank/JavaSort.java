package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    private int id;
    private String fname;
    private double cgpa;

    public JavaSort(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
 class SolutionNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<JavaSort> studentList = new ArrayList<JavaSort>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            JavaSort st = new JavaSort(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }

        Collections.sort(studentList, new Comparator<JavaSort>() {
            @Override
            public int compare(JavaSort s1, JavaSort s2) {
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                } else if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                } else {
                    return Integer.compare(s1.getId(), s2.getId());
                }
            }
        });

        for (JavaSort st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
