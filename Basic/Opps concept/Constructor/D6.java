class Person {
    String name;
    int age;
     Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
    
}
public class D6 {
    public static void main(String[] args) {
        Person p=new Person("Abhishek", 21);
        p.display();
    }
}
