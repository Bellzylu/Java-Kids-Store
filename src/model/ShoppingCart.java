package model;

import java.util.ArrayList;

public class ShoppingCart {

    // Arraylist created to hold ShoppingCart items
    public static ArrayList<ShoppingCart> shoppingCartList = new ArrayList<ShoppingCart>();

    // Variables
    public String name, productType;
    public int number;
    public double price;

    // Empty constructor
    public ShoppingCart() {
    }

    // Constructor with information
    public ShoppingCart(String name, int number, double price, String productType) {
        this.name = name;
        this.number = number;
        this.price = price;
        this.productType = productType;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    // ToString method. Return a string with the information about the item
    public String shoppingcartToString() {
        return getName() + getNumber() + getPrice();
    }

    // Adds a product to the shopping cart
    public boolean addProduct(ShoppingCart shoppingCart) {
        shoppingCartList.add(shoppingCart);
        System.out.println("\nYour shoppingcart contains the following items:");
        printShoppingList();
        return true;
    }

    // Delete a product from the shopping cart
    public static boolean removeProduct(String deleteChoice) {
        for (int i = 0; i < shoppingCartList.size(); i++) {
            ShoppingCart tempItem = shoppingCartList.get(i);
            if (tempItem.number == Integer.parseInt(deleteChoice)) {
                int indexOfObject = shoppingCartList.indexOf(tempItem);
                shoppingCartList.remove(indexOfObject);
            }
        }

        System.out.println("\nYour shoppingcart contains the following items:");
        printShoppingList();
        return true;
    }

    // Calculate total price of products added in ShoppingCart
    // Adds every price to the totalPrice
    public static double calculateTotalPrice() {
        double totalPrice = 0;
        double pricetemp = 0;

        for (int i = 0; i < shoppingCartList.size(); i++) {
            pricetemp = shoppingCartList.get(i).getPrice();
            totalPrice += pricetemp;
        }
        return totalPrice;
    }

    // Method for printing shopping cart to customer with all the products the
    // customer has chosen
    public static void printShoppingList() {
        if (shoppingCartList.size() > 0) {
            for (int i = 0; i < shoppingCartList.size(); i++) {
                System.out.println("Product number: " + shoppingCartList.get(i).number + " |" + " Type: " +
                        shoppingCartList.get(i).productType +
                        " |" + " Price: " + shoppingCartList.get(i).price + " DKK");
            }
        }
    }
}
