package prepOCA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Cricket {
  /*  int num_umpires;
    int num_substitues;

    public Cricket(int np, String sname, String sground, int num_umpires, int num_substitues) {
        super(11, "Criket", "sground");
        this.num_umpires =3;
        this.num_substitues = 2;
    }

   */


    public static void main(String[] args) {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);
    }
}
