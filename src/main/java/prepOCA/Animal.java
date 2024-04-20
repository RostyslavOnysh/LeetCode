package prepOCA;

public class Animal {
    private static int noOfAnimals;

    public static void updateNoOfAnimals(){
        Animal.noOfAnimals++;
    }

    public static int getNoOfAnimals() {
        return noOfAnimals;
    }
}
