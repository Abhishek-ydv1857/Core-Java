

import java.util.Scanner;

class A{
    int add(int a , int b){
       
        int c = a+b;
        return c;
    }
    int sub(int a , int b){
       
        int c = a-b;
        return c;
    }
    int multi(int a , int b){
       
        int c = a*b;
        return c;
    }
    int div(int a , int b){

        int c = a/b;
        return c;
    }
}

class Even{
    int show(int a){
        if(a%2==0){
            System.out.println(a+ " is an even number ");
        }
        else{
            System.out.println(a+ " is an odd number ");
        }
        return a;
    }
}

class Odd{
    int show(int a){
        if(a%2!=0){
            System.out.println(a+ " is an odd number ");
        }
        else{
            System.out.println(a+ " is an even number ");
        }
        return a;
    }
}
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A p = new A();

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("The value of a&b is "+ p.add(a,b));



        System.out.print("Enter the value of a : ");
        int c = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int d = sc.nextInt();

        System.out.println("The value of a&b is "+ p.sub(c,d));



        System.out.print("Enter the value of a : ");
        int e = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int f = sc.nextInt();

        System.out.println("The value of a&b is "+ p.multi(e,f));



        System.out.print("Enter the value of a : ");
        int g = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int h = sc.nextInt();

        System.out.println("The value of a&b is "+ p.div(g,h));



        Even q = new Even();

        System.out.print("Enter number : ");
        int x = sc.nextInt();

        q.show(x);


        Odd w = new Odd();

        System.out.print("Enter number");
        int y = sc.nextInt();

        w.show(y);
    }
}