import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        int[] array = {4,5,3,6,1};

        // Min heap -> the min element is always at the top
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        // Add elements
        for(int element:array) {
            minHeap.add(element);
        }

        // Display elements of min heap
        System.out.println(minHeap);

        // Removing elements
        System.out.println("Popping elements of min heap");
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.remove());
        }

        // Max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());

        // Add elements
        for (int element:array) {
            maxHeap.add(element);
        }

        // Display contents of max heap
        System.out.println(maxHeap);

        // Removing elements
        System.out.println("Popping elements of max heap");
        while(!maxHeap.isEmpty()) {
            System.out.println(maxHeap.remove());
        }
    }
}
