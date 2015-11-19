import java.util.Arrays;

public class Luhn {
    private long code;

    public Luhn(Long code) {
        this.code = code;
    }

    public Luhn(Integer code){
        this.code = (long)code;
    }

    public int getCheckDigit() {
        return (int)(code % 10L);
    }

    public int[] getAddends() {
        String strCode = Long.toString(code);
        int[] intCode = new int[strCode.length()];
        for(int i = strCode.length() - 1; 0 <= i; i--) {
            int n = Character.getNumericValue(strCode.charAt(i));
            if((strCode.length() - i) % 2 == 1)
                intCode[i] = n;
            else if (n < 5)
                intCode[i] = n * 2;
            else 
                intCode[i] = n * 2 - 9;
        }
        System.out.format("%d ", code);
        System.out.println(intCode);
        return intCode;
    }

    public int getCheckSum() {
        return Arrays.stream(getAddends()).sum();
    }

    public boolean isValid() {
        return getCheckSum() % 10 == 0;
    }

    public static long create(long code) {
        int checkSum = new Luhn(code * 10).getCheckSum() % 10;
        return (10L * code) + (checkSum == 0 ? 0L : (10L - (long)checkSum));
    }
}