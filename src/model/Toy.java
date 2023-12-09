package model;

public class Toy extends Product {

    // Variables
    String age, name;

    // Empty constructor
    public Toy() {
    }

    // Constructor with information including super type from Product
    public Toy(int number, double price, String type, String name, boolean isAvailable, String age) {
        super(number, price, type, isAvailable);
        this.age = age;
        this.name = name;
    }

    // Getters
    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Tostring method. Get a toy to string
    // @Override annotation to tell the compiler to validate that we are overriding
    // the superclass method product toString
    @Override
    public String toString() {
        return super.toString() +
                "Manufacturer's minimum suggested age: " + age +
                ", name: " + name +
                ", number: " + number +
                ", price in DKK: " + price +
                ", type: " + type;
    }
}
