public class Pallindrome {
    public static void main(String[] args){
        int n = 12321;
        int temp=n;
        int rem,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}