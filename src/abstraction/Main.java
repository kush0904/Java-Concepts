package abstraction;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the social media platform: ");
        String name = input.nextLine();

        Platform platform = new Platform(name); //object created


        System.out.print("Enter the URL of the platform: ");
        String url = input.nextLine();
        platform.setUrl(url);

        System.out.print("Enter the country of the platform: ");
        String country = input.nextLine();
        platform.setCountry(country);

        System.out.print("Enter the founder's name of the platform: ");
        String founder = input.nextLine();
        platform.setFounder(founder);

        System.out.print("Enter the date on which platform was founded: ");
        String founderDate = input.nextLine();
        platform.setFounderDate(founderDate);

        platform.getAllPlatformDetails();
    }
}
