
class Person{
    void m1(){
        System.out.println("HELLO");
    }
}
class Student extends Person{
    void m2(){
        Person obj=new Person();
        obj.m1();
    }
}
public class A1{
    public static void main(String[] args){
        Student p=new Student();
        p.m2();
    }
}