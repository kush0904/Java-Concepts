package july.stringsTut;

import java.util.Scanner;

public class BuilderMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        StringBuilder string  = new StringBuilder(sc.nextLine());

        string.insert(0,"Hi ");
        System.out.println(string);

        string.delete(4,7);
        System.out.println(string);

        string.deleteCharAt(1);
        System.out.println(string);

        string.append("X");
        System.out.println(string);

        string.reverse();
        System.out.println(string);

    }
}
