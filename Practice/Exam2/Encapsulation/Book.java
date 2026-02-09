package Practice.Exam2.Encapsulation;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title=title;
        this.author=author;
        this.pages=pages;

    }
    @Override
    public String toString() {
        return ("Title: " + title + " Author: "+ author +" Pages: "+ pages );

    }

    public static void main(String[] args) {
        Book book1= new Book("The Art of the Deal", "Donald Trump", 128);
        Book book2=new Book("Lord of the Rings", "George Lucas", 21);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
    
}
