
public class B16 
{
    
  public static void main(String[] args) 
  {
    B b=new B();
    b.method();
    b.method2();
  }
}

class A
{
    public void method()
    {
        System.out.println("method 1");
    }
}
class B extends A
{
    protected void method2()
    {
         System.out.println("method 2");
    }
}

