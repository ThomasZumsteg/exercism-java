import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Accumulate {
    public static <T,S> List<S> accumulate(List<T> items, Function<T, S> transform) {
        List<S> transformed_items = new ArrayList<>(items.size());
        for(T item: items)
            transformed_items.add(transform.apply(item));
        return transformed_items;
    }
}