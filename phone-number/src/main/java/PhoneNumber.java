public class PhoneNumber {
    private String strPhoneNumber;

    public PhoneNumber(String strPhoneNumber) {
        this.strPhoneNumber = strPhoneNumber;
    }

    public String getNumber() {
        String digits = strPhoneNumber.replaceAll("\\D+","");
        if(digits.length() == 11 && digits.substring(0,1).equals("1"))
            digits = digits.substring(1,11);
        if (digits.length() != 10)
            return "0000000000";
        return digits;
    }

    public String getAreaCode() {
        return getNumber().substring(0,3);
    }

    public String pretty() {
        String digits = getNumber();
        return "("+digits.substring(0,3)+") "+
                   digits.substring(3,6)+"-"+
                   digits.substring(6,10);
    }
}