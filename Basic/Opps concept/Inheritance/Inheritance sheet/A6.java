```java
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void teach() {
        System.out.println("Role: Teaching students.");
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void study() {
        System.out.println("Role: Studying and learning.");
    }
}

public class A6 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        teacher.displayName();
        teacher.teach();

        System.out.println();

        Student student = new Student("Emily Johnson");
        student.displayName();
        student.study();
    }
}
