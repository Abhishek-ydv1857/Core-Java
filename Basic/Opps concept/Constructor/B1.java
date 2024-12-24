class Book{
    String title;
    String author;
    void show(String title,String author){
        this.title=title;
        this.author=author;
        System.out.println(this.title);
        System.out.println(this.author);
    }
}
public class B1 {
    public static void main(String[] args){
        Book p=new Book();
        p.show("JAVA", "James Gosling");
    
    }
}
