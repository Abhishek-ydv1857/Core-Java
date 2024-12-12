import java.util.*;
class A6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive integer");
        }
        else if(num<0){
            System.out.println("Negative Integer");
        }
        else{
            System.out.println("number is zero");
        }
    }
}