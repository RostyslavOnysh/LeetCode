package prepOCA;

public class TestStaticConcept {
    private static int noOfObjectsCreated;

    public TestStaticConcept(){
        noOfObjectsCreated++;
    }

    public static void main(String[] args){
        new TestStaticConcept();
        new TestStaticConcept();

        System.out.println(getNoOfObjectsCreated() + " objects have been created.");
    }

    public static int getNoOfObjectsCreated(){
        return noOfObjectsCreated;
    }
}
