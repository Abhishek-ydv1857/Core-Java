class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Title: " + title);
    }
}

public class D3 {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby");
        book.displayTitle();
    }
}
