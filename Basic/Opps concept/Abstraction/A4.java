
// abstract class :parameterised constructor 

// abstract class :parameterised constructor 

// another class extends 

// access through child class

public class A4 
{
    public static void main(String[] args) 
	{
        B p=new B();
        p.show();
        
    }
}

abstract class A
{
    A(int a)
    {
        System.out.println("Constructur call !"+a);
    }
    abstract void show();

}
class B extends A
{
    B()
    {
      super(8);  
    }

    void show()
    {
        System.out.println("void mthod !");
    }
}
