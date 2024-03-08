import java.util.*;
import java.io.*;
public class ForLoop {
    public static void main(String[] args) {
        // Simple for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i = "+i);
        }
        // Iterating through an array
        int[] intArray = {1,2,3,4,5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("The array element is "+intArray[i]);
        }

        // For each
        String[] stringArray = {"a", "b", "c", "d"};
        for (String arrayElement : stringArray) {
            System.out.println("The string array element is "+arrayElement);
        }
    }
}
