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
    void display(){
        System.out.println(getM1());
    }
}
public class A13 {
    public static  void main(String[] args){
        B obj=new B();
        obj.setM1(12);
        obj.display();
    }
}
