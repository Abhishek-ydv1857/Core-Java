import java.util.*;
public class A9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you char :");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case ");
        }
        else{
            System.out.println("Lower case ");
        }
    }
}
