
public class A3 
{
    public static void main(String[] args) 
	{
        B b=new B();
        b.show();
    }
}
abstract class A
{
    A()
    {
        System.out.println("Construcuture call");
    }

    abstract void show();
}
class B extends A
{
    B()
    {
        super();
    }
    void show()
    {
        System.out.println("Void method");
    }
}

