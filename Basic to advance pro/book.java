abstract class Book {

    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    abstract void read();
}

class JavaBook extends Book {

    JavaBook(String title, String author) {
        super(title, author);
    }

    @Override
    void read() {
        System.out.println("Reading Java book: " + getTitle());
    }
}

class Library {

    void issueBook(Book book) {
        System.out.println("Book issued: " + book.getTitle());
        book.read();
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Book book = new JavaBook(
                "Effective Java",
                "Joshua Bloch"
        );

        Library library = new Library();

        library.issueBook(book);
    }
}