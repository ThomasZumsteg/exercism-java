import java.util.List;
import java.util.ArrayList;

public class Sieve {
    private boolean[] sieve;

    public Sieve(int limit) {
        sieve = new boolean[limit + 1];
    }

    public List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        if(2 <= sieve.length ) primes.add(2);
        for(int i = 3; i < sieve.length; i += 2) {
            if(!sieve[i]) {
                primes.add(i);
                for(int m = i * i; m < sieve.length; m += i)
                    sieve[m] = true;
            }
        }
        return primes;
    }
}
