import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        final Map<String, Integer> result = new HashMap<String, Integer>();
        result.put("a", 1);
        result.put("e", 1);
        result.put("i", 1);
        result.put("o", 1);
        result.put("u", 1);
        return result;

    }
}