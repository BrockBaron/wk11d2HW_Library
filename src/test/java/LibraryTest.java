import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("Jurassic Park", "Michael Crichton", "Sci-fi");
        book1 = new Book("Martian Chronicles", "Ray Bradbury", "Sci-fi");
        book2 = new Book("Black Box Thinking", "Matthew Syed", "Self-help");
        book3 = new Book("Dune", "Frank Herbert", "Sci-fi");
        book4 = new Book("Howl's Moving Castle", "Diana Wynne Jones", "Fantasy");

    }

    @Test
    public void booksCountStartsAt0() {
        assertEquals(0, library.getBookStock());
    }

    @Test
    public void canAddBookToStock() {
        library.addBookToStock(book);
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        library.addBookToStock(book4);
        assertEquals(4, library.getBookStock());
    }
}
