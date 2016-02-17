public class Pangrams {
    public static boolean isPangram(String words) {
        /* isPangram checks if all letters of the alphabet are present */
        words = words.toLowerCase();
        for(char c = 'a'; c <= 'z'; c++) {
            if (words.indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
