package september.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("Java");
        System.out.println(matcher.find());


        Pattern pattern2 = Pattern.compile("Java");
        Matcher matcher2 = pattern2.matcher("JavaJava Java");
        int count = 0;
        while(matcher2.find()){
            count++;
        }
        System.out.println(count);

    }
}
