package september.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

    public static void main(String[] args) {

        String sentence = "Python regular expression : Python";

        String regex = "Python";
        String replace = "Java";

        System.out.println("Before Replacing: " + sentence);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        sentence = matcher.replaceAll(replace);

        // sentence = matcher.replaceFirst(replace);

        System.out.println("After replacing: " + sentence);
    }
}
