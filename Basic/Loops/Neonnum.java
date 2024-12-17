public class Neonnum {
    public static void main(String[] args){
        int n = 9;
        int temp=n;
        int sq=n*n;
        int sum=0;
        while(sq>0){
         sum=sum+sq%10;
         sq=sq/10;
        }
        if(temp == sum ){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not");
        }
        }
    }

