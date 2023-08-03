package july.stringsTut;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        String str = new String("Test String");
        System.out.println(str);

        System.out.println("Char at 0: " + str.charAt(0));
        System.out.println("Index of r: " + str.indexOf('r'));
        System.out.println("Index of whole string: " + str.indexOf(str));
        System.out.println("Length of string: " + str.length());
        System.out.println("Lowercase string: " + str.toLowerCase());
        System.out.println("Uppercase string: " + str.toUpperCase());

        String str2 = new String("Proto String");
        System.out.println("Concat string: " + str.concat(" - " + str2));

        System.out.println("Substring from 2 to 9: " + str.substring(2,9));
        System.out.println("Subsequence from 3 to 8: " + str.subSequence(3,8));
        System.out.println("String to char array: " + Arrays.toString(str.toCharArray()));

        System.out.println("Compare to method: " + str.compareTo(str2));
        System.out.println("Compare to method: " + str2.compareTo(str));

    }

}
