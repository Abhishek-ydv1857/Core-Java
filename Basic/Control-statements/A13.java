import java.util.Scanner;
class A13
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Sunday");
        }
        else if(n==2)
        {
            System.out.println("Monday");
        }
        else if(n==3)
        {
            System.out.println("tuesday");
        }
        else if(n==4)
        {
            System.out.println("Wednesday");
        }
        else if(n==5)
        {
            System.out.println("Thrusday");
        }
        else if(n==6)
        {
            System.out.println("Friday");
        }
        else if(n==7)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
}

