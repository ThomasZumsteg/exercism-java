import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class School {
    private Map<Integer, List<String>> db;

    public School() {
        db = new HashMap<Integer, List<String>>();
    }

    public Map<Integer, List<String>> db() {
        return db;
    }

    public void add(String student, Integer grade) {
        List<String> students = db.containsKey(grade) ? 
            db.get(grade) :
            new ArrayList<String>();
        students.add(student);
        db.put(grade, students);
    }

    public List<String> grade(Integer grade) {
        if(!db.containsKey(grade))
            return Collections.<String>emptyList();
        return db.get(grade);
    }

    public Map<Integer, List<String>> sort() {
        for(List<String> students: db.values()) {
            Collections.sort(students);
        }
        return db;
    }
}