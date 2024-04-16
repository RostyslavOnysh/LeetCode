package prepOCA;

public class X {
    String str = "default";
    int value = 17;
    X(String s){
        str = s;
    }
    X(int i) {
        value = i;
    }
    void print() {
        System.out.println(str + " " + value);
    }
    public static void main(String[] args){
        new X("hello").print();
        new X(92).print();
    }
}
