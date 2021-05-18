import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(int capacity){
        this.bookStock = new ArrayList<>();
        this.capacity = capacity;
    }


    public int getBookStock() {
        return this.bookStock.size();
    }


    public void addBookToStock(Book book) {
        if(getBookStock() < this.capacity){
            bookStock.add(book);
        }
    }

    HashMap<String, String> bookCountByGenre = new HashMap<String, String>();



}
