package august.fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Path: ");
        String path = input.next();

        boolean createMoreDirectory = true;

        do {

            System.out.println("New directory name: ");
            String newDirectoryName = input.next();

            System.out.println("Enter file name: ");
            String newFileName = input.next();

            String newDirectoryPath = path + "/" + newDirectoryName;
            File directory = new File(newDirectoryPath);

            if (!directory.exists()) {
                if (directory.mkdirs()) {
                    System.out.println("Directory created: " + newDirectoryPath);
                } else {
                    System.out.println("Error creating directory: " + newDirectoryPath);
                    return;
                }
            }

            String newFilePath = newDirectoryPath + "/" + newFileName;
            File file = new File(newFilePath);

            boolean isCreated = file.createNewFile();

            if (isCreated) {
                System.out.println("File created: " + newFilePath);
            } else {
                System.out.println("Error creating file: " + newFilePath);
            }

            System.out.println("Do you want to add another directory? (Y/N)");

            String option = input.next();

            if (option.equalsIgnoreCase("N")) {
                createMoreDirectory = false;
            }
        } while (createMoreDirectory);

    }
}
