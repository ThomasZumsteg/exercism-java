import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigInteger;

public class Gigasecond {
    private LocalDateTime start;
    private static final Long GIGASECOND = BigInteger
        .valueOf(10)
        .pow(9)
        .longValue();

    public Gigasecond(LocalDate start) {
        this.start = start.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getDate() {
        return start.plusSeconds(GIGASECOND);
    }
}