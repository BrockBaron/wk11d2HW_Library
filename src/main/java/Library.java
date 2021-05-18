import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(int capacity){
        this.bookStock = new ArrayList<>();
        this.capacity = capacity;
    }


    public ArrayList<Book> getBookCount(){
        return bookStock;
    }

    public int BookStock() {
        return this.bookStock.size();
    }
}
