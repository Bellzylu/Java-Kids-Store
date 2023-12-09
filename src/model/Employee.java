package model;

public class Employee extends User {
    // Variables
    String employeerID, userNameE, passwordE;

    // Empty constructor
    public Employee() {
    }

    // Constructor with information including super type from Bikes
    public Employee(String firstName, String lastName, String cpr, String employeerID, String userNameE,
            String passwordE) {
        this.employeerID = employeerID;
        this.userNameE = userNameE;
        this.passwordE = passwordE;
    }

    // Setters
    public void setEmployeerID(String employeerID) {
        this.employeerID = employeerID;
    }

    public void setUserNameE(String userNameE) {
        this.userNameE = userNameE;
    }

    public void setPasswordE(String passwordE) {
        this.passwordE = passwordE;
    }

    // Getters
    public String getEmployeerID() {
        return employeerID;
    }

    public String getUserNameE() {
        return userNameE;
    }

    public String getPasswordE() {
        return passwordE;
    }

    public String makeUserNameE() {
        return userNameE = "ADMIN9867";
    }

    public String makePasswordE() {
        return passwordE = "sZ5q";
    }

    // ToString method. Get a customer to string
    // @Override annotation to tell the compiler to validate that
    // we are overriding the superclass method user toString

    @Override
    public String toString() {
        return super.toString() + "employeer id: " + employeerID +
                ", first name: " + getFirstName() +
                ", last name: " + getLastName() +
                ", cpr-number:" + getCpr() +
                ", user name: " + userNameE +
                ", password: " + passwordE;
    }
}
