public class Trinary {
    public static int toDecimal(String trinary) {
        int decimal = 0;
        for(Character c: trinary.toCharArray()) {
            if('0' <= c && c <= '2')
                decimal = decimal * 3 + Character.getNumericValue(c);
            else
                return 0;
        }
        return decimal;
    }
}