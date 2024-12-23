class Person{
    private int age;
    private String name;
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
public class A1{
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(19);
        p.setName("Abhishek");
        System.out.println("Age: "+p.getAge());
        System.out.println("Name: "+p.getName());
        
    }
}