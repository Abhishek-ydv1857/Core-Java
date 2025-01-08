// 1.
 
// single level inheritance : 
// method :
// first method :public 
// second method :public 

public class B1 
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
        public void method1()
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

