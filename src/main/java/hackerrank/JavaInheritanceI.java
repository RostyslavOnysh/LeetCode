package hackerrank;

public class JavaInheritanceI {
    public static void main(String args[]) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sign();
    }
}

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    public  void sign() {
        System.out.println("I am singing");
    }
}