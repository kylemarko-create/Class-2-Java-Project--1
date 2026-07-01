// PLEASE LAUNCH THIS FUNCTION TO START, LibrarySystem.java is the launch point to all other functions in this assignment.
import java.util.Scanner;

// Main Initalization UI function.
public class LibrarySystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        boolean running = true;

        System.out.println("Welcome to my Portfolio Final Project!");

        while (running) {
            System.out.println("\n========== Library Menu ==========");

            System.out.println("1. Add Book       2. Borrow Book");
            System.out.println("3. Return Book    4. Search by Title");
            System.out.println("5. Print All Books  6. Exit");

            System.out.println("==================================");
            System.out.print("Enter a number: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        addBook(scanner, inventory);
                        break;
                    case 2:
                        borrowBook(scanner, inventory);
                        break;
                    case 3:
                        returnBook(scanner, inventory);
                        break;
                    case 4:
                        searchByTitle(scanner, inventory);
                        break;
                    case 5:
                        inventory.printAll();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Exiting.");
                        break;
                    default:
                        System.out.println("Invalid input. Please enter a number between 1 and 6.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }

    // User info prompt and library info adder.
    private static void addBook(Scanner scanner, Inventory inventory) {
        try {
            System.out.print("Enter Book ID: ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter Title: ");
            String title = scanner.nextLine().trim();

            System.out.print("Enter Author: ");
            String author = scanner.nextLine().trim();

            System.out.print("Enter ISBN Number: ");
            String isbn = scanner.nextLine().trim();

            System.out.print("Enter Number of Pages: ");
            int pages = Integer.parseInt(scanner.nextLine().trim());

            Book newBook = new Book(id, title, author, isbn, pages);
            inventory.addBook(newBook);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Book ID and Number of Pages must be numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Borrow Prompt
    private static void borrowBook(Scanner scanner, Inventory inventory) {
        try {
            System.out.print("Enter the Book ID to borrow: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            inventory.borrowBook(id);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric Book ID.");
        }
    }

    // Return Prompt
    private static void returnBook(Scanner scanner, Inventory inventory) {
        try {
            System.out.print("Enter the Book ID to return: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            inventory.returnBook(id);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric Book ID.");
        }
    }

    // Inventory Search
    private static void searchByTitle(Scanner scanner, Inventory inventory) {
        System.out.print("Enter a book title (or partial title) to search: ");
        String title = scanner.nextLine().trim();

        if (title.isEmpty()) {
            System.out.println("title cannot be empty.");
        } else {
            inventory.searchByTitle(title);
            //return;
        }
    }
}
