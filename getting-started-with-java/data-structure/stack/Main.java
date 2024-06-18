import stack.Stack;
import stack.components.Node;

/**
 * Main
 */
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create a new stack
        Stack stack = new Stack(99);

        // Test push method
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Test getTop method
        Node<Integer> top = stack.getTop();
        System.out.println("Top item: " + top.getData()); // Expected output: 15

        // Test getHeight method
        int height = stack.getHeight();
        System.out.println("Stack height: " + height); // Expected output: 3

        // Test print method
        System.out.println("Stack items:");
        stack.print();
        // Expected output:
        // 15
        // 10
        // 5

        // Test pop method
        Node<Integer> poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem.getData()); // Expected output: 15

        // Test isEmpty method
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty); // Expected output: false

        // Test pop method
        poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem.getData()); // Expected output: 10

        // Test pop method
        poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem.getData()); // Expected output: 5

        poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem.getData());// Expected output: 99

        // Test isEmpty method
        isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty); // Expected output: true
    }
}