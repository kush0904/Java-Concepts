package creditCard;

public class Visa extends CreditCard {
    public Visa(String cardNumber, Integer cvv, String validMonth, String validYear, String chipNumber){
        super(cardNumber,cvv,validMonth,validYear,chipNumber);
    }
}
