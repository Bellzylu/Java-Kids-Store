package data;

import model.Toy;
import model.Product;
import model.Clothes;
import java.util.ArrayList;

public class ProductDatabase {

    // Arraylist of type Product
    public static ArrayList<Product> products = new ArrayList<>();

    public ProductDatabase() {

        // int number, double price, String type, String color, String brand, boolean
        // isAvailable, String size
        products.add(new Clothes(0, 89, "Sweather", "Blue", "H&M", false, "122-128"));
        products.add(new Clothes(1, 99, "Sweather", "Rose-Red", "Zara", true, "104-110"));
        products.add(new Clothes(2, 70, "Sweather", "Pink", "Molo", true, "110-116"));
        products.add(new Clothes(3, 49, "Sweather", "Green", "Ralph Lauren", true, "158-164"));
        products.add(new Clothes(4, 99, "Pants", "Blue", "Ralph Lauren", true, "104-110"));
        products.add(new Clothes(5, 40, "Pants", "Yellow-neon", "H&M", true, "122-128"));
        products.add(new Clothes(6, 29, "T-skirt", "Green", "Molo", true, "116-122"));
        products.add(new Clothes(7, 29, "T-skirt", "Purple", "Ralph Lauren", true, "104-110"));
        products.add(new Clothes(8, 70, "Dress", "Red", "Molo", true, "158-164"));
        products.add(new Clothes(9, 49, "Dress", "Organge", "H&M", true, "122-128"));
        products.add(new Clothes(10, 79, "Skirt", "Blue", "Zara", true, "116-122"));
        products.add(new Clothes(11, 39, "Skirt", "Pink", "H&M", true, "104-110"));
        products.add(new Toy(12, 29, "Board game", "Funskool Monopoly Deal Card Game", true, "7"));
        products.add(new Toy(13, 60, "Lego", "Lego High Speed Chase, Multi Color", true, "5"));
        products.add(new Toy(14, 30, "Outdoor toys", "Jumbo beach set", true, "1"));
        products.add(
                new Toy(15, 40, "Ball games",
                        "Planet Of Toys Pro Football Soccer Game With Foam Bumper", true, "3"));
        products.add(new Toy(16, 29, "Outdoor toys",
                "Intex Inflatable See Me Sit Pool Ride, 18Multi Color", true, "3"));
        products.add(new Toy(17, 99, "Stuffed animals", "Ultra Soft Love Cushion Pillow - Dog, Beige", true, "0"));
        products.add(new Toy(18, 79, "Outdoor toys", "Wood O Plast Dart Board Set, Multi Color (14-inch)", true, "13"));
        products.add(new Toy(19, 60, "Stuffed animals", "Starwalk Cherry Plush Doll, Violet (55cm)", true, "0"));
        products.add(
                new Toy(20, 50, "Ball games", "HRS Tournament Rubber Moulded Official Basketball - Size 7", true, "7"));
        products.add(
                new Toy(21, 50, "Stuffed animal", "Flipzon Flashing Dancing Duck with Sounds, Glowing Hands", true,
                        "0"));
    }

    // Method that returns the list products
    public ArrayList<Product> getDatabase() {
        return products;
    }

    // Method that returns an object of type Product
    public Product getProduct(int i) {
        Product myProduct = getDatabase().get(i);
        return myProduct;
    }

    // Formatted printing of clothes
    public static void printClothes() {
        System.out.printf(" | %-2s | %-8s | %-10s | %-14s | %-15s | %-12s |\n",
                "NUMBER", "PRICE", "TYPE",
                "COLOR", "BRAND", "SIZE");
        // Creating an Object and going through the whole ArrayList for each object in
        // database
        for (Object myClothes : products) {
            if (myClothes instanceof Clothes) {
                Clothes theseClothes = (Clothes) myClothes; // Changing to type Clothes
                if (theseClothes.getIsAvailable()) { // If true, then it is printed out.
                    System.out.printf(" | %-6s | %-8s | %-10s | %-14s | %-15s | %-8s |\n",
                            theseClothes.getNumber(), theseClothes.getPrice() + " DKK", theseClothes.getType(),
                            theseClothes.getColor(), theseClothes.getBrand(), theseClothes.getSize() + " cm ");
                }
            }
        }
    }

    // Formatted printing of toys
    public static void printToys() {
        System.out.printf(" | %-1s | %-9s | %-21s | %-61s | %-10s |\n",
                "NUMBER", " PRICE", " TYPE",
                " NAME", "AGE");
        // Creating an Object and going through the whole ArrayList for each object in
        // database
        for (Object myToys : products) {
            if (myToys instanceof Toy) {
                Toy theseToys = (Toy) myToys; // Changing to type Toy
                if (theseToys.getIsAvailable()) { // If true, then it is printed out.
                    System.out.printf(" | %-6s | %-8s | %-20s | %-60s | %-10s |\n",
                            theseToys.getNumber(), theseToys.getPrice() + " DKK", theseToys.getType(),
                            theseToys.getName(), theseToys.getAge() + "+ years ");
                }
            }
        }
    }
}
