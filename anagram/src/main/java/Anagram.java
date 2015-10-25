import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {
    private String anagram;

    public Anagram(String anagram) {
        this.anagram = anagram;
    }

    public List<String> match(List<String> words) {
        List<String> anagrams = new ArrayList<String>();

        String anagramLower = this.anagram.toLowerCase();
        char[] anagramLetters = anagramLower.toCharArray();
        Arrays.sort(anagramLetters);

        for(String word: words) {
            String wordLower = word.toLowerCase();
            char[] wordLetters = wordLower.toCharArray();
            Arrays.sort(wordLetters);

            boolean sameLetters = Arrays.equals(anagramLetters, wordLetters); 
            boolean sameWord = anagramLower.equals(wordLower);

            if(sameLetters && !sameWord)
                anagrams.add(word);
        }
        return anagrams;
    }
}
