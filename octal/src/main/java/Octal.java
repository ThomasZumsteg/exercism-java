public class Octal {
    private String octal;

    public Octal(String octal) {
        this.octal = octal;
    }

    public long getDecimal() {
        Long decimal = 0L;
        for(Character c: octal.toCharArray()) {
            if( c < '0' || '7' < c) return 0L;
            decimal = decimal * 8 + (long)(c - '0');
        }
        return decimal;
    }
}
