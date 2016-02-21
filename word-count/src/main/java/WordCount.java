import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> phrase(String sentence) {
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        String[] words = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "").split("\\s+");
        for(String word: words) {
            Integer c = wordCounts.containsKey(word) ? wordCounts.get(word) : 0;
            wordCounts.put(word, ++c);
        }
        return wordCounts;
    }
}
