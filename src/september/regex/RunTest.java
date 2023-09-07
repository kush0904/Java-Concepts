package september.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunTest {

    public int test(String regex, String input ){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int matches = 0;
        while(matcher.find()){
            matches++;
        }

        return matches;
    }

    public static void main(String[] args) {
        RunTest obj = new RunTest();
        int matches = obj.test(".","temp");
        System.out.println(matches);
    }
}
