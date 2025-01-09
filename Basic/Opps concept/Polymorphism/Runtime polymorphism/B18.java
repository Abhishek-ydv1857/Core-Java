
public class B18 
{

    public static void main(String[] args) 
	{
        B b=new B();
        b.another();
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
        private void method2()
        {
             System.out.println("method 2");
        }
        void another()
        {
            method2();
        }
    }
