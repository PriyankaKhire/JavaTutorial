import java.io.*;
import java.util.*;
public class LearningHashMaps {
    public static void main(String[] args) {
        // Hash Map

        // Key = String Value = String
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        // Add single key and value in hash map
        stringStringHashMap.put("key1", "value1");
        // Get the value of a key from hash map
        System.out.println("The value of key1 is "+stringStringHashMap.get("key1"));
        // Try to find key in hash map
        if (!stringStringHashMap.containsKey("key2")) {
            System.out.println("The hash map doesn't contain key2");
        }
        // Add many values in hash map
        for (int i = 2; i < 6; i++) {
            stringStringHashMap.put("key"+i, "value"+i);
        }
        // Print all values in hash map
        for (String key : stringStringHashMap.keySet()) {
            System.out.println("The key is = "+key+" The value is = "+stringStringHashMap.get(key));
        }
        // Update the value of a key
        System.out.println("The old value of key1 "+stringStringHashMap.get("key1"));
        stringStringHashMap.put("key1", "updatedValue1");
        System.out.println("The updated value of key1 "+stringStringHashMap.get("key1"));
    }
}
