package july.stringsTut;

public class Immutable {

    public static void main(String[] args) {
        String s  = "This is a string";
        s = "Hello";

        //This will give error now
        // s[2] = 'A';

        System.out.println(s);
    }
}
