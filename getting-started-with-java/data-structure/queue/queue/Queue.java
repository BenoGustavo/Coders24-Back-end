package queue;

import queue.components.Node;
import queue.interfaces.IQueue;

public class Queue implements IQueue {

    @SuppressWarnings("rawtypes")
    private Node head = null;
    private int size = 0;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T> Queue(T data) {
        this.head = new Node(data);
        this.size++;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public <T> void enqueue(T item) {
        /*
         * Insert a item in a queue
         */

        if (head == null) {
            this.head = new Node(item);
            return;
        }

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        this.size++;
        current.next = new Node(item);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Node dequeue() {
        /*
         * Remove the first item in a queue
         */

        if (this.head == null) {
            return null;
        }

        if (this.head.next == null) {
            this.size--;
            Node current = this.head;
            this.head = null;
            return current;
        }

        this.size--;
        Node current = this.head;
        this.head = this.head.next;

        return current;
    }

    @Override
    public void print() {
        /*
         * Print all items in a queue
         */

        if (this.head == null) {
            System.out.println("Queue is empty");
        }

        @SuppressWarnings("rawtypes")
        Node current = this.head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    @SuppressWarnings("rawtypes")
    @Override
    public Node getFirst() {
        /*
         * Get the first item in a queue
         */

        return this.head;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Node getLast() {
        /*
         * Get the last item in a queue
         */

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        return current;
    }

    @Override
    public int getLength() {
        /*
         * Get the length of a queue
         */

        return this.size;
    }

    @Override
    public boolean isEmpty() {
        /*
         * Check if a queue is empty
         */

        return this.head == null;
    }

}