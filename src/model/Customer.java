package model;

import model.User;

public class Customer extends User {

    // Declare variables
    private String address, postalCode, dateOfBirth, phoneNumber, userName, password;

    // Empty constructor
    public Customer() {

    }

    // Constructor with information including super type from User
    public Customer(String firstName, String lastName, String cpr, String address, String postalcode,
            String dateOfBirth, String phoneNumber,
            String userName, String password) {
        super(firstName, lastName, cpr);
        this.address = address;
        this.postalCode = postalcode;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalcode) {
        this.postalCode = postalcode;
    }

    public void dateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters
    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // ToString method. Get a customer to string
    // @Override annotation to tell the compiler to validate
    // that we are overriding the superclass method user toString
    @Override

    public String toString() {

        return super.toString() + "First name: "
                + getFirstName() +
                ", last name: " + getLastName() +
                ", cpr-number: " + getCpr() +
                "\n, address: " + getAddress() +
                ", postal code: " + getPostalCode() +
                ", date of birth: " + getDateOfBirth() +
                ", phone number: " + getPhoneNumber();

    }
}
