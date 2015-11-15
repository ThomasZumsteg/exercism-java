public class RnaTranscription {
    public static String ofDna(String dna) {
        String rna = "";
        for(Character c: dna.toCharArray()) {
            rna += fromDnaToRna(c);
        }
        return rna;
    }

    private static String fromDnaToRna(Character dna) {
        switch(dna) {
            case 'C': return "G";
            case 'G': return "C";
            case 'T': return "A";
            case 'A': return "U";
            default: return "";
        }
    }
}