
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Bird extends Animal {
    public void sound() {
        System.out.println("Bird chirps.");
    }

    public void fly() {
        System.out.println("Bird flies.");
    }
}

class Mammal extends Animal {
    public void sound() {
        System.out.println("Mammal growls.");
    }

    public void walk() {
        System.out.println("Mammal walks.");
    }
}

public class B2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sound();
        bird.fly();

        Mammal mammal = new Mammal();
        mammal.sound();
        mammal.walk();
    }
}
