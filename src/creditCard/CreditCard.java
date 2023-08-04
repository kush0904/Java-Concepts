package creditCard;

public class CreditCard implements CreditCardInfo {
    private String cardNumber;
    private Integer cvv;
    private String validMonth;
    private String validYear;
    private String chipNumber;

    public CreditCard(String cardNumber, Integer cvv, String validMonth, String validYear, String chipNumber) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validMonth = validMonth;
        this.validYear = validYear;
        this.chipNumber = chipNumber;
    }

    @Override
    public void displayCardChip() {
        System.out.println("Card Chip: " + chipNumber);
    }

    @Override
    public void displayCardNumber() {
        System.out.println("Card Number: " + cardNumber);
    }

    @Override
    public void displayCVV() {
        System.out.println("Card CVV: " + cvv);
    }

    @Override
    public void displayValidDate() {
        System.out.println("Card valid up to: " + validMonth + "/" + validYear);
    }

}