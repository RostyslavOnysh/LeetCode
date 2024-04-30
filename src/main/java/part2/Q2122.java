package part2;

public class Q2122 {
    public static void main(String[] args) {
        Q2122 sc, scA, scB;
        sc = new Q2122();
        scA = new SampleClassA();
        scB = new SampleClassB();
        System.out.println("Hash is : " +
                sc.getHash() + ", " + scA.getHash() + ", " + scB.getHash());
    }
    public int getHash() {
        return 111111;
    }
}
class SampleClassA extends Q2122 {
 //   public long getHash() {
   //     return 44444444;
    //}
}
class SampleClassB extends Q2122 {
  //  public long getHash() {
    //    return 999999999;
    // }
}
