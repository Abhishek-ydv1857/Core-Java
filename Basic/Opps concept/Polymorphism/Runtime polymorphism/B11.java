
public class B11
{
    
    public static void main(String[] args) 
	{
      C  c=new C();
      c.method3();
      c.another();
       
    }
}
class A
{
    private void method1()
    {
       System.out.println("method 1");
    }
    void another()
    {
        method1();
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

