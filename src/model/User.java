package model;

public class User {

    // Variables for both customer and employee
    private String firstName, lastName, cpr;

    // Empty Constructor
    public User() {
    }

    // Constructor with information
    public User(String firstName, String lastName, String cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
    }

    // Setters
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpr() {
        return cpr;
    }

    // ToString method. Get a user to string
    public String toString() {
        return "firstname: " + firstName +
                ", lastname: " + lastName +
                ", cpr-number: " + cpr;

    }
}