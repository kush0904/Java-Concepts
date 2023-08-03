package july.stringsTut;

import java.util.Scanner;

public class BuilderString {

    public static void main(String[] args) {

        System.out.println("Enter string");

        Scanner sc = new Scanner(System.in);

        StringBuilder string = new StringBuilder(sc.nextLine());

        string.insert(0,"This ");
        System.out.println("Capacity: " + string.capacity());
        System.out.println("Length: " + string.length());
        System.out.println(string);

        System.out.println();

        string.insert(2,"is ");
        System.out.println("Capacity: " +  string.capacity()); // if length overflows, capacity = (capacity*2)+2
        System.out.println("Length: " + string.length());
        System.out.println(string);

        string.append(" here");
        System.out.println(string);
    }
}
