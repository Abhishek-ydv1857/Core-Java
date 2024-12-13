import java.util.*;
public class D1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your day :");
        int day = sc.nextInt();
        switch(day){
            case 1 : System.out.println("Monday");
            break;
        
            case 2 : System.out.println("Tuesday");
            break;

            case 3 : System.out.println("Wednesday");
            break;

            default: System.out.println("Invaild");
        }
    }

}
