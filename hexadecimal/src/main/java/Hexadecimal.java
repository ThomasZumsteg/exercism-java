public class Hexadecimal {
    public static int toDecimal(String hex) {
        /* toDecimal coverts a hexadecimal number into decimal 
         * valid characers are a-f0-9
         * numbers with an invalid character are 0*/
        int total = 0;
        for (char c : hex.toCharArray()) {
            total *= 16;
            if('a' <= c && c <= 'f') {
                total += c - 'a' + 10;
            } else if('0' <= c && c <= '9') {
                total += c - '0';
            } else {
                // Invalid character
                return 0;
            }
        }
        return total;
    }
}
