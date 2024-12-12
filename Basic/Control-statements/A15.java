import java.util.*;
class A15 
{
    public static void main(String[] args) {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your charector");
    ch=sc.next().charAt(0);
    if(ch=='a')
    {
        System.out.println(" Apple");
    }
    else if(ch=='b')
    {
        System.out.println("Ball");
    }
    else if(ch=='c')
    {
        System.out.println("cat");
    }
    else 
    {
        System.out.println("Invalid");
    }
    }
}
