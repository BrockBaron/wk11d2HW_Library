import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Jurassic Park", "Michael Crichton", "Sci-fi");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Jurassic Park", book.getBookTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Michael Crichton", book.getBookAuthor());
    }

}
