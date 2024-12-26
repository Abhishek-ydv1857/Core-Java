class A {
    int cal(int a ,int b){
        return a+b;
    }
    float cal(float a,float b){
        return a-b;

    }
    double cal(double a, double b){
        return a*b;
    }
    long cal(long a,long b){
        return a/b;
    }
    }
    
public class A1 {
    public static void main(String[] args) {
        A p=new A();
        System.out.println(p.cal(4,5));
        System.out.println(p.cal(1.5f,43f));
        System.out.println(p.cal((double)3,4));
        System.out.println(p.cal((long)4,5));
    }
}