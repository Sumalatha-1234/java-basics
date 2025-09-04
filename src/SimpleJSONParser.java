//Parse a JSON string into key-value pairs using Java.
import java.util.*;

public class SimpleJSONParser {
    public static void main(String[] args) {
        String json = "{ \"name\":\"Paulo\", \"age\":21, \"course\":\"Java\" }";
        json = json.replaceAll("[{}\"]", ""); // remove braces & quotes

        String[] pairs = json.split(",");
        Map<String, String> map = new HashMap<>();

        for (String pair : pairs) {
            String[] kv = pair.split(":");
            map.put(kv[0].trim(), kv[1].trim());
        }

        System.out.println("Parsed JSON: " + map);
    }
}
/*
output:
Parsed JSON: {name=Paulo, course=Java, age=21}
 */
