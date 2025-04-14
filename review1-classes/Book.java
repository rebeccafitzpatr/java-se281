public class Book {
    private int costPrice;
    private int sellPrice;
    private int id;
    private String title;
    private String author;
    private String publicationYear;
    private boolean isSold;
    private static int nextId = 1;

    public Book(String title, String author, String publicationYear, int costPrice, int sellPrice) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.id = nextId;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.isSold = false;
        nextId++;
    }

    public void printBook() {
        System.out.println("Title: " + title + "\n" +
                            "Author: " + author + "\n" +
                            "Year: " + publicationYear + "\n" +
                            "Id: " + id + "\n" +
                            "Sell Price: " + sellPrice + " | Cost Price: " + costPrice + "\n"
                            );
    }
}