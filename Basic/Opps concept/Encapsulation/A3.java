class Book {
    private double price;

     void setPrice(double price) {
        this.price = price;
    }

     double getPrice() {
        return price;
    }
}

public class A3 {
    public static void main(String[] args) {
        Book p = new Book();
        p.setPrice(456.67);
        System.out.println(p.getPrice());
    }
}
