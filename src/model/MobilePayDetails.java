package model;

public class MobilePayDetails {

    // Declare variables for Mobilepay
    private String phoneNumber;
    private String code;

    // Empty constructor
    public MobilePayDetails() {
    }

    // Constructor with information
    public MobilePayDetails(String phoneNumber, String pinCode) {
        this.phoneNumber = phoneNumber;
        this.code = pinCode;
    }

    // Setters mobilepay
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCode(String pinCode) {
        this.code = pinCode;
    }

    // Getters mobilepay
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCode() {
        return code;
    }

    // ToString methods
    public String mobilePayToString() {
        return "Phone number: " + getPhoneNumber() + ", code: " + getCode();
    }

}
