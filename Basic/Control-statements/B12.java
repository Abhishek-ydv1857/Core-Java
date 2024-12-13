import java.util.Scanner;

public class B12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Retailer Name: ");
        String retailerName = scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Number of Pieces Purchased: ");
        int pieces = scanner.nextInt();

        System.out.print("Enter Price per Piece: ");
        double pricePerPiece = scanner.nextDouble();

        double totalAmount = pieces * pricePerPiece;
        double discount = 0;

        if (pieces >= 1 && pieces <= 15) {
            discount = 0.15; // 15% discount
        } else if (pieces >= 16 && pieces <= 30) {
            discount = 0.30; // 30% discount
        } else if (pieces >= 31 && pieces <= 50) {
            discount = 0.50; // 50% discount
        }

        double discountAmount = totalAmount * discount;
        double totalPayAmount = totalAmount - discountAmount;

        System.out.println("\nOutput:");
        System.out.println("Retailer Name: " + retailerName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Number of Pieces Purchased: " + pieces);
        System.out.println("Price per Piece: " + pricePerPiece);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Total Pay Amount: " + totalPayAmount);

        scanner.close();
    }
}
