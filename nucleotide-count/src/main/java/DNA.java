import java.util.Map;
import java.util.HashMap;

public class DNA {
    private final String sequence;

    public DNA(String sequence) {
        this.sequence = sequence;
    }

    public Integer count(Character nucleotide) {
        if("GTAC".indexOf(nucleotide) == -1)
            throw new IllegalArgumentException();
        String strNucleotide = Character.toString(nucleotide);
        String sequenceWithoutNucletide = this.sequence.replace(strNucleotide, "");
        return this.sequence.length() - sequenceWithoutNucletide.length();
    }

    public Map<Character, Integer> nucleotideCounts() {
        final Map<Character, Integer> nucleotideCounts = new HashMap<Character, Integer>();        
        for(char n: "ATGC".toCharArray())
            nucleotideCounts.put(n, this.count(n));
        return nucleotideCounts;
    }
}
