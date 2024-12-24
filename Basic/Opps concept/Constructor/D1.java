class Car{
    String model;
    int year;
    void show(String model,int year){
        this.model=model;
        this.year=year;
    }
    void show(){
        System.out.println("Model " +model);
        System.out.println("Year " +year);
    }
}
public class D1 {
    public static void main(String[] args) {
        Car p=new Car();
        p.show("BMW", 2021);
        p.show();
    }
}
