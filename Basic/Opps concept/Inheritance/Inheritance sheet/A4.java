class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("This animal is a: " + name);
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("This bird can fly high in the sky.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This mammal can run fast on the ground.");
    }
}

public class A4 {
    public static void main(String[] args) {
        Bird bird = new Bird("Eagle");
        bird.displayName();
        bird.fly();

        System.out.println();

        Mammal mammal = new Mammal("Cheetah");
        mammal.displayName();
        mammal.run();
    }
}
