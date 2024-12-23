class Rectangle{
    private double len;
    private double wid;
    void setArea(double len,double wid){
        this.len=len;
        this.wid=wid;
    }
    double getArea(){
        return len*wid;
    }
}
public class A5 {
    public static void main(String[] args) {
        Rectangle p=new Rectangle();
        p.setArea(2, 3);
        System.out.println(p.getArea());
    }
}
