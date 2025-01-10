
// abstract class 1
// abstract method : return and argument  

// abstract class 2
// abstract method :no return and argument  

// abstract class 3
// abstract method : return and no argument  

// abstract class 4
// abstract method :no return and no argument  

// anonymous inner class 

public class A10
{
public static void main(String[] args) 
{
     A a=new A()
     {
           int show()
           {
             System.out.println("9");
             return 9;
           }

     };
     a.show();

     B b=new B() 
     {
        void show2(int a)
           {
              System.out.println("A value :"+a);
           }
     };
     b.show2(1);

     C c=new C() 
     {
        int show3()
        {
             System.out.println("2");
             return 2;
        }
     };
     c.show3();
     
     D d=new D() 
     {
        void show4()
        {
              System.out.println("show 4");
        }
     };
     d.show4();

}
}

abstract class A
{
abstract int show();
}

abstract class B 
{
abstract void show2(int a);    
}

abstract class C
{
abstract int show3();    
}
abstract class D
{
abstract void show4();    
}
