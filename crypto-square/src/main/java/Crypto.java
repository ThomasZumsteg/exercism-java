import java.util.List;
import java.util.ArrayList;

public class Crypto {
    private String plainText;

    public Crypto(String plainText) {
        this.plainText = plainText;
    }

    public String getNormalizedPlaintext() {
        return plainText.toLowerCase()
            .codePoints()
            .filter(c -> Character.isDigit(c) || Character.isAlphabetic(c))
            .collect(
                StringBuilder::new, 
                StringBuilder::appendCodePoint,
                StringBuilder::append )
            .toString();
    }

    public int getSquareSize() {
        return (int)Math.sqrt(getNormalizedPlaintext().length() - 1) + 1;
    }

    public List<String> getPlaintextSegments() {
        List<String> segments = new ArrayList<>();
        int size = getSquareSize();
        String normalizedPlaintext = getNormalizedPlaintext();
        for(int i = 0; i < normalizedPlaintext.length(); i += size) {
            int j = i + size <= normalizedPlaintext.length() ? i + size : normalizedPlaintext.length();
            segments.add(normalizedPlaintext.substring(i, j));
        }
        return segments;
    }

    public String getCipherText() {
        String cipherText = "";
        List<String> segments = getPlaintextSegments();
        for(int column = 0; column <= getSquareSize(); column++) {
            for(int row = 0; row <= getSquareSize(); row++) {
                if(row < segments.size() && column < segments.get(row).length())
                    cipherText += segments.get(row).charAt(column);
            }
        }
        return cipherText;
    }

    public String getNormalizedCipherText() {
        String cipherText = getCipherText();
        int textLen = cipherText.length();
        int size = getSquareSize() - 1;
        String normCipherText = cipherText.substring(0, size);
        for(int i = size; i < textLen; i += size) {
            System.out.println("size is " + size + ":" + cipherText.substring(i));
            if((textLen - i) % size != 0 && (textLen - i) % (size - 1) == 0)
                size--;
            normCipherText += " " + cipherText.substring(i, i + size);
        }
        return normCipherText;
        // return "vrel aepe mset paoo irpo";
    }
}