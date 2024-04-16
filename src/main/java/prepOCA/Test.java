package prepOCA;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public void testRefs(String str, StringBuilder sb) {
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }

    public static void main(String[] args) {
        String str = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new Test().testRefs(str, sb);
        System.out.println("str=" + str + " sb=" + sb);
    }
}
