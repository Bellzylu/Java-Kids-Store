package data;

import java.util.*;
import java.util.ArrayList;
import model.Customer;

public class CustomerData {

    // Changes input to String
    public static Customer getCustomer(String line) {

        Customer customer01 = new Customer();
        // Look for every ";" and turns the value into strings
        String[] values = line.split(";");
        // Change the string type into the correct format
        customer01.setFirstName(values[0]);
        customer01.setLastName(values[1]);
        customer01.setAddress(values[2]);
        customer01.setPostalCode(values[3]);
        customer01.dateOfBirth(values[4]);
        customer01.setCpr(values[5]);
        customer01.setPhoneNumber(values[6]);
        customer01.setUserName(values[7]);
        customer01.setPassword(values[8]);
        return customer01;
    }

    // Makes Arraylist on file of Customer
    public static ArrayList<Customer> AllCustomerDetails() {

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Scanner input = ReadAndWriteFiles.readDetails("Customer.txt");
        // Checking each line
        while (input.hasNextLine()) {
            customerList.add(getCustomer(input.nextLine()));
            // Passing each line to the method getCustomer which returns a customer
        }
        return customerList;
    }
}
