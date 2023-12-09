package view;

import model.Customer;
import model.Employee;
import java.util.ArrayList;
import java.util.Scanner;
import data.CustomerData;

public class Login {

    // Create Scanner
    public Scanner input = new Scanner(System.in);
    // Arraylist that holds type Customers
    private ArrayList<Customer> customers;

    // Constructor with method that reads all customer details from text file, in
    // class CustomerData
    public Login() {
        customers = CustomerData.AllCustomerDetails();
    }

    // Boolean method that takes input from customer, checks if the password and
    // username are in the Arraylist
    // customers and the variable loggedIn turnes true if customer is logged in
    public boolean logInCustomer() {

        // Declare variables
        // Set username and password as an empty string
        String password = "";
        String userName = "";
        int passwordAttempts = 3;
        int counter = 1;
        boolean loggedIn = false;

        do {
            System.out.println("\nLogin using your username & your password");
            System.out.println("\nEnter your username: ");
            userName = input.next();
            System.out.println("\nEnter your password: ");
            password = input.next();

            // Go through array with user name & password
            for (int i = 0; i < customers.size(); i++) {
                if (userName.equals(this.customers.get(i).getUserName())
                        && password.equals(this.customers.get(i).getPassword())) {
                    System.out.println("\nYou are logged in!");
                    loggedIn = true;
                }
            }

            // If user input wrong user name and/or password three times
            if (!loggedIn && counter == 3) {
                System.out.println("\nSorry you have exceeded the number of tries. Please try again after few hours");
                System.exit(1);
            }

            // If user input wrong username and/or password
            else if (!loggedIn) {
                counter++;
                passwordAttempts--;
                System.out.println(
                        "\nYou typed the wrong username or password. You have " + passwordAttempts + " tries left.");
            }

        } while (counter < 4 && !loggedIn);

        return loggedIn;
    }

    // Method that add customer object to Arraylist customers
    public void addCustomer(Customer customer01) {
        customers.add(customer01);
    }

    // Boolean method for logging in employee. Prompts employee for user name and
    // password and checks if user name and password are correct
    public boolean loginEmployee() {

        Employee myEmployee = new Employee();
        boolean loggedInE = false;
        System.out.println("\nLogin using your username & your password");

        while (loggedInE != true) {

            System.out.println("\nEnter your username: ");
            String inputUserName = input.next();
            System.out.println("\nEnter your password: ");
            String inputPassword = input.next();

            if (inputUserName.matches(myEmployee.makeUserNameE())
                    && inputPassword.matches(myEmployee.makePasswordE())) {
                System.out.println("\nThank you, you are now logged in as a employee. Wishing you a productive day! ");
                loggedInE = true;
                break;
            } else
                System.out.println("\nYou typed the wrong username or password. Please try again:");
            loggedInE = false;
        }

        return loggedInE;

    }
}