package controller;

import data.ProductDatabase;
import data.ReadAndWriteFiles;
import view.ViewMenu;
import view.Login;
import view.UserInterface;

public class Menus {
    public Menus() {
    }

    private static ViewMenu myViewMenu = new ViewMenu();
    private static Login myLogIn = new Login();
    private static ReadAndWriteFiles myReadAndWriteFiles = new ReadAndWriteFiles();
    private static UserInterface myUserInterface = new UserInterface();
    private static Menus myMenus = new Menus();

    // StartViewMenu
    public void welcomeMenu() {
        // Create a file called Customer.txt that later stores customer details
        myReadAndWriteFiles.createCustomerFile();
        int userStartChoice = myViewMenu.startViewMenu();
        boolean firstMenu = true;
        while (firstMenu) {
            switch (userStartChoice) {

                // User wants to register as a new user
                case 1:
                    myUserInterface.getAllCustomerDetails();
                    myMenus.customerMenu();
                    firstMenu = false;
                    break;

                // User wants to register as a manager/employee
                case 2:
                    myUserInterface.getAllEmployeeDetails();
                    myLogIn.loginEmployee();
                    myMenus.employeeMenu();
                    firstMenu = false;
                    break;

                // User wants to login as a customer or seller
                case 3:
                    if (myLogIn.logInCustomer())
                        ;
                    myMenus.customerMenu();
                    firstMenu = false;
                    break;

                // User wants to exit the store
                case 4:
                    myUserInterface.exitChoice();
                    System.exit(0);
                    break;

                // User entered invalid choice
                default:
                    myUserInterface.invalidChoice();
                    welcomeMenu();
                    firstMenu = false;
            }
        }
    }

    // SellerOrByerViewMenu
    public void customerMenu() {
        int sellerOrByerChoice = myViewMenu.sellerOrBuyerViewMenu();
        boolean secondMenu = true;
        while (secondMenu) {
            switch (sellerOrByerChoice) {
                // User wants to sell toys and clothes
                case 1:
                    myMenus.sellerMenu();
                    secondMenu = false;
                    break;

                // User wants to buy toys and clothes
                case 2:
                    myMenus.buyerMenu();
                    secondMenu = false;
                    break;

                // User wants to exit the store
                case 3:
                    myUserInterface.exitChoice();
                    System.exit(0);
                    break;

                // User entered invalid choice
                default:
                    myUserInterface.invalidChoice();
                    customerMenu();
                    secondMenu = true;
            }

        }
    }

    // BuyerViewMenu
    public void buyerMenu() {
        int buyerChoice = myViewMenu.buyerViewMenu();
        boolean thirdMenu = true;
        while (thirdMenu) {
            switch (buyerChoice) {

                // User wants to view toys
                case 1:
                    ProductDatabase.printToys();
                    myUserInterface.selectProduct();
                    myUserInterface.proceedToPayement();
                    thirdMenu = false;
                    break;

                // User wants to view clothes
                case 2:
                    ProductDatabase.printClothes();
                    myUserInterface.selectProduct();
                    myUserInterface.proceedToPayement();
                    thirdMenu = false;
                    break;

                // User wants to exit the store
                case 3:
                    myUserInterface.exitChoice();
                    System.exit(0);
                    break;

                // User entered invalid choice
                default:
                    myUserInterface.invalidChoice();
                    buyerMenu();
                    thirdMenu = true;
            }

        }
    }

    // SellerViewMenu
    public void sellerMenu() {
        int sellerChoice = myViewMenu.sellerViewMenu();
        boolean forthMenu = true;
        while (forthMenu) {
            switch (sellerChoice) {
                // Sellers wants to add toys to database
                case 1:

                    // Sellers wants to add clothes to database
                case 2:

                    // Sellers wants to delete a toy from database
                case 3:

                    // Sellers wants to delete clothes from database
                case 4:

                    // Sellers wants to amend a toy from database
                case 5:

                    // Sellers wants to amend clothes from database
                case 6:

                    // Seller wants to see status of products
                case 7:
                    myUserInterface.notSupportedChoice();
                    // Throws the user back to the customerMenu
                    myMenus.customerMenu();
                    forthMenu = false;
                    break;

                // Sellers wants to exit the store
                case 8:
                    myUserInterface.exitChoice();
                    System.exit(0);
                    break;

                // User entered invalid choice
                default:
                    myUserInterface.invalidChoice();
                    sellerMenu();
                    forthMenu = true;
            }

        }

    }

    // EmployeeViewMenu
    public void employeeMenu() {
        int employeeChoice = myViewMenu.employeeViewMenu();
        boolean fifthMenu = true;
        while (fifthMenu) {
            switch (employeeChoice) {

                // Employee wants to delete a toy in database
                case 1:

                    // Employee wants to delete clothes in database
                case 2:

                    // Employee wants to view customer reports
                case 3:
                    myUserInterface.notSupportedChoice();
                    // Throws the user back to the StartViewMenu
                    myMenus.welcomeMenu();
                    fifthMenu = false;
                    break;

                // Employee wants to exit the store
                case 7:
                    myUserInterface.exitChoice();
                    System.exit(0);
                    break;

                // Employee entered invalid choice
                default:

                    myUserInterface.invalidChoice();
                    employeeMenu();
                    fifthMenu = true;
            }

        }

    }

    // PaymentViewMenu
    public void paymentMenu() {
        int paymentChoice = myViewMenu.paymentViewMenu();
        boolean sixthMenu = true;
        while (sixthMenu) {
            switch (paymentChoice) {

                // Customer wants to pay with mobilepay
                case 1:
                    myUserInterface.getAllMobilepayDetails();
                    myUserInterface.printConfirmation();
                    myUserInterface.printReceipt();
                    sixthMenu = false;
                    break;

                // Customer wants to pay with credit card
                case 2:
                    myUserInterface.getAllCreditCardDetails();
                    myUserInterface.printConfirmation();
                    myUserInterface.printReceipt();
                    sixthMenu = false;
                    break;

                // Customer wants to pay with cash
                case 3:
                    myUserInterface.cashPayment();
                    myUserInterface.printConfirmation();
                    myUserInterface.printReceipt();
                    sixthMenu = false;
                    break;

                // Buyer wants to exit the store
                case 4:
                    myUserInterface.exitChoice();
                    System.exit(0);
                    break;

                // Customer entered invalid choice
                default:
                    myUserInterface.invalidChoice();
                    paymentMenu();
                    sixthMenu = true;
            }

        }

    }

}
