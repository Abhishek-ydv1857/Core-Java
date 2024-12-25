class A {
    int num1, num2, sum;

    A(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        sum = num1 + num2;
        System.out.println("Sum of numbers in Class A: " + sum);
    }
}

class B extends A {
    int product;

    B(int n1, int n2) {
        super(n1, n2);
        product = num1 * num2;
        System.out.println("Product of numbers in Class B: " + product);
    }
}

class C extends B {
    C(int n1, int n2) {
        super(n1, n2);
        System.out.println("Class C: Multilevel Inheritance Complete!");
    }
}

public class A12 {
    public static void main(String[] args) {
        System.out.println("Creating object of Class C...");
        C obj = new C(5, 3);
    }
}
