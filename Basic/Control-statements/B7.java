import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the Roll Number of the student: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Father's name: ");
        String fname = scanner.nextLine();

        System.out.print("Mother's name: ");
        String mname = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Contact: ");
        String contact = scanner.nextLine();

        System.out.print("Input the marks of Physics, Chemistry and Computer Application: ");
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int computer = scanner.nextInt();

        int total = physics + chemistry + computer;
        double percentage = (total / 3.0);
        String division;

        if (percentage >= 60) {
            division = "First";
        } else if (percentage >= 50) {
            division = "Second";
        } else if (percentage >= 40) {
            division = "Third";
        } else {
            division = "Fail";
        }

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fname);
        System.out.println("Mother's Name: " + mname);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);

        System.out.println("\n--- Marks and Result ---");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Computer Application: " + computer);
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Division: " + division);

        scanner.close();
    }
}
