package model;

public class Clothes extends Product {

    // Variables
    String size, color, brand;

    // Empty constructor
    public Clothes() {
    }

    // Constructor with information including super type from Product
    public Clothes(int number, double price, String type, String color, String brand, boolean isAvailable,
            String size) {
        super(number, price, type, isAvailable);
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    // Getters
    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    // Setters
    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Tostring method. Get a clothing to string
    // @Override annotation to tell the compiler to validate that we are overriding
    // the superclass method product toString
    @Override
    public String toString() {
        return super.toString() + "Size: " + size +
                ", color: " + color +
                ", brand: " + brand +
                ", number: " + number +
                ", price:" + price +
                ", type:" + type;
    }
}