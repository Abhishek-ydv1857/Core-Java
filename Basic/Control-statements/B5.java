import java.util.*;
public class B5 {
    public static void main(String [] args){
        System.out.println("enter your three subject marks :");
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int percentage ;
        percentage = (marks1+marks2+marks3/300)*100;
        if(percentage>25){
            System.out.println(percentage+"% F grade");
        }
        else if(percentage>45 && percentage<25){
            System.out.println(percentage+"% E grade");
        }
        else if(percentage>60 && percentage<45){
            System.out.println(percentage+"%  C grade");
        }
        else if(percentage>80 && percentage<60){
            System.out.println(percentage+"%  B grade");
        }
        else if(percentage>100 && percentage<80){
            System.out.println(percentage+"%  C grade");
        }
        else {
            System.out.println("Invalid ");
        }
    }
}