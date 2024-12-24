class A{
    private int num;
    void setShow1(int num){
        this.num=num;
    }
    int getShow1(){
        return num;
    }
}
class B extends A{
    private int digit;
    void setShow2(int digit){
        this.digit=digit;
    }
    int getShow2(){
        return digit;
    }
}
public class A5 {
    public static void main(String[] args) {
        B p=new B();
        p.setShow1(34);
        p.setShow2(35);
        System.out.println(p.getShow1());
        System.out.println(p.getShow2());
    }
}
