import java.util.HashMap;

public class Scrabble {
    private final String word;
    private static final HashMap<Integer, Integer> letterScore = new HashMap<>('Z' - 'A');

    public Scrabble(String word) {
        this.word = word;
    }

    public int getScore() {
        if(word==null) return 0;

        return word.toUpperCase()
            .chars()
            .map(c -> letterScore.getOrDefault(c, 0))
            .reduce(0, (a, b) -> a + b);
    }

    private static void mapToScore(String letters, Integer score) {
        letters.chars().forEach(letter -> letterScore.put(letter, score));
    }

    static {
        mapToScore("AEIOULNRST", 1);
        mapToScore("DG", 2);
        mapToScore("BCMP", 3);
        mapToScore("FHVWY", 4);
        mapToScore("K", 5);
        mapToScore("JX", 8);
        mapToScore("QZ", 10);
    }
} 
