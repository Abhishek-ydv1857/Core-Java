class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Length "+length);
        System.out.println("Breadth "+breadth);
    }
    void display(){
        System.out.println(length);
        System.out.println(breadth);
    }
}
public class D5 {
    public static void main(String[] args) {
        new Rectangle(10,4);
    }
}
