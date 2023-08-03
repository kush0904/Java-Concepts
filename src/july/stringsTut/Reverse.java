package july.stringsTut;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        StringBuffer string  = new StringBuffer(sc.nextLine());

        System.out.println(string.capacity());


        string.reverse();
        System.out.println("Reverse of the string: ");
        System.out.println(string);
    }
}
