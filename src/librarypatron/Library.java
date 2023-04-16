package librarypatron;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book findBook(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void addPatron(Patron patron) {
        this.patrons.add(patron);
    }
    
}

