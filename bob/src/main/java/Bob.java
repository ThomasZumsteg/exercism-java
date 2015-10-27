public class Bob {
    public String hey(String greeting) {
        greeting = greeting.trim();
        if( greeting.isEmpty() ) {
            return "Fine. Be that way!";
        } else if( Bob.shouting(greeting)) {
            return "Whoa, chill out!";
        } else if( greeting.charAt(greeting.length() - 1) == '?') {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

    private static boolean shouting(String greeting) {
        boolean hasUppercase = false;
        for(char c: greeting.toCharArray()) {
            if( Character.isLowerCase(c)) return false;
            hasUppercase |= Character.isUpperCase(c);
        }
        return hasUppercase;
    }
}
