package electronicsstore.models;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;  // Track product stock
    private List<Part> parts;  // List of parts that belong to the product

    public Product(int id, String name, double price, int stock, List<Part> parts) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.parts = parts;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Part> getParts() {
        return parts;
    }
}
