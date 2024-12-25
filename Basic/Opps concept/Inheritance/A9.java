class A{
    A method1(int age){
        System.out.println(age);
        return this;
    }
}
class B extends A{
    int method2(){
        int dight=3;
        System.out.println(dight);
        return dight;
    }
}    
class C extends B{
    void method3(){
        System.out.println("class C method 3");
    }
}
class D extends C{
    void method4(int num){
        System.out.println(num);
    }
}
public class A9 {
    public static void main(String[] args) {
        D p=new D();
        p.method1(21);
        p.method2();
        p.method3();
        p.method4(323434);
    }
}
