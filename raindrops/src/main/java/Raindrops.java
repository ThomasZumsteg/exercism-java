public class Raindrops {
    static String convert(Integer num) {
        String sounds = "";
        if(num % 3 == 0)
            sounds += "Pling";
        if(num % 5 == 0)
            sounds += "Plang";
        if(num % 7 == 0)
            sounds += "Plong";
        if(sounds.equals(""))
            sounds = Integer.toString(num);
        return sounds;
    }
}