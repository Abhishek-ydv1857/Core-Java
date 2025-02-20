// string :10 input :fruits name 
// count :apple how much 

import java.util.Scanner;

public class B7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        String arr[]=new String[size];

        System.out.println("Enter your fruits name : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        String search= "apple";
        int count=0;
        System.out.println("output : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(search)){
                count++;
            }
            
        }
        System.out.print("how many times apple appear in array : " + count);
    }
}