package model;

public class Product {

    // Variables
    public int number;
    public double price;
    public String type;
    public boolean isAvailable;

    // Empty constructor
    public Product() {
    }

    // Constructor with information
    public Product(int number, double price, String type, boolean isAvailable) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    // ToString method. Get a product to string
    public String toString() {
        return "Number: " + number + ", price: " + price + ", type: " + type;
    }
}