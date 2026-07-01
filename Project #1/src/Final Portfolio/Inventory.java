import java.util.ArrayList;
import java.util.Scanner;

// Inventory Class
public class Inventory {

    private ArrayList<Book> mainInventory;
    private ArrayList<Book> lendingInventory;

    // Constructor
    public Inventory() {
        // Chose ArrayList data structure.
        mainInventory = new ArrayList<>();
        //lendingInventory = new LinkedList<>();
        lendingInventory = new ArrayList<>();
        
    }

    // Add Book Method
    public void addBook(Book book) throws IllegalArgumentException {
        // Check if a book with the same ID already exists
        for (Book b : mainInventory) {
            if (b.getId() == book.getId()) {
                throw new IllegalArgumentException("A book with ID " + book.getId() + " already exists in the library.");
            }
        }
        for (Book b : lendingInventory) {
            if (b.getId() == book.getId()) {
                throw new IllegalArgumentException("A book with ID " + book.getId() + " already exists (currently borrowed).");
            }
        }
        mainInventory.add(book);
        System.out.println("Book added to the library.");
    }

    // borrowBook(); Method
    public void borrowBook(int id) {
        for (int i = 0; i < mainInventory.size(); i++) {
            if (mainInventory.get(i).getId() == id) {
                Book book = mainInventory.remove(i);
                lendingInventory.add(book);
                System.out.println("Book successfully borrowed.");
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    // returnBook(); Method
    public void returnBook(int id) {
        if (lendingInventory.isEmpty()) {
            System.out.println("No books are currently borrowed.");
            return;
        }

        for (int i = 0; i < lendingInventory.size(); i++) {
            if (lendingInventory.get(i).getId() == id) {
                Book book = lendingInventory.remove(i);
                mainInventory.add(book);
                System.out.println("Book successfully returned.");
                return;
            }
        }
        System.out.println("Book not found in the lending list.");
    }

    // printAll(); Method
    public void printAll() {
        if (mainInventory.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n===== All Available Books =====");
        for (Book book : mainInventory) {
            book.printBookInfo();
        }
    }

    // SeachByTitle Method
    public void searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<>();

        for (Book book : mainInventory) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }

        if (results.isEmpty()) {
            System.out.println("No matching book found.");
        } else {
            System.out.println("\n===== Search Results =====");
            for (Book book : results) {
                book.printBookInfo();
            }
        }
    }

    // GetMainInventoryCount Helper function
    public int getMainInventoryCount() {
        return mainInventory.size();
    }

    // current number of books lent out.
    public int getLendingInventoryCount() {
        return lendingInventory.size();
    }
}
