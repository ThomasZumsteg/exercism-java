import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> oldMap) {
        Map<String, Integer> newMap = new HashMap<>();
        oldMap.entrySet().stream()
            .forEach(e -> e.getValue().stream()
                .forEach(v -> newMap.put(v.toLowerCase(), e.getKey()))
            );
        return newMap;
    }
}
