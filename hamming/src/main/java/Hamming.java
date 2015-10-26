public class Hamming {
    public static Integer compute(String dna_a, String dna_b) {
        Integer distance = 0;
        if(dna_a.length() != dna_b.length())
            throw new IllegalArgumentException();
        for(int i = 0; i < dna_a.length(); i++) {
            if(dna_a.charAt(i) != dna_b.charAt(i))
                distance++;
        }
        return distance;
    } 
}
