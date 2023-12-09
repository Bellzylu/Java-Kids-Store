package view;

import model.Clothes;
import model.CreditCardDetails;
import model.Employee;
import model.MobilePayDetails;
import model.Product;
import model.ShoppingCart;
import model.Toy;
import model.User;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import controller.Menus;
import data.ProductDatabase;
import data.ReadAndWriteFiles;

public class UserInterface {

    ProductDatabase myProductDatabase = new ProductDatabase();
    Employee myEmployee = new Employee();
    Menus myMenus = new Menus();
    ViewMenu myViewMenu = new ViewMenu();
    Product myProduct = new Product();
    Clothes myClothes = new Clothes();
    Toy myToys = new Toy();
    ShoppingCart myShoppingCart = new ShoppingCart();
    Date date = new Date();
    User myUser = new User();

    public Scanner input = new Scanner(System.in);

    // Constructor
    public UserInterface() {
    }

    // Method for getting all customer details
    public void getAllCustomerDetails() {

        String firstname, lastname, cpr, phonenumber, address, postcode, dateOfbirth, username, password;
        // First name details
        // Check if it only contains letters
        System.out.println("\nFirst name:");
        firstname = input.next();
        while (!firstname.matches("^[a-zA-Z]*$")) {
            System.out.println("\nEnter letters only. Please try again:\n");
            firstname = input.next();

        }
        // Last name details
        // Check if it only contains letters
        System.out.println("\nLast name:");
        lastname = input.next();
        while (!lastname.matches("^[a-zA-Z]*$")) {
            System.out.println("\nEnter letters only. Please try again:\n");
            lastname = input.next();
        }
        // CPR number details
        // Check if the input contains the dash (-) at the correct position
        // Check if the length of the CPR number is 11 characters, including the dash
        System.out.println("\nCPR number (in the form of xxxxxx-xxxx):");
        cpr = input.next();
        while (!cpr.matches("\\d{6}-\\d{4}")) {
            System.out.println("\nPlease enter a valid CPR number, " +
                    "remember to use the - when you enter your number:");
            cpr = input.next();
        }
        // Phone number details
        // Check if the number is 8 digits
        System.out.println("\nPhone number:");
        phonenumber = input.next();
        while (!phonenumber.matches("\\d{8}")) {
            System.out.println("\nPlease enter a eight-digit danish phone number:");
            phonenumber = input.next();
        }
        // Address details
        // Check if the address only contains numbers and letters.
        // Specialized symbols like -&(%#$^). are not allowed
        System.out.println("\nAddress:");
        address = input.next();
        while (!address.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("\nIncorrect format. Please try again:");
            address = input.next();
        }
        // Postal code details
        // Prompt visitor to enter a four-digit postal code, and make sure it is four
        // digits
        System.out.println("\nPostal code (four digits):");
        postcode = input.next();
        while (!postcode.matches("\\d{4}")) {
            System.out.println("\nPlease enter a postal code of only four digits:");
            postcode = input.next();
        }
        // Date of birth details
        // Make sure it is digits only and correct format
        System.out.println("\nDate of birth (in the format DDMMYY):");
        dateOfbirth = input.next();
        if (dateOfbirth.matches(".*[a-zA-Z].*")) {
            System.out.println("\nYour date of birth can only consist of digits. Please try again:");
            dateOfbirth = input.next();
        }
        System.out.println("\nThank you. You are now registered at KidzWithUs!");
        System.out.println("----------------------------------------------------");
        System.out.println("\nYour login information is:");
        username = firstname.substring(0, 1).toUpperCase() + lastname.substring(0, 3);
        System.out.println("Username: " + username);
        password = lastname.substring(0, 3).toLowerCase() + cpr.substring(7, 11);
        System.out.println("Password: " + password);
        {
        }
        writeCustomerToFile(firstname, lastname, address, postcode, dateOfbirth, phonenumber, cpr, username, password);
    }

    // Method for getting all employee details
    public void getAllEmployeeDetails() {
        String id, firstname, lastname, cpr, username, password;

        // Employee ID details
        // Check if the ID is the same as in the system
        System.out.println("\nEmployeer ID (you will find your employeer ID on the pay slip):");
        id = input.next();
        while (!id.matches("12345")) {
            System.out.println("\nThat is not a valid ID-number. Please try again:\n");
            id = input.next();
        }

        // First name details
        // Check if it only contains letters
        System.out.println("\nFirst name:");
        firstname = input.next();
        while (!firstname.matches("^[a-zA-Z]*$")) {
            System.out.println("\nEnter letters only. Please try again:\n");
            firstname = input.next();
        }

        // Last name details
        // Check if it only contains letters
        System.out.println("\nLast name:");
        lastname = input.next();
        while (!lastname.matches("^[a-zA-Z]*$")) {
            System.out.println("\nEnter letters only. Please try again:\n");
            lastname = input.next();
        }

        // CPR number details
        // Check if the input contains the dash (-) at the correct position
        // Check if the length of the CPR number is 11 characters, including the dash
        System.out.println("\nCPR number (in the form of xxxxxx-xxxx):");
        cpr = input.next();
        while (!cpr.matches("\\d{6}-\\d{4}")) {
            System.out.println(
                    "\nPlease enter a valid CPR number, " + "remember to use the - when you enter your number:");
            cpr = input.next();
        }

        System.out.println("\nThank you. You are now registered as an employee at KidzWithUs!");
        System.out.println("----------------------------------------------------");
        System.out.println("\nYour login information is:");
        username = "ADMIN9867";
        System.out.println("Username: " + username);
        password = "sZ5q";
        System.out.println("Password: " + password);
    }

    // Method for customer to select desired product
    public void selectProduct() {
        System.out.println("\nWant to buy one of these products? Write the number of the product:");
        myProduct = myProductDatabase.getProduct(input.nextInt());
        myProduct.isAvailable = false;
        // Make an instance of the ShoppingCart class , name it shoppingCart
        ShoppingCart shoppingCart = new ShoppingCart("name", myProduct.getNumber(), myProduct.getPrice(),
                myProduct.getType());
        System.out.println("\nYou have chosen product " + myProduct.getType().toString() + " with price "
                + myProduct.getPrice() + " DKK!");
        // Call shoppingCart.AddProduct
        shoppingCart.addProduct(shoppingCart);
    }

    // Method for customer to proceed to payment or quit program
    public void proceedToPayement() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("- Type '1' to add one more product to shoppingcart");
        System.out.println("- Type '2' to delete one product from shoppingcart");
        System.out.println("- Type '3' to proceed to payment");
        System.out.println("- Type '4' to see all products in shoppingcart");
        System.out.println("- Type '5' to get back to the startmenu.");
        String userChoice = input.next();
        String choiceOne = "1";
        String choiceTwo = "2";
        String choiceThree = "3";
        String choiceFour = "4";
        String choiceFive = "5";
        if (userChoice.matches(choiceOne)) {
            myMenus.buyerMenu();
        }

        if (userChoice.matches(choiceTwo)) {
            System.out.println("\nYour shoppingcart contains the following items:");
            ShoppingCart.printShoppingList();
            System.out.println("Type the number of the item you want to delete for shoppingcart:");
            String deleteChoice = input.next();
            ShoppingCart.removeProduct(deleteChoice);
            proceedToPayement();
        }

        if (userChoice.matches(choiceThree)) {
            myMenus.paymentMenu();
        }

        if (userChoice.matches(choiceFour)) {
            System.out.println("\nYour shoppingcart contains the following items:");
            ShoppingCart.printShoppingList();
            proceedToPayement();
        }

        if (userChoice.matches(choiceFive)) {
            myMenus.welcomeMenu();
        }
    }

    // Confirmation to the user after buying a product
    public void printConfirmation() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\nThank you for shopping at KidzWithUs! And... HAPPY NEW YEAR <3\n");
        System.out.println("               _..--\"\"-.                 .-\"\"--.._ ");
        System.out.println("            _.-'        \\ __...----...__ /        '-._");
        System.out.println("              .' .:::...,'               ',...:::.    '.");
        System.out.println("       (    .'``'''::;                      ;::'''``'.   )");
        System.out.println("        \\            '-)                  (-'           /");
        System.out.println("         \\            /                    \\           /");
        System.out.println("          \\         .'.-.                .-.'.        /");
        System.out.println("           \\         | \\0|               |0/ |       /");
        System.out.println("           |          \\  |     .-==-.    |   /        |");
        System.out.println("            \\           `/`;            ;`\\`         /");
        System.out.println("              '.._       (_ |   .-==-.   | _)      _..'");
        System.out.println("                 `\"`\"-`/ `/'           '\\` \\`-\"`\"`");
        System.out.println("                       / /`;    .==.    ;`\\ \\");
        System.out.println("                 .---./_/  \\    .==.   /   \\ \\");
        System.out.println("                / '.    `-.__)          |  `\"");
        System.out.println("                | =(`-.        '==.     ;");
        System.out.println("                 \\ '. `-.              /");
        System.out.println("                  \\_:_)   `\"--.....-'");
    }

    // Receipt to the user after buying a product
    public void printReceipt() {

        // Make a random receipt number for the customer. 2000 is the maximum number and
        // the 1 is our minimum
        Random number = new Random();
        int receiptNumber = number.nextInt(2000) + 1;

        System.out.println("-------------------------------------------------------------");
        System.out.println("\nReceipt");
        System.out.println("You bought the following items:\n");
        ShoppingCart.printShoppingList();
        System.out.println("\nReceipt number: " + receiptNumber);
        System.out.println("Total amount: " + ShoppingCart.calculateTotalPrice() + " DKK");
        // Display time and date using toString()
        System.out.println("Date and time: " + date.toString());
    }

    // Method if the customer wants to pay with credit card
    public CreditCardDetails getAllCreditCardDetails() {
        System.out.println("\n ================== Pay with Credit Card ==================\n ");
        String inputCardPayment;
        CreditCardDetails card = new CreditCardDetails();

        System.out.println("Remember: ");
        System.out.println("- We only accept Mastercard and Discover Credit Cards");
        System.out.println("- Amount to pay: " + ShoppingCart.calculateTotalPrice() + " DKK\n");

        System.out.println("\nPlease enter your credit card number (16 digits):");
        inputCardPayment = input.next();
        while (!inputCardPayment.matches("\\d{16}")) {
            System.out.println("\nPlease enter a credit card number of 16 digits:");
            inputCardPayment = input.next();
        }
        card.setCardNumber(inputCardPayment);
        // | \\d{16}"))
        System.out.println("\nPlease enter the expire date of the credit card in format MM/YY:");
        inputCardPayment = input.next();
        while (!inputCardPayment.matches("\\d{2}/\\d{2}")) {
            System.out.println("\nPlease enter a expiry date in format MM/YY:");
            inputCardPayment = input.next();
        }
        card.setExpireDate(inputCardPayment);

        System.out.println("\nPlease enter the 3 digit CVC of your credit card:");
        inputCardPayment = input.next();
        while (!inputCardPayment.matches("\\d{3}")) {
            System.out.println("\nPlease enter a 3 digits CVC number:");
            inputCardPayment = input.next();
        }
        card.setCvcNumber(inputCardPayment);

        System.out.println("\nWe are processing your payment, please wait");
        System.out.print("\nLoading payment...");
        System.out.print("\nPayment is complete! You have payed " + ShoppingCart.calculateTotalPrice() + " DKK\n");

        return card;
    }

    // Method if the customer wants to pay with Mobilepay
    public MobilePayDetails getAllMobilepayDetails() {
        System.out.println("\n ================== Pay with Mobilepay ==================\n ");
        String inputMobilePayment;
        MobilePayDetails mobile = new MobilePayDetails();

        System.out.println("Remember: ");
        System.out.println("- We only accept danish Mobilepay");
        System.out.println("- Amount to pay: " + ShoppingCart.calculateTotalPrice() + " DKK\n");

        System.out.println("\nPlease enter your phone number:");
        inputMobilePayment = input.next();
        while (!inputMobilePayment.matches("\\d{8}")) {
            System.out.println("\nPlease enter a 8 digits danish phone number:");
            inputMobilePayment = input.next();
        }
        mobile.setPhoneNumber(inputMobilePayment);

        System.out.println("\nPlease enter the code that is on the screen of your phone (four digits):");
        inputMobilePayment = input.next();
        while (!inputMobilePayment.matches("\\d{4}")) {
            System.out.println("\nPlease enter a 4 digits code:");
            inputMobilePayment = input.next();
        }
        mobile.setCode(inputMobilePayment);

        System.out.println("\nWe are processing your payment, please wait");
        System.out.print("\nLoading payment...");
        System.out.print("\nPayment is complete! You have payed " + ShoppingCart.calculateTotalPrice() + " DKK\n");

        return mobile;
    }

    // Method if the customer wants to pay with cash
    public void cashPayment() {
        System.out.println("\n ================== Pay with Cash ==================\n ");
        System.out.println("Pick up the product at Solbjerg Pl.3 2000 Fredriksberg. Remember to bring cash.");
        System.out.println("Amount to pay: " + ShoppingCart.calculateTotalPrice() + "DKK");

        System.out.println("Call seller at phone number +45 678 25 277 to agree on the date and time for pick-up!");

    }

    // Method if the customer choose an invalid choice in the menu
    public void invalidChoice() {
        System.out.println("Sorry, you wrote an invalid choice!");
    }

    // Method if the customer wants to exit store in menu
    public void exitChoice() {
        System.out.println("You have chosen to exit the store. We wish you a good day!");
    }

    // Method if the customer do a choice the system does not support yet
    public void notSupportedChoice() {
        System.out.println(
                "We are sorry, we do not have this feature yet. We are working on developing the page further :-) ");
    }

    // Method that writes customer details to file
    public void writeCustomerToFile(String first, String last, String add, String post, String dob, String phone,
            String cpr, String user, String pass) {
        String customerDetails = first + ";" + last + ";" + add + ";" + post + ";" + dob + ";" + phone + ";" + cpr + ";"
                + user + ";" + pass;
        ;
        ReadAndWriteFiles.writeDetails("customer.txt", customerDetails);
    }
}