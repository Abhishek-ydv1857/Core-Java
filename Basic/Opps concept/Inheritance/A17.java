class A{
    private int num1;
    void setM1(int num1){
        this.num1=num1;
    }
    int getM1(){
        return num1;
    }
}
class B extends A{
    private int num2;
    void setM2(int num2){
        this.num2=num2;
    }
    int getM2(){
        return num2;
    }
}
class C extends A{
    private int num3;
    void setM3(int num3){
        this.num3=num3;
    }
    int getM3(){
        return num3;
    }
}
class D extends A{
    private int num4;
    void setM4(int num4){
        this.num4=num4;
    }
    int getM4(){
        return num4;
    }
}
public class A17 {
    public static void main(String[] args) {
        B obj1=new B();
        obj1.setM1(11);
        obj1.setM2(12);
        C obj2=new C();
        obj2.setM3(13);
        D obj3=new D();
        obj3.setM4(14);
        System.out.println(obj1.getM1());
        System.out.println(obj1.getM2());
        System.out.println(obj2.getM3());
        System.out.println(obj3.getM4());
    } 
}
