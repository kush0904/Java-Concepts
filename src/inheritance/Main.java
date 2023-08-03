package inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Car Name : ");
        String car_name = input.next();

        Child obj = new Child(car_name);

        System.out.println(obj.getCar_name());

        System.out.println("Is your car registered? (Yes/No)");
        String isRegistered = input.next().toLowerCase();


        if(isRegistered.equals("yes")) {
            obj.setRegistered(true);  //setting the registration of the car explicitly by grandparent
        }

        if(obj.isRegistered()) {
            System.out.println("Is your car re-registered? (Yes/No)");
            String isReregistration = input.next().toLowerCase();

            if(isReregistration.equals("yes")) {
                obj.setReregistration(true); // father has done the re-registration of the car
            }
            if(obj.isReregistration()){
                System.out.println("Did you modify the car? (Yes/No)");
                String modified = input.next().toLowerCase();

                if (modified.equals("yes")) {
                    obj.setModified(true);
                    System.out.println("Good");
                } else if (modified.equals("no")) {
                    obj.setModified(false);
                    System.out.println("Modify it now");
                }
            }
            else{
                System.out.println("You cannot modify the car unless it is re-registered");
            }
        }else{
            System.out.println("First register the car");
        }

    }
}
