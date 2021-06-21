package ro.ctrln.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BittnetRegularExpresion {

    public static void main(String[] args) {

        String regex = "07\\d{8}+$";
        String input = "072012345674";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match cu succes: " + matcher.start() + " " + matcher.end());
        }else {
            System.out.println("Match fara succes!");
        }
    }
}
