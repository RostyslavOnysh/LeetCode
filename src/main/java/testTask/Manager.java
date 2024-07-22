package testTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
    public static void main(String[] args) {
        String s = "1769. Minimum Number of Operations to Move All Balls to Each Box";
        System.out.println("task_" + result(s));
    }


    private static String result(String s) {
       return s.replace(" ", "_");
    }
}