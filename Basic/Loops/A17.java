import java.util.*;
public class A17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i =1;
        while(i<=100){
            if(i%3==0 || i%7==0){
                System.out.println(i);
            }
            i++;
        }
    }
}