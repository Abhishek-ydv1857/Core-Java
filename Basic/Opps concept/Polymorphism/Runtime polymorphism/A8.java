

class A{
    A(int a){
        System.out.println(a);
    }
}

class B extends A{
    B(int b){
        super(20);
        System.out.println(b);
    }
}
public class A8 {
    public static void main(String[] args) {
        new B(67);

    }
}
