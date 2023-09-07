package september.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RunTest2 {

    public boolean runtest(String regex, String text) {
        System.out.print("Enter Text (This is infosys and this is also Infosys): ");
        Scanner input = new Scanner(System.in);
        text = input.nextLine();

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // To print all the occurrences
        /*while(matcher.find()){
            System.out.println("Pattern matches from " + matcher.start() + " and ends at " + (matcher.end() - 1));
        }*/

        if (matcher.find()) {
            System.out.println("Pattern matches from " + matcher.start() + " and ends at " + (matcher.end() - 1));
            return true;
        } else {
            System.out.println("Pattern not found in the input text.");
            return false;
        }

    }


    public static void main(String[] args) {
        RunTest2 obj = new RunTest2();
        String regex = "Infosys";
        String input = null;
        boolean matches = obj.runtest(regex, input);
        System.out.println(matches);

    }
}
