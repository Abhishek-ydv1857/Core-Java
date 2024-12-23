class Student {
    private int marks = 0;

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }

}

public class A10 {
    public static void main(String[] args) {
        Student p = new Student();

        System.out.println("Default Marks: " + p.getMarks());

        p.setMarks(85);
        System.out.println("Updated Marks: " + p.getMarks());

    }
}
