package model;

public class CreditCardDetails {

    // Declare variables for credit card
    private String cardNumber;
    private String expireDate;
    private String cvcNumber;

    // Empty constructor
    public CreditCardDetails() {
    };

    // Constructor with information
    public CreditCardDetails(String cardNumber, String expireDate, String cvcNumber) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvcNumber = cvcNumber;
    }

    // Setters credit card
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setCvcNumber(String cvcNumber) {
        this.cvcNumber = cvcNumber;
    }

    // Getters credit card
    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getCvcNumber() {
        return cvcNumber;
    }

    // ToString methods 46
    public String creditcardToString() {
        return "Credit card: " + getCardNumber() +
                " Expiration date: " +
                getExpireDate() + "CVC number: "
                + getCvcNumber();
    }

}
