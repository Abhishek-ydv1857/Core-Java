
// abstract class A
// 	abstract method 
// 	 private non abstract method 

// class B ext abstract
// 	method :protected 
// 	method :private 

// class C ext B 

// access child k through 

public class A8 
{
    
    public static void main(String[] args) 
	{
        C c=new C();
        c.method();
        c.show();
        c.another();
       
    }
}
abstract class A
{
    abstract void show();
    private void display()
    {
        System.out.println("Non-Abstract method");
    }
    void another()
    {
        display();
    }
}

class B extends A
{
    void show()
    {
        System.out.println("abstract method");
    }
    protected void show2()
    {
        System.out.println("proctected method class B");
    }
    private void show3()
    {
        System.out.println("private method class B");
    }
    void another()
    {
        show3();
    }
}
class C extends B
{
     void method()
     {
       super.show();
     }
}

