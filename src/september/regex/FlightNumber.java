package september.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FlightNumber {

    public static void main(String[] args) {

        //Pattern pattern = Pattern.compile("Flight Number: 1024");

        //Pattern pattern = Pattern.compile("Flight Number: \\d\\d\\d\\d");

        //Pattern pattern = Pattern.compile("Flight Number: \\d{5}");

        //Pattern pattern = Pattern.compile("Flight Number: \\d{2,}");

        //Pattern pattern = Pattern.compile("Flight Number: \\d{3,4}");

        //Pattern pattern = Pattern.compile("^Flight Number: \\d{3,}$");

        //Pattern pattern = Pattern.compile("^.light Number: \\d{3,}$");

        //Pattern pattern = Pattern.compile("^[F|f]light [N|n]umber: \\d{3,}$");

        Pattern pattern = Pattern.compile("^(F|f|AF)light [N|n]umber: \\d{3,}$");

        Matcher matcher = pattern.matcher("Flight Number: 1024");

        boolean matchFound = matcher.find();
        System.out.println(matchFound);
    }
}
