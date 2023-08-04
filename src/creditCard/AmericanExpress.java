package creditCard;

public class AmericanExpress extends CreditCard{
    public AmericanExpress(String cardNumber, Integer cvv, String validMonth, String validYear, String chipNumber){
        super(cardNumber,cvv,validMonth,validYear,chipNumber);
    }
}
