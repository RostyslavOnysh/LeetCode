package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMethod {
    void main() {
        System.out.println("one");
    }
    static void main(String args) {
        System.out.println("two");
    }
    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("can", "cup");
        for (int container = 0; container < drinks.size(); container++)
            System.out.print(drinks.get(container) + ",");

    }
    void main(Object[] args) {
        System.out.println("four");
    }
}
