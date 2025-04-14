public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Road", "Cormac McCarthy", "2006", 15, 20);
        BookSeller bs1 = new BookSeller(1000, "Best Books");

        bs1.printAllBooks();

        bs1.addBook(b1);
        bs1.printAllBooks();
    }
}