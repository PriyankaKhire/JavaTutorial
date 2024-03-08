# Programs
[Basics](Basics/src)
# What to import by default
```java
import java.io.*;
import java.util.*;
```

# Split string
```java
String string = "I am trying to split this string";
String[] parts = string.split(" ");

// Display the split string
for(int i = 0; i < parts.length; i++)
    {
      System.out.println(parts[i]);
    }
```

# Length of String
```java
int len = string.length();
System.out.println(len);
```

# [Arrays](Basics/src/ArrayAndLists.java)
```java
// Declaring array and allocating memory to it
int intArray[] = new int[5];

// Pre-populating array
int newIntArray[] = {1,2,3,4,5};

// Adding element to array
intArray[0] = 1;
```
# [List](Basics/src/ArrayAndLists.java)
```java
// Declaring List
List<Integer> list = new ArrayList<Integer>();

// Pre-populated list
List<Integer> integerList = Arrays.asList(1,2,3,4,5);

// Adding element to list
list.add(1);

// Removing element at index
list.remove(index);

// Checking list empty
list.isEmpty(); // Output -> Boolean true or false

// If list contains element 
list.contains(element) // Output -> Boolean true or false 
```

# [Hash Map](Basics/src/LearningHashMaps.java)
```java
// Declaration of hash map
HashMap<String, String> hashMap = new HashMap<String, Integer>();

// Adding key in hash map
hashMap.put("key", "value");

// Getting key from hash map
hashMap.get("key"); // Output -> "value"

// Total number of keys present in hash map
hashMap.size(); // Output -> 1

// Iterating through hash map
for(String key : hashMap.keySet()) {
  System.out.println("The key is = " + key + " The value is = " + hashMap.get(key));
}

// If key present in hash map
hashMap.containsKey("key"); // Output -> true
```
## Types of Hash Maps
```java
// Key = String, Val = int
HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
hashMap.put("key", 1);

// Key = Integer, Val = List of integers
HashMap<Integer, List<Integer>> hashmap = new HashMap<Integer, List<Integer>>();
hashmap.put(1, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
hashmap.put(2, new ArrayList<>());
```
## Differences Between Hashtable and HashMap
<table>
    <tr>
        <th>HashTable</th>
        <th>HashMap</th>
    </tr>
    <tr>
        <td>thread-safe and can be shared between multiple threads in the application</td>
        <td>can’t be accessed by multiple threads without additional synchronization code. We can use Collections.synchronizedMap() to make a thread-safe version of a HashMap.</td>
    </tr>
    <tr>
        <td>doesn’t allow null at all</td>
        <td>allows adding one Entry with null as key as well as many entries with null as value.</td>
    </tr>
</table>

# [Queue](Basics/src/LearningQueues.java)

Since Queue is an interface, objects cannot be created of the type queue. We always need a class which extends this list in order to create an object.

```java
// Declaration of queue
Queue<String> queue = new LinkedList<>();

// Adding elements
queue.add("Element");

// Popping elements
queue.remove();

// Peeking at the top element
queue.peek();
```

# [Heap](Basics/src/Heap.java)
```java
// Min Heap
PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

// Max Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
```
