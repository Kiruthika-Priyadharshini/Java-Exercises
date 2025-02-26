package JavaProblemsolving.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapEntryMethods {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "Kiruthika");
        map.putIfAbsent("name", "Priyadharshini");
        map.putIfAbsent("address", "1020 W abram St");

        String name = map.getOrDefault("name", "Kiruthika Priyadharshini Elamurugan");
        String age = map.getOrDefault("age", "26");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Map contents: " + map);
    }

}
