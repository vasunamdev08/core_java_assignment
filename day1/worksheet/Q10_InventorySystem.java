package day1.worksheet;

import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Display product details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: $" + price);
    }
}

class Store {
    private Product[] products;

    // Constructor that takes an array of products
    public Store(Product[] products) {
        this.products = products;
    }

    // Display all products
    public void displayAllProducts() {
        System.out.println("All Products:");
        for (Product p : products) {
            p.display();
        }
    }

    // Find product with highest price
    public Product getMostExpensiveProduct() {
        if (products.length == 0) return null;

        Product max = products[0];
        for (Product p : products) {
            if (p.getPrice() > max.getPrice()) {
                max = p;
            }
        }
        return max;
    }

    // Search product by name (case-insensitive)
    public void searchProductByName(String name) {
        boolean found = false;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Product found:");
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found with name: " + name);
        }
    }
}


public class Q10_InventorySystem {
    public static void main(String[] args) {
        Product[] productList = {
                new Product(1, "Laptop", 1200),
                new Product(2, "Phone", 800),
                new Product(3, "Headphones", 150),
                new Product(4, "Monitor", 300)
        };

        Store store = new Store(productList);

        store.displayAllProducts();
        Product expensive = store.getMostExpensiveProduct();
        System.out.println("\nMost Expensive Product:");
        if (expensive != null) expensive.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();
        store.searchProductByName(searchName);
    }
}
