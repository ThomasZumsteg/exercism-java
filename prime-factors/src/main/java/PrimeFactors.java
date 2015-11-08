import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
    public static List<Long> getForNumber(long number) {
        List<Long> primes = new ArrayList<>();
        if(number <= 1L) return primes;
        for(Long i = 2L; i * i <= number && number != 1;) {
            if(number % i == 0) {
                primes.add(i);
                number /= i;
            }
            else 
                i += i <= 2 ? 1 : 2;
        }
        primes.add(number);
        return primes;
    }
}