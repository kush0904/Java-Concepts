package july.voting;

import java.util.Scanner;

public class Name {

    private String name;

    public boolean takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        name = sc.nextLine();

        if (checkName(name)) {
            this.name = name.trim();
            return true;
        } else {
            return false;
        }
    }

    public boolean checkName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }
}
