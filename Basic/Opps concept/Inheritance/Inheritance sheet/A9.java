class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public void work() {
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Role: Working on assigned tasks.");
    }
}

class Student extends Person {
    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    public void study() {
        System.out.println("Course: " + course);
        System.out.println("Role: Attending classes and studying.");
    }
}

public class A9 {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice Brown", "Software Engineer");
        employee.displayName();
        employee.work();

        System.out.println();

        Student student = new Student("John Doe", "Computer Science");
        student.displayName();
        student.study();
    }
}
