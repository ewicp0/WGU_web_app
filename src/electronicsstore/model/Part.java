package electronicsstore.models;

public class Part {
    private int id;
    private String name;
    private int stock;
    private double price;
    private int minInventory;
    private int maxInventory;

    public Part(int id, String name, int stock, double price, int minInventory, int maxInventory) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.minInventory = minInventory;
        this.maxInventory = maxInventory;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getMinInventory() {
        return minInventory;
    }

    public int getMaxInventory() {
        return maxInventory;
    }
}
