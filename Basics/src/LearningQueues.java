import java.util.LinkedList;
import java.util.Queue;

public class LearningQueues {
    public static void main(String[] args) {
        // Declaring a queue
        Queue<String> queue = new LinkedList<String>();

        // Adding elements in queue
        for (int i = 0; i < 5; i++) {
            queue.add("Element"+i);
        }

        // Displaying contents of queue
        System.out.println(queue);

        // Peeking at the top of queue
        String top = queue.peek();
        System.out.println("Top of queue is "+top);

        // Removing elements of the queue
        while(!queue.isEmpty()) {
            top = queue.remove();
            System.out.println("Popped element is "+top);
        }

    }
}
