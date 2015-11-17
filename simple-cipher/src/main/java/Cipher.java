import java.util.Random;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Cipher {
    private int[] key;

    public Cipher() {
        key = new Random()
            .ints(100, 0 , 'z' - 'a')
            .toArray();
    }

    public Cipher(String key) {
        if(key.equals("") || key.chars().anyMatch(c -> c < 'a' || 'z' < c))
            throw new IllegalArgumentException();
        this.key = key
            .chars()
            .map(c -> c - 'a')
            .toArray();
    }

    public String getKey() {
        return Arrays.stream(key)
            .map(c -> c + 'a')
            .collect(StringBuilder::new,
               StringBuilder::appendCodePoint, 
               StringBuilder::append)
            .toString();
    }

    public String encode(String plainText) {
        String cipherText = "";
        for(int i = 0; i < plainText.length(); i++) {
            cipherText += shift(plainText.charAt(i), key[i % key.length]);
        }
        return cipherText;
    }

    public String decode(String cipherText) {
        String plainText = "";
        for(int i = 0; i < cipherText.length(); i++) {
            plainText += shift(cipherText.charAt(i), -key[i % key.length]);
        }
        return plainText;
    }

    private Character shift(Character c, int k) {
        char s = (char)((int)c + k);
        if( s < 'a') s += 'z' - 'a' + 1;
        else if ('z' < s) s -= 'z' - 'a' + 1;
        return s;
    }
}