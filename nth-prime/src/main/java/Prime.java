import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Prime {
    /* Prime finds prime numbers */
    public static int nth(int nth) {
        /* nth finds the nth prime number, n must be 1 or greater */
        if(nth <= 0)
            throw new IllegalArgumentException("Not a valid number");
        List<Integer> primes = new ArrayList<>(Arrays.asList(2,3,5,7,11,13));
        for(int num = primes.get(primes.size()-1)+2; primes.size() < nth; num+=2) {
            for(int prime : primes) {
                if(num < prime * prime) {
                    primes.add(num);
                    break;
                }
                if(num % prime == 0)
                    break;
            }
        }
        return primes.get(nth-1);
    }
}
