
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Ebook extends Book {
    double fileSize;

    public Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("File Size: " + fileSize + " MB");
    }

    public void readEbook() {
        System.out.println("Reading the ebook on a device.");
    }
}

class PrintedBook extends Book {
    int numberOfPages;

    public PrintedBook(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Number of Pages: " + numberOfPages);
    }

    public void readPrintedBook() {
        System.out.println("Reading the printed book.");
    }
}

public class B3 {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Java Programming", "John Doe", 5.2);
        ebook.showDetails();
        ebook.readEbook();

        System.out.println();

        PrintedBook printedBook = new PrintedBook("Effective Java", "Joshua Bloch", 416);
        printedBook.showDetails();
        printedBook.readPrintedBook();
    }
}

