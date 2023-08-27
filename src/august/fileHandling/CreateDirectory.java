package august.fileHandling;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Path: ");
        String path = input.next();


        boolean createMoreDirectory = true;

        do {

            System.out.println("New directory name: ");
            String newDirectoryName = input.next();

            path = path + "/" + newDirectoryName;

            File file = new File(path);

            boolean isCreated = file.mkdir();

            if (isCreated) {
                System.out.println("Success");
            } else {
                System.out.println("Error");
            }

            System.out.println("Do you want to add another directory? (Y/N)");

            String option = input.next();


            if (option.toUpperCase().charAt(0) == 'N') {
                createMoreDirectory = false;
                break;
            }
        }
        while (createMoreDirectory);
    }
}
