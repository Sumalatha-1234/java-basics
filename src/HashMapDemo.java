//Store student names and their marks in a HashMap and print them.
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Alice", 85);
        students.put("Bob", 92);
        students.put("Charlie", 78);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }
    }
}
/*
output:
Bob scored 92
Alice scored 85
Charlie scored 78
 */
