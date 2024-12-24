class A {
    int result;

    void add(int num1, int num2) {
        result = num1 + num2;
        System.out.println("Addition Result (A): " + result);
    }
}

class B extends A {
    void subtract(int num1, int num2) {
        result = num1 - num2;
        System.out.println("Subtraction Result (B): " + result);
    }
}

public class A2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.add(10, 5);
        obj.subtract(10, 5);
    }
}
