import java.util.Scanner;
class A14
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Number is even");
        }
        else 
        {
            System.out.println("Invalid");
        }
    }
}