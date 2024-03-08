import java.util.*;

public class ArrayAndLists {
    public static void main(String[] args) {
        // Declaring array and allocating memory to it
        int intArray[] = new int[5];

        // Adding elements to array
        for (int i = 0; i<5; i++) {
            intArray[i] = i*10;
            System.out.println("Adding "+intArray[i]);
        }
        // Displaying contents of array using foreach, you can do same with intArray[i]
        System.out.println("Displaying contents of array using for each");
        for (int element : intArray) {
            System.out.println(element);
        }

        // Pre-populating array
        int newIntArray[] = {1,2,3,4,5};
        // Displaying contents of pre-populated array
        System.out.println("Displaying contents of pre-populated array");
        for (int i = 0; i<newIntArray.length; i++) {
            System.out.println(newIntArray[i]);
        }

        // List
        List<String> list = new ArrayList<String>();

        // Adding element to list
        for (int i = 0; i<5; i++) {
            list.add("Element-"+i);
        }

        // Displaying contents of list
        System.out.println("Displaying contents of list "+list);

        // Removing element from list
        list.remove(0);
        System.out.println("List after removing element at index 0 "+list);

        // Pre-populated list
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        // Displaying contents of list
        System.out.println("Displaying contents of pre-populated list"+integerList);
    }
}
