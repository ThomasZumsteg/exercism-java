import java.util.Map;
import java.util.HashMap;

public class Scrabble {
    private final String word;
    private final Map<Character, Integer> letterScore;

    public Scrabble(String word) {
        this.word = word;
        this.letterScore = initLetterScore();
    }

    public int getScore() {
        if(word==null) { return 0; }

        int sum = 0;
        for(Character c: word.toUpperCase().toCharArray()) {
            sum += letterScore.containsKey(c) ? letterScore.get(c) : 0;
        }
        return sum;
    }

    private static Map<Character, Integer> initLetterScore() {
        Map<Character, Integer> letterScore = new HashMap<Character, Integer>();
        String[] letterGroups =  {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
        Integer[] letterValues = {           1,    2,      3,       4,   5,    8,   10};
        for(int i = 0; i < letterGroups.length; i++) {
            for(Character c: letterGroups[i].toCharArray()) {
                letterScore.put(c, letterValues[i]);
            }
        }
        return letterScore;
    }
} 
