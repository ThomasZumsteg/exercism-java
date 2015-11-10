import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Strain {
    public static <T> List<T> keep(List<T> items, Function<T, Boolean> func) {
        List<T> kept = new ArrayList<>();
        for(T item: items) {
            if(func.apply(item))
                kept.add(item);
        }
        return kept;
    }

    public static <T> List<T> discard(List<T> items, Function<T, Boolean> func) {
        return keep(items, i -> !func.apply(i));        
    }
}