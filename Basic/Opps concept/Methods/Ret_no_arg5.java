
import java.util.Scanner;

class Arithemetic{
    int sum(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a :");
        int a = sc.nextInt();
        
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int c = a+b;
        return c;
    }
    int sub(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a :");
        int a = sc.nextInt();
        
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int c = a-b;
        return c;
    }
    int mul(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a :");
        int a = sc.nextInt();
        
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int c = a*b;
        return c;
    }
    int div(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a :");
        int a = sc.nextInt();
        
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int c = a/b;
        return c;
    }
}
class Even{
    int even(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        
        if(a%2==0){
            System.out.println(a+" is even ");
        }
        else{
            System.out.println(a+ " is odd");
        }
        return a;
    }
}
class Odd{
    int odd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        
        if(a%2!=0){
            System.out.println(a+ " is odd ");
        }
        else{
            System.out.println(a+ " is even ");
        }
        return a;
    }
}
public class Ret_no_arg5 {
    public static void main(String[] args) {
        Arithemetic p = new Arithemetic();
        System.out.println("The sum of a&b is "+p.sum());
        System.out.println("The sub of a&b is "+p.sub());
        System.out.println("The product of a&b is "+p.mul());
        System.out.println("The division of a&b is "+p.div());

        Even a = new Even();
        a.even();

        Odd b = new Odd();
        b.odd();
        
    }
}
