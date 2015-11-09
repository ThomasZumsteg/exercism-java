import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Allergies {
    private final Integer score;

    public Allergies(Integer score) {
        this.score = score;
    }

    public Boolean isAllergicTo(Allergen item) {
        return 0 != (this.score & item.getScore());
    }

    public List<Allergen> getList() {
        return Arrays.stream(Allergen.values())
            .filter(a -> isAllergicTo(a))
            .collect(Collectors.toList());
    }
}