package creditCard;

import java.util.Scanner;

public class Main {

    private static String cardNumber = "7892 0129 3403 3431";
    private static Integer cvv = 911;
    private static String validMonth = "04";
    private static String validYear = "35";
    private static String chipNumber = "4f91";
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of card: \n Enter 1 for Visa Card \n Enter 2 for MasterCard \n Enter 3 for American Express" );
        int k = input.nextInt();


        switch (k){
            case 1:
                Visa visaCard = new Visa(cardNumber, cvv, validMonth, validYear, chipNumber);
                System.out.println("Your Visa Card Info: ");
                visaCard.displayCardNumber();
                visaCard.displayValidDate();
                visaCard.displayCardChip();
                visaCard.displayCVV();
                break;

            case 2:
                MasterCard mastercard = new MasterCard(cardNumber, cvv, validMonth, validYear, chipNumber);
                System.out.println("Your Master Card Info: ");
                mastercard.displayCardNumber();
                mastercard.displayValidDate();
                mastercard.displayCardChip();
                mastercard.displayCVV();
                break;

            case 3:
                AmericanExpress express = new AmericanExpress(cardNumber, cvv, validMonth, validYear, chipNumber);
                System.out.println("Your American Express Card Info: ");
                express.displayCardNumber();
                express.displayValidDate();
                express.displayCardChip();
                express.displayCVV();
                break;
        }

    }

}
