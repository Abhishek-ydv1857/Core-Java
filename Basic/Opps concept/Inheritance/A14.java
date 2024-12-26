class A{
    protected int age;
    void setM1(int age){
        this.age=age;
    }
    int getM1(){
        return age;
    }
}
class B {
    void display(){
    A obj=new A();
    obj.setM1(21);
    System.out.println(obj.getM1());
}
}

public class A14 {
    public static void main(String[] args) {
        B p=new B();
        p.display();
    }
}
