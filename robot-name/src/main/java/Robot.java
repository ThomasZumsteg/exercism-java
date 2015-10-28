import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class Robot {
    private String name = "";
    private static Set<String> namesInUse = new HashSet<String>();

    public Robot() {
        reset();
    }

    public String getName() {
        return this.name;
    }

    public void reset() {
        String oldName = this.name;
        while(this.name.isEmpty() || namesInUse.contains(this.name)) {
            Random r = new Random();
            this.name = "";
            this.name += (char)(r.nextInt(26) + 65);
            this.name += (char)(r.nextInt(26) + 65);
            this.name += Integer.toString(r.nextInt(1000));
        }
        namesInUse.add(this.name);
        namesInUse.remove(oldName);
    }
}