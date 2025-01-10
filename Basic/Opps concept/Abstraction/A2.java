
// abstract class 
// 	method1 :abstract type :no return and no argument 
// 	method3 :abstract type : return and no argument
		
// another class extends 
// access through child class 

 public class A2 
 {
    public static void main(String[] args) 
	{
        B p=new B();
        p.show(3);
        p.display("Hello");
    }
}
abstract class A
{
    abstract void show(int a);

    abstract String display(String name);
}
class B extends A
{
       void show(int a)
       {
              System.out.println(a);
       }

       String display(String name)
       {
             System.out.println(name);
             return name;
       }
}
