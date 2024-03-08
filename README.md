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

# List

## List is empty -> returns true or false.
```java
list.isEmpty();
```

## if list contains an element
```java
System.out.println(list.contains(5));
```

## List that is not initialized with items.
```java
List<Integer> l = new ArrayList<Integer>();
l.add(1);
l.add(2);

// Print the contents of the list
System.out.println(Arrays.toString(l.toArray()));
```
## List that is initialized with items and we can add items to it later.
```java
List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
list.add(5);

// Display the contents of the list
System.out.println(Arrays.toString(list.toArray()));
```

# Hash Map
## number of keys present in hash map
```java
System.out.println("Length of hash map is "+hashmap.size());
```
## Key = String, Val = int
```java
HashMap<String, Integer> hm = new HashMap<String, Integer>();
hm.put("key1", 1);
hm.put("key2", 2);
System.out.println(hm.get("key1"));
System.out.println(hm.get("key2"));
```
## Key = Integer, Val = List of integers
```java
HashMap<Integer, List<Integer>> hashmap = new HashMap<Integer, List<Integer>>();
hashmap.put(5, new ArrayList<>(Arrays.asList(2, 4)));
hashmap.put(4, new ArrayList<>());
hashmap.put(3, new ArrayList<>());
hashmap.put(2, new ArrayList<>(Arrays.asList(1)));
hashmap.put(1, new ArrayList<>(Arrays.asList(0, 3)));
hashmap.put(0, new ArrayList<>(Arrays.asList(1)));
```
## Iterating through the keys of hash map
```java
for (Integer key : hashmap.keySet()) {
    System.out.println("key is "+key+" value is "+hashmap.get(key));
}
```
