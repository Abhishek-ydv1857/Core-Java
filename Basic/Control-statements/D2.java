import java.util.*;
public class D2 {
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter you gender :");
       String Gender = sc.nextLine();
       switch(Gender){
        case "male" : System.out.println("Male");
        break;
        case "female" : System.out.println("Female");
        break;
        default : System.out.println("Invalid");
       }
    }
}
