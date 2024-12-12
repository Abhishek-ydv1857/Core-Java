
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter c for celsius or f for fahrenheit :");
        char ch = sc.next().charAt(0);

        if(ch == 'c'){
            Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        }
        else if(ch=='f'){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
    
            double celsius = (5.0 / 9) * (fahrenheit - 32);
            System.out.println("Temperature in Celsius: " + celsius + "°C");
    
        }
        else {
            System.out.println("Invalid entry");
        }
    }
}
