package view;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ViewMenu {
    // Create scanner to source and scan the user Input
    public Scanner input = new Scanner(System.in);

    // Create a Welcome menu to be display when user enters the system
    // We want the method to return an int, since we want the user to navigate
    // through
    // the menu by pressing numbers as options. Yes, we are doing this very Java and
    // very old school

    public int startViewMenu() {
        try {

            System.out.println("-------------------------------------------------------------");
            System.out.println(" ");
            System.out.println(" ------- WELCOME TO THE STORE KIDZ WITH US -------\n ");
            System.out.println("                .___  .--. ");
            System.out.println("          .--.-\"   \"-' .- |");
            System.out.println("         / .-,` .        .'");
            System.out.println("         \\ `              \\");
            System.out.println("           '.           !  \\");
            System.out.println("             |    !   .--. |");
            System.out.println("             \\       '--' /.____");
            System.out.println("            /`-.    \\__,'.'     `\\");
            System.out.println("           / \\`-.____.-' `\\      /");
            System.out.println("           `---`'-'._/-`   \\----'    _");
            System.out.println("           ,-'` /           |    _.-' `\\");
            System.out.println("         .'    /            |--'` .   / |");
            System.out.println("        /     /\\            `         | |");
            System.out.println("        |   .\\/ \\     .--. __         \\ |");
            System.out.println("         '-'     '._      /  `\\        /");
            System.out.println("                    `\\    '    |------'`");
            System.out.println("                      \\  |     |");
            System.out.println("                       \\       /");
            System.out.println("                        '._ _.'");
            System.out.println("                             ``\n");
            System.out.println(" KidzWithUs is an online store where you can sell ");
            System.out.println(" and buy used children clothes and toys!\n ");
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter your choice:\n ");
            System.out.println(" 1. Register as a new user ");
            System.out.println(" 2. Register as a employee ");
            System.out.println(" 3. Login as a customer or seller ");
            System.out.println(" 4. Exit the store ");
            System.out.println("-------------------------------------------------------------");

        } catch (InputMismatchException ex2) {

            System.out.println("\n >> Please enter an integer to choose a menu option (1,2,3). ");

        }
        int userMenuChoice = input.nextInt();
        return userMenuChoice;
    }

    // Menu for choosing to Sell or Buy.
    public int sellerOrBuyerViewMenu() {
        try {
            System.out.println(" ");
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter your choice:\n ");
            System.out.println(" 1. Sell toys and clothes ");
            System.out.println(" 2. Buy toys and clothes ");
            System.out.println(" 3. Exit the store ");
            System.out.println("-------------------------------------------------------------");
        } catch (InputMismatchException ex2) {
            System.out.println("\n >> Please enter an integer to choose a menu option (1,2,3). ");
        }
        int userMenuChoice = input.nextInt();
        return userMenuChoice;
    }

    // Menu for sellers
    public int sellerViewMenu() {
        try {

            System.out.println(" ");
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter your choice:\n ");
            System.out.println(" 1. Add toys to database ");
            System.out.println(" 2. Add clothes to database ");
            System.out.println(" 3. Delete a toy from database ");
            System.out.println(" 4. Delete clothes from database ");
            System.out.println(" 5. Amend a toy from database ");
            System.out.println(" 6. Amend clothes from database ");
            System.out.println(" 7. See status on products ");
            System.out.println(" 8. Exit the store ");
            System.out.println("-------------------------------------------------------------");
        } catch (InputMismatchException ex3) {

            System.out.println("\n >> Please enter an integer to choose a menu option (1,2,3,4,5,6,7,8). ");

        }
        int sellerChoice = input.nextInt();
        return sellerChoice;
    }

    // Menu for buyers
    public int buyerViewMenu() {
        try {

            System.out.println(" ");
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter your choice:\n ");
            System.out.println(" 1. Buy toys ");
            System.out.println(" 2. Buy clothes ");
            System.out.println(" 3. Exit the store ");
            System.out.println("-------------------------------------------------------------");
        } catch (InputMismatchException ex3) {

            System.out.println("\n >> Please enter an integer to choose a menu option (1,2,3). ");

        }
        int buyerChoice = input.nextInt();
        return buyerChoice;
    }

    // Menu for manager
    public int employeeViewMenu() {
        try {

            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter your choice:\n ");
            System.out.println(" 1. Delete a toy in database ");
            System.out.println(" 2. Delete clothes in database ");
            System.out.println(" 3. View customer reports ");
            System.out.println(" 4. Exit the store ");
            System.out.println("-------------------------------------------------------------");
        }

        catch (InputMismatchException ex3) {

            System.out.println("\n >> Please enter an integer to choose a menu option (1,2,3,4). ");
        }
        int employeeChoice = input.nextInt();
        return employeeChoice;
    }

    // Menu for payment
    public int paymentViewMenu() {
        try {

            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter your choice:\n ");
            System.out.println(" 1. Pay with mobilepay ");
            System.out.println(" 2. Pay with creditcard ");
            System.out.println(" 3. Pay with cash ");
            System.out.println(" 4. Exit the store ");
            System.out.println("-------------------------------------------------------------");
        } catch (InputMismatchException ex3) {

            System.out.println("\n >> Please enter an integer to choose a menu option (1,2,3,4). ");

        }
        int paymentChoice = input.nextInt();
        return paymentChoice;
    }

}
