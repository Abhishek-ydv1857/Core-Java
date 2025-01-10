// abstract class A
// 	private abstract method 
// 	non abstract method 

// class B ext abstract

// class C ext B 

// access child k through 

public class A7 
{
    
    public static void main(String[] args) 
	{
        C c=new C();
        c.method();
        c.display();
    }
}
abstract class A
{
   // abstract private void show();
    void display()
    {
        System.out.println("Non-Abstract method");
    }
}

class B extends A
{
   
}
class C extends B
{
     void method()
     {
       System.out.println("C class method call ");
     }
}
