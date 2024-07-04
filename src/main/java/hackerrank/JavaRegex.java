package hackerrank;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern;

    public MyRegex() {
        String zeroTo255 = "([0-9]{1,2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])";
        this.pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    }
}
