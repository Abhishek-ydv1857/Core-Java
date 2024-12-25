class M1{
    void m1(){
        System.out.println("Class M1 ");
    }
    void m2(){
        m1();
    }
    void m3(){
        m2();
    }
    void m4(){
        m3();
    }
    void m5(){
        m4();
    }
}

public class A7 {
    public static void main(String[] args) {
        M1 p=new M1();
        p.m5();
    }
}
