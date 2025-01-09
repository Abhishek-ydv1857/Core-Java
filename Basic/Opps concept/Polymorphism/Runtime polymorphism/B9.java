
// method3 :protected
// method4 :private


public class B9
{
    public static void main(String[] args) 
	{
      C  c=new C();
      c.method3();
      c.antother1();
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
    
    
    private void method2()
    {
       
       System.out.println("method 2");
    }

    void antother1()
    {
        
           
            method2();
            
    }

   


}
class C extends B
{
     void method3()
     {
       System.out.println("method 3");
     }
}
