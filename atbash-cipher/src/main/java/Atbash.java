public class Atbash {
    public static String decode(String ciperText) {
        String clearText = "";
        for(Character c: ciperText.toLowerCase().toCharArray())
            clearText += cipher(c);
        return clearText;
    }

    public static String encode(String clearText) {
        String cipherText = "";
        for(Character c: clearText.toLowerCase().toCharArray()) {
            if(cipherText.length() % 6 == 5)
                cipherText += " ";
            cipherText += cipher(c);
        }
        return cipherText.trim();
    }

    private static String cipher(Character c) {
        if('0' <= c && c <= '9')
            return String.valueOf(c);
        else if ('a' <= c && c <= 'z')
            return String.valueOf((char) (219 - (int) c));
        else
            return "";
    }
}
