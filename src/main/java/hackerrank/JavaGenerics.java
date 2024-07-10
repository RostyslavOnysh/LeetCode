package hackerrank;

import java.util.Scanner;

public class JavaGenerics {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integer array
        Integer[] intArray = {1, 2, 3};


        String[] stringArray = {"Hello", "World"};

        scanner.close();

        printArray(intArray);
        printArray(stringArray);
    }
}