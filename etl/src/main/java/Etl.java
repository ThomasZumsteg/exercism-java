import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> oldMap) {
        final Map<String, Integer> newMap = new HashMap<String, Integer>();
        for(Integer key: oldMap.keySet()) {
            for(String val: oldMap.get(key)) {
                newMap.put(val.toLowerCase(), key);
            }
        }
        return newMap;
    }
}