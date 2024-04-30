package part2;

public class Vars {
    int z;
    public static void main(String[] args){
        Vars obj = new Vars();
        int z = 3;
        System.out.print(z);  // 3
        obj.doStuff(); // 2
        System.out.print(z); // 3
        System.out.print(obj.z); // 1
    }
    void doStuff() {
        int z = 2;
        doStuff(z);
        System.out.print(z);
    }
    void doStuff(int zzz) {
        z = 1;
    }
}
