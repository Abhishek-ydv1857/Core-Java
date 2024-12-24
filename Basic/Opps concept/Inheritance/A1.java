class A extends B{
    void show1(){
        System.out.println("class A show1");
    }
    void show2(int num){
        System.out.println(num);
 }
}
class B{
    int display1(){
        int a = 253;
        return a;
    }
    int display2(int age){
        return age;
    }

}
public class A1{
    public static void main(String[] args){
        A p=new A();
        p.show1();
        p.show2(11);
        System.out.println(p.display1());
        System.out.println(p.display2(21));
    }
}