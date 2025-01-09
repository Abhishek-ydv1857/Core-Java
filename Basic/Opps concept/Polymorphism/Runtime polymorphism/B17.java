
public class B17 
{
    

    public static void main(String[] args) 
	{
        B b=new B();
        b.another();
        b.method2();
    }
}
    
    class A
    {
        private void method()
        {
            System.out.println("method 1");
        }
        void another()
        {
            method();
        }
    }
    class B extends A
    {
        protected void method2()
        {
             System.out.println("method 2");
        }
    }

