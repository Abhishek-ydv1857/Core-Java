

class A{
    A(){
       System.out.println("Constructure"); 
    }
    void show(){
        System.out.println("Method");
    }
    void add(){
        int a=2;
        int b=2;
        int c=a+b;
        System.out.println(c);
    }
    int sub(int d,int e){
        System.out.println("Substraction");
        return d-e;
    }
    int div(){
        int g=2;
        int h=2;
        int i=g/h;
        System.out.println(i);
        return i;
    }
}
public class A2 {
    public static void main(String[] args) {
        new A();
        A p=new A();
        p.show();
        p.add();
        System.out.println(p.sub(6,8));
        System.out.println(p.div());

       
    }
}
