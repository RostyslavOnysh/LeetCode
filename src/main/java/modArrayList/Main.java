package modArrayList;

public class Main {
    public static void main(String[] args) {
        ModArrayListImpl modArrayList = new ModArrayListImpl();
        modArrayList.add(0);
        modArrayList.add(10);
        modArrayList.add(20);
        modArrayList.add(30);

        System.out.println(modArrayList.getUsingMod(1));
        System.out.println(modArrayList.getUsingMod(-2));
        System.out.println(modArrayList.getUsingMod(40));
    }
}
