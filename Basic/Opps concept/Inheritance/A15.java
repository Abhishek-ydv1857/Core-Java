class A {
    void method1(){
        System.out.println("class method1 ");
    }
} 
class B extends A{
    int method2(){
        int age = 20;
        return age;

    }
}
class C extends B{
    int method3(int num){
        System.out.println(num);
        return num;
    }
}
class D extends C{
    void method4(int num1){
        System.out.println(num1);
    }
}
class E extends D{
    int a;
    E method5(int a){
        System.out.println(a);
        return this;
    }
}
public class A15 {
    public static void main(String[] args){
        E p=new E();
        p.method1();
        p.method2();
        p.method3(23);
        p.method4(34);
        p.method5(34);
    }
}
