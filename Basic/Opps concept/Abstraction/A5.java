
// abstract class A
// 	abstract method 

// class B ext abstract

// class C ext B 

// access child k through 
  
public class A5 
{
    public static void main(String[] args) 
	{
        C c=new C();
        c.method();
        c.show();
    }
}
abstract class A
{
    abstract void show();
}

class B extends A
{
    void show()
    {
        System.out.println("abstract method");
    }
}
class C extends B
{
     void method()
     {
       super.show();
     }
}
