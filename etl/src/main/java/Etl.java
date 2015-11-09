import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> oldMap) {
        final Map<String, Integer> newMap = new HashMap<String, Integer>();
        for(Map.Entry<Integer, List<String>> entry: oldMap.entrySet()) {
            for(String val: entry.getValue()) {
                newMap.put(val.toLowerCase(), entry.getKey());
            }
        }
        return newMap;
    }
}