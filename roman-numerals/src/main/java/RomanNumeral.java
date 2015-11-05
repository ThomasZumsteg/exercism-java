public class RomanNumeral {
    private int decimal;
    private String[] digits = {
        "I", "IV", "V", "IX",
        "X", "XL", "L", "XC",
        "C", "CD", "D", "CM",
        "M",
    };
    private int[] values = {
           1,   4,   5,   9,
          10,  40,  50,  90,
         100, 400, 500, 900,
        1000,
    };

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String getRomanNumeral() {
        int remain = decimal;
        String roman = ""; 
        for(int i = values.length - 1; i >= 0; i--) {
            int quot = remain / values[i];
            remain = remain % values[i];
            roman += new String(new char[quot]).replace("\0", digits[i]);
        }
        return roman;
    }
}