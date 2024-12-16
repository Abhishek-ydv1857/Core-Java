import java.util.*;
public class A12 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Starting point :");
     int i=sc.nextInt();
     System.out.println("Ending point");
     int j=sc.nextInt();
     int sum=0;
     while(i<=j){
          sum=sum+i;
          i++;
    } 
      
      System.out.println(sum);
 }
}