class Mammal{
    void m1(){
        System.out.println("Characteristic of Mammal");
    }
}
class Dog{
    void m2(){
        Mammal obj=new Mammal();
        obj.m1();
    }
}
public class A2 {
    public static void main(String[] args) {
        Dog obj2=new Dog();
        obj2.m2();
    }
}
