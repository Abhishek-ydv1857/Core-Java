public class B3 {
    public static void main(String[] args){
        int n = 153;
        int temp=n;
        int rem,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }
}
