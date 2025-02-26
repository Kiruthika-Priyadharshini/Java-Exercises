package JavaProblemsolving.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_exercise2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("A", 85);
        studentScores.put("B", 92);
        studentScores.put("C", 78);
        studentScores.put("D", 90);

        for (Map.Entry<String, Integer> i : studentScores.entrySet()) {

            System.out.println("Student: " + i.getKey() + "-> Score: " + i.getValue());
        }

    }
}
