package testTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
    public static void main(String[] args) {
        System.out.println("task_" + result("1773. Count Items Matching a Rule"));
    }


    private static String result(String s) {
       return s.replace(" ", "_");
    }
}