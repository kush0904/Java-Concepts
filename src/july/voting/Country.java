package july.voting;

import java.util.Scanner;

public class Country {

    private String country;

    public boolean takeCountryInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Country (First 3 Characters)");
        country = sc.nextLine().toUpperCase();

        if (checkCountry(country)) {
            this.country = country.trim();
            if(this.country.equals("IND")){
                System.out.println("You can cast your vote");
                return true;
            }
            else{
                System.out.println("You cannot cast your vote");
                return false;
            }
        } else {
            System.out.println("You cannot cast your vote");
            return false;
        }
    }

    public boolean checkCountry(String name) {
        if (name.isEmpty()) {
            System.out.println("Country cannot be empty");
            return false;
        } else {
            return true;
        }
    }

    public String getCountry() {
        return country;
    }
}
