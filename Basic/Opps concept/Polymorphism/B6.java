
// single level inheritance : 
// method :
// first method :private 
// second method :protected 


public class B6 
{

   public static void main(String[] args)
   {
       B b=new B();
       b.antother1();
      b.method2();
      
   }
}
class A
{
        private void method1()
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
       
class B extends A
{
   protected void method2()
   {
      
      System.out.println("method 2");
   }

}


