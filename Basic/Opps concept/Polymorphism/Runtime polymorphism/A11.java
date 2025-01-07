class A{
    int a;
    int b;
    void add(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class B extends A{
    void show(){
        super.add(34, 36);
        int c=a+b;
        System.out.println(c);
    }
}
public class A11 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
