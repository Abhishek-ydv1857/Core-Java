
public class B13 
{
    public static void main(String[] args) 
	{
        B b=new B();
        b.method();
        
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
      public void method()
      {
            super.method();
            System.out.println("method 2");
      }

}

