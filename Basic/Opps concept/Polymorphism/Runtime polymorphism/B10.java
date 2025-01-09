

public class B10 
{
    
    public static void main(String[] args) 
	{
      C  c=new C();
      c.method3();
      c.method1();
       
    }
}
class A
{
    public void method1()
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
class C extends B
{
     void method3()
     {
       System.out.println("method 3");
     }
}

