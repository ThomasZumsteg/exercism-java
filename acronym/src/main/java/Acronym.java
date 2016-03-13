public class Acronym {
    //Acronym shortens words to indecipherable shorter versions
    public static String generate(String phrase) {
        //generate creates an acronym from a word base on capitilization
       String[] words = phrase.split("\\W+");
       String acronym = "";
       for(String word: words) {
           acronym += Character.toUpperCase(word.charAt(0));
           String remainer = word.substring(1, word.length());
           String upperCaseRemainer = remainer.replaceAll("[^A-Z]", "");
           if(upperCaseRemainer != "" && upperCaseRemainer != remainer)
               acronym += upperCaseRemainer;
       }
       return acronym;
    }
} 
