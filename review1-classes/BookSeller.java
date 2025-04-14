import java.util.ArrayList;

public class BookSeller {
    private ArrayList<Book> books = new ArrayList<Book> ();

    private int cashBalance;

    private String shopName;

    public BookSeller(int cashBalance, String shopName) {
        this.cashBalance = cashBalance;
        this.shopName = shopName;

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllBooks() {
        if (books.size() > 0) {
            for (Book book : books) {
                book.printBook();
            }
            return;
        } 

        System.out.println("No books in store");

    }
}