class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Ebook extends Book {
    private double fileSize;

    public Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public void showFileSize() {
        System.out.println("File size: " + fileSize + " MB");
    }
}

class PrintedBook extends Book {
    private int totalPages;

    public PrintedBook(String title, String author, int totalPages) {
        super(title, author);
        this.totalPages = totalPages;
    }

    public void showTotalPages() {
        System.out.println("Total pages: " + totalPages);
    }
}

public class A5 {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Digital Fortress", "Dan Brown", 1.5);
        ebook.displayInfo();
        ebook.showFileSize();

        System.out.println();

        PrintedBook printedBook = new PrintedBook("The Alchemist", "Paulo Coelho", 208);
        printedBook.displayInfo();
        printedBook.showTotalPages();
    }
}
