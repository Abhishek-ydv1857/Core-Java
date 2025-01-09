
public class B15 
{

    public static void main(String[] args) 
	{
        B b=new B();
        b.antother1();
        b.antother2();
       
    }
}
class A
{
                private void method()
                {
                  System.out.println("method 1");  
                }
                void antother1()
                {
                    method();
                }
}
class B extends A
{
      private void method()
      {
            
            System.out.println("method 2");
      }
    
      void antother2()
      {
        method();
      }


}

