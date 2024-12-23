class Student{
    private String name;
    private double marks;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setMarks(double marks){
        if(marks<=0 && marks>100){
            this.marks=0;
        }
        else{
            this.marks=marks;
        }
    }
    double getMarks(){
        return marks;
    }
}
public class A8 {
    public static void main(String[] args){
        Student p=new Student();
        p.setName("Abhishek");
        p.setMarks(57);
        System.out.println(p.getName());
        System.out.println(p.getMarks());
        System.out.println();
        p.setName("Abhishek");
        p.setMarks(104);
        System.out.println(p.getName());
        System.out.println(p.getMarks());
    }
}
