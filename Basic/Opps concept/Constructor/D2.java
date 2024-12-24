class Animal{
    String name;
    String species;
    Animal(String name,String species){
        this.name=name;
        this.species=species;
    }
    void display(){
        System.out.println("Name "+ name);
        System.out.println("Species " +species);
    }
}
public class D2 {
    public static void main(String[] args) {
        Animal p=new Animal("Eagal", "Bird");
        p.display();;
    }
}
