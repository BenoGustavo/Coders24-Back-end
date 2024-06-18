import queue.Queue;
import queue.components.Node;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create a new queue
        Queue queue = new Queue(99);

        // Enqueue items
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Print the queue
        queue.print(); // Output: 10 20 30

        // Dequeue an item
        Node<Integer> dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem.data); // Output: Dequeued item: 10

        // Print the queue after dequeue
        queue.print(); // Output: 20 30

        // Get the first item
        Node<Integer> firstItem = queue.getFirst();
        System.out.println("First item: " + firstItem.data); // Output: First item: 20

        // Get the last item
        Node<Integer> lastItem = queue.getLast();
        System.out.println("Last item: " + lastItem.data); // Output: Last item: 30

        // Get the length of the queue
        int length = queue.getLength();
        System.out.println("Length: " + length); // Output: Length: 2

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is empty: " + isEmpty); // Output: Is empty: false

        // Dequeue an item
        dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem.data);
        // Dequeue an item
        dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem.data);

        // Dequeue an item
        dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem.data);

        // Check if the queue is empty
        isEmpty = queue.isEmpty();

        System.out.println("Is empty: " + isEmpty); // Output: Is empty: true
    }

}