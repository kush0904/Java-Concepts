package creditCard;

public class MasterCard extends CreditCard{
    public MasterCard(String cardNumber, Integer cvv, String validMonth, String validYear, String chipNumber){
        super(cardNumber,cvv,validMonth,validYear,chipNumber);
    }
}
