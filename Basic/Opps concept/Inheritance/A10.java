class A{
    int a;
    void setm1(int a){
        this.a=a;
    }
    int getm1(){
        return a;
    }
}
class B extends A{
    int b;
    void setm2(int b){
        this.b=b;
    }
    int getm2(){
        return b;
    }
}
class C extends B{
    int c;
    void setm3(int c){
        this.c=c;
    }
    int getm3(){
        return c;
    }
}
class D extends C{
    int d;
    void setm4(int d){
        this.d=d;
    }
    int getm4(){
        return d;
    }
}
public class A10 {
    public static void main(String[] args) {
        D p=new D();
        p.setm1(3);
        p.setm2(4);
        p.setm3(5);
        p.setm4(6);
        System.out.println(p.getm1());
        System.out.println(p.getm2());
        System.out.println(p.getm3());
        System.out.println(p.getm4());
    }
}
