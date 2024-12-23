class Person{
    private int age;
    void setAge(int age){
        if(age>0 && age<=130){
            this.age=age;
        }
        else{
            this.age=0;
        }
    }
    int getAge(){
        return age;
    }
}
public class A9{
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(140);
        System.out.println(p.getAge());
    }
}