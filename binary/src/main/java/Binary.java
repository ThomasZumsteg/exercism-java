public class Binary {
    private final String binary; 

    public Binary(String binary) {
        this.binary = binary;
    }

    public int getDecimal() {
        int result = 0;

        for(Character c: binary.toCharArray()) {
            if("01".indexOf(c) == -1)
                return 0;
            result = result * 2 + Character.getNumericValue(c);
        }
        return result;
    }
}