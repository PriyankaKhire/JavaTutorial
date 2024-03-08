import java.util.Stack;

public class LearningStack {
    public static void main(String[] args) {
        // Declaring stack
        Stack<Integer> stack = new Stack<Integer>();

        // Pushing element
        for (int i = 0; i<5; i++) {
            stack.push(i);
        }

        // Displaying contents of stack
        System.out.println(stack);

        // Peeking
        int top = stack.peek();
        System.out.println("Top of stack is "+top);

        // Popping elements from stack
        while(!stack.isEmpty()) {
            top = stack.pop();
            System.out.println("Popped element "+top);
        }
    }
}
