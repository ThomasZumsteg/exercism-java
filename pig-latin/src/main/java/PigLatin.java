import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {
    public static String translate(String input) {
        return Stream.of(input.split(" "))
            .map(w -> translateWord(w))
            .collect(Collectors.joining(" "));
    }

    private static String translateWord(String input) {
        Matcher quMatch = Pattern.compile("([^aeio]*qu)(.*)").matcher(input);
        Matcher yMatch = Pattern.compile("^y[^aeiou]").matcher(input);
        Matcher defaultMacher = Pattern.compile("(.*?)([aeoiu].*)").matcher(input);

        if(quMatch.find())
            return quMatch.group(2) + quMatch.group(1) + "ay";

        if(!yMatch.find() && defaultMacher.find() && 
            !input.equals(defaultMacher.group(1) + "ay"))
            return defaultMacher.group(2) + defaultMacher.group(1) + "ay";
        return input + "ay";
    }
}