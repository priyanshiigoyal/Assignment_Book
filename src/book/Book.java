package book;

public class Book {
    private String b_name, author, isbn;

    Book(String nam, String auth, String ISBN) {
        this.b_name = nam;
        this.author = auth;
        this.isbn = ISBN;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "-----------------------------\n" +
                "Book Name:\t" + b_name +
                "\nAuthor Name:\t" + author +
                "\nISBN:\t" + isbn +
                "\n-----------------------------";
    }
}
