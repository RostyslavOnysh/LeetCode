package prepOCA;

public class Pieces {

    public static String doMsg(char x) {
        return "Good Day!";
    }
    public static String doMsg(int y) {
        return "Good Luck!";
    }

    public static void main(String[] info) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.println(doMsg(z));
    }
}
