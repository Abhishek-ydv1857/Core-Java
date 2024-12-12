import java.util.*;
public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your char ");
        char ch = sc.next().charAt(0);
        if(ch=='m'){
            System.out.println("male");
        }
        else if(ch=='f'){
            System.out.println("Female");
        }
        else{
            System.out.println("invalid");
        }
        }
}
