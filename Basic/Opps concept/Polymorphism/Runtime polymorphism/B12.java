
public class B12 
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
    protected void method1()
    {
       System.out.println("method 1");
    }
   
}
        
class B extends A
{
    
    
    public void method2()
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

