
// single level inheritance : 
// method :
// first method :protected 
// second method :private 

public class B7 
{
   
   public static void main(String[] args) 
   {
       B b=new B();
       b.antother1();
       b.method1();
      
   }
}
class A
{
   protected void method1()
   {
      
      System.out.println("method 2");
   }

}
       
class B extends A
{
   
   private void method2()
   {
      System.out.println("method 1");
   }
   void antother1()
   {
       
           A a=new A();
           a.method1();//first way
           method1();//second way
           
   }


}




