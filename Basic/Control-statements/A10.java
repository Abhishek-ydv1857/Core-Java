import java.util.*;
class A10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        if(num%7==0 || num%3==0){
            System.out.println("number is divisible either 7 or 3");
        }
        else if(num%7==0 && num%3==0){
            System.out.println("number is divisible by both 7 or 3");
        }
        else{
            System.out.println("not divisible by 3 or 7.");
        }
    }
}