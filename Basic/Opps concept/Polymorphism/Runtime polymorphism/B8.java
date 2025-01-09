// .multilevel inheritance 


// A
//   method1 :private 
//   method2 :protected 

public class B8 
{
    
   
    
        public static void main(String[] args) 
		{
            C c=new C();
            c.antother1();
            c.method2();
			c.method3();
           
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
    class C extends B
    {
     void method3()
     {
       System.out.println("method 3");
     }
    }
