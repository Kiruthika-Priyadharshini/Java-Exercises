package JavaProblemsolving.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Exercise {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<String, String>();
        employee.put("Employee1", "Kiruthika");
        employee.put("Employee2", "Priya");
        employee.put("Employee3", "Dharshini");
        employee.put("Employee4", "Elamurugan");
        employee.put("Employee5", "Shan");

        System.out.println(employee);

        String id_employee3 = employee.get("Employee3");
        System.out.println(id_employee3);

        employee.put("Employee6", "Priya");
        System.out.println(employee);

        employee.put("Employee6", "hari");
        System.out.println(employee);

        employee.remove("Employee6");
        System.out.println(employee);

        employee.forEach((k, v) -> System.out.println(k + "-->" + v));

        employee.replace("Employee5", "shan", "krish");
        System.out.println(employee);

    }

}
