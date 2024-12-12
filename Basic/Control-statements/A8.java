import java.util.*;
class A8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        if(num%5==0 || num%11==0){
            System.out.println("number is divisible either 5 or 11");
        }
        else if(num%5==0 && num%11==0){
            System.out.println("number is divisible by both 5 or 11");
        }
        else{
            System.out.println("not divisible by 5 or 11.");
        }
    }
}