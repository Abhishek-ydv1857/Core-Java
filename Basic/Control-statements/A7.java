import java.util.*;
class A7 {
    public static void main(String [] args){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character :");
        ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("character is vowel");
        }
        else {
            System.out.println("character is consonant");
        }

    }
}