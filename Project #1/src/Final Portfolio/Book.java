import java.util.Scanner;
//Book Class
public class Book {

    private int id;
    private String title;
    private String author;
    //private int isbn;
    private String isbn;
    private int numOfPages;

    // Book default constructor
    public Book() {
        this.id = 0;
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.numOfPages = 0;
    }

    // Parameterized constructor with 5 paramaters.
    public Book(int id, String title, String author, String isbn, int numOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // public int getIsbn() {
    //     return isbn;
    // }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnumOfPages() {
        return numOfPages;
    }

    public void setnumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    //method printBookInfo();
    public void printBookInfo() {
        System.out.println("---------------------------");
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pages: " + numOfPages);
        System.out.println("---------------------------");
    }
}
