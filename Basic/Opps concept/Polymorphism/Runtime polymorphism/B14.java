

public class B14 
{   

    public static void main(String[] args) 
	{
        B b=new B();
        b.method();
        
    }
}
class A
{
                protected void method()
                {
                  System.out.println("method 1");  
                }
}
class B extends A
{
      protected void method()
      {
            super.method();
            System.out.println("method 2");
      }

}

