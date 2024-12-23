class Empolyee{
    private double sal;
    void setSal(double sal){
        if(sal<0){
            this.sal=0;
        }
        else{
            this.sal=sal;
        }
    }
    double getSal(){
        return sal;
    }
}
public class A4 {
    public static void main(String[] args){
        Empolyee p=new Empolyee();
        p.setSal(-10000);
        System.out.println(p.getSal());
        p.setSal(10000);
        System.out.println(p.getSal());
    }
}
