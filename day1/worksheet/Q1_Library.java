package day1.worksheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
    String title;
    String author;
    String isbn;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.isbn = "000-0-00-000000-0";
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void printDetails() {
        System.out.println("----- Book Details -----");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN  : " + isbn);
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to search by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.printDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.err.println("No book found with that title.");
        }
    }
}

public class Q1_Library {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add a Book");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();

                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchByTitle(searchTitle);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

}
