// array :duplicate element stored :1,2,3,2,1,4,6,3,2,4 
// target :check duplicate element how much and which index

public class B10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,4,6,3,2,4};
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else if(j==arr.length-1){
                System.out.println("count of number " + "index value " +i +" " + arr[i] + " is " + count);
                }
            }
            
        }

    }
}
