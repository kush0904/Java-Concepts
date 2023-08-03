package july.voting;

import java.util.Scanner;

public class Age {

    private int age;

    public boolean takeAgeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        if(checkAge(age)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkAge(int age) {
        if (age < 18) {
            System.out.println("You cannot cast your vote");
            return false;
        } else {
            return true;
        }
    }

    public int getAge() {
        return age;
    }
}
