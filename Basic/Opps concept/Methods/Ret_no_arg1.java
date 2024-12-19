class Primitive{
    int a(){
        int b = 25;
        return b;
    }
    char s(){
        char c = 'A';
        return c;
    }
    float d(){
        float d = 2.2f;
        return d;
    }
    double  f(){
        double e = 1.3333;
        return e;
    }
    long g(){
        long f = 215646387;
        return f;
    }
    short h(){
        short g = 23569;
        return g;
    }
    boolean j(){
        boolean h = true;
        return h;
    }
    byte k(){
        byte i = 125;
        return i;
    }
}
public class Ret_no_arg1 {

    public static void main(String[] args) {
        Primitive p = new Primitive();
        System.out.println(p.a());
        System.out.println(p.s());
        System.out.println(p.d());
        System.out.println(p.f());
        System.out.println(p.g());
        System.out.println(p.h());
        System.out.println(p.j());
        System.out.println(p.k());
    }
    

    
}
