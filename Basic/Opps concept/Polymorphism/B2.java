
// single level inheritance : 
// method :
// first method :protected 
// second method :protected 

public class B2 
{
   

   public static void main(String[] args) 
   {
       B b=new B();
       b.method1();
       b.method2();
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
   protected void method2()
   {
      System.out.println("method 2");
   }
}