// array :character type :check vowel 

public class A18{
    public static void main(String[] args) {
        char ch[]={'a','b','f','i','j','p','o'};
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                System.out.print( ch[i] +" ");
                
            }
        }
    }
}