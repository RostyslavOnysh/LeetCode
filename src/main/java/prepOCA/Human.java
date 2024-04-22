package prepOCA;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + "\n" + "Age: " + age;
    }

    public static void main(String[] args){
        System.out.println(new Human("Harry Kane",22).toString());
    }
}
