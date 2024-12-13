import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Bank Details: ");
        String bankDetails = scanner.nextLine();

        System.out.print("Enter Total Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Number of Holidays Taken: ");
        int holidays = scanner.nextInt();

        double allottedSalary = salary;

        if (holidays == 1) {
            allottedSalary = salary;
        } else if (holidays >= 2 && holidays <= 5) {
            allottedSalary = salary * 1.05; // 5% more
        } else if (holidays >= 6 && holidays <= 14) {
            allottedSalary = salary * 1.10; // 10% more
        } else if (holidays == 15) {
            allottedSalary = salary * 1.50; // 50% more
        } else {
            allottedSalary = 0; // No salary if holidays > 15
        }

        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Bank Details: " + bankDetails);
        System.out.println("Salary: " + salary);
        System.out.println("Allotted Salary: " + allottedSalary);
        System.out.println("Holidays Taken: " + holidays);

        scanner.close();
    }
}
