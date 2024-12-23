class Account{
    private String accountno;
    private double balance;

    public void setBalance(double balance){
       if(balance<0){
        this.balance=0;
       }
       else{
        this.balance=balance;
       }
    }
       public double getBalance(){
        return balance;
         }
       public void setAccountno(String accountno){
        this.accountno=accountno;
       }  
       public String getAccountno(){
        return accountno;
       }

}
public class A7 {
    public static void main(String[] args) {
        Account p=new Account();
        p.setAccountno("Abhishek001");
        p.setBalance(459494.58);
        System.out.println(p.getAccountno());
        System.out.println(p.getBalance());
    }
}
