package Practice.Exam2.Encapsulation;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title=title;
        this.author=author;
        this.pages=pages;}

    public Book(String title) {
        this.title=title;
        this.author="Joe Biden";
        this.pages=46;
    }
    
    public Book() {
        this.title="Dumb Book";
        this.author="Dumb Author";
        this.pages=0;}

    public void readPages(int pagesRead) {
        this.pages=this.pages-pagesRead;
    }

    
    @Override
    public String toString() {
        return ("Title: " + title + " Author: "+ author +" Pages: "+ pages );

    }

    public static void main(String[] args) {
        Book book1= new Book("The Art of the Deal", "Donald Trump", 128);
        Book book2=new Book("Lord of the Rings", "George Lucas", 21);
        Book book3=new Book();
        Book book4=new Book("My Presidency");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());

        book1.readPages(10);
        System.out.println(book1.toString());
    }
    
}
