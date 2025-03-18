abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }

    void display() {
        System.out.println("Printed Book: " + title + " by " + author);
    }
}

class Ebook extends Book {
    public Ebook(String title, String author) {
        super(title, author);
    }

    void display() {
        System.out.println("E-Book: " + title + " by " + author);
    }
}

class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }

    void display() {
        System.out.println("Audio Book: " + title + " by " + author);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Book book1 = new PrintedBook("Java Basics", "John Doe");
        Book book2 = new Ebook("Python Guide", "Jane Smith");
        Book book3 = new AudioBook("C++ for Beginners", "Robert Brown");

        book1.display();
        book2.display();
        book3.display();
    }
}
