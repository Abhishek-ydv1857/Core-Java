class Student{
    private int id;
    private String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    int getId(){
        return id;
    }
    
    String getName(){
        return name;
    }
    
}
public class A2 {
   public static void main(String[] args) {
    int id=12;
    String name="hello";
    Student p=new Student( id, name);
    System.out.println(p.getId()+" "+p.getName());
   } 
}
