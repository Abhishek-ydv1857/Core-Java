import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your number :"); 
       int n=sc.nextInt();
       int count=0;
       int a =2;
       while(n>a){
        if(n%a==0){
            count++;
        }
        a++;
       }
       if(count==0){
        System.out.println("Prime");
       }
       else {
        System.out.println("Not");
       }
    }
      
}
