package stack;

import stack.components.Node;
import stack.interfaces.Istack;

public class Stack implements Istack {
    @SuppressWarnings("rawtypes")
    private Node top;
    private int height;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <T> Stack(T data) {
        this.top = new Node(data);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void push(int item) {
        /*
         * Adds a new item to the top of the stack
         */

        if (this.top == null) {
            this.top = new Node(item);
            this.height++;
            return;
        }

        Node newNode = new Node(item);
        newNode.next = this.top;
        this.top = newNode;

        this.height++;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public <T> Node pop() {
        /*
         * Removes an item from the top of the stack
         */

        if (this.top == null)
            return null;

        Node currentTop = this.top;

        this.top = currentTop.next;

        this.height--;

        return currentTop;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public <T> Node getTop() {
        /*
         * Returns the top item of the stack
         */

        return this.top;
    }

    @Override
    public int getHeight() {
        /*
         * Returns the height of the stack
         */

        return this.height;
    }

    @Override
    public void print() {
        /*
         * Prints the stack
         */

        @SuppressWarnings("rawtypes")
        Node current = this.top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    @Override
    public boolean isEmpty() {
        /*
         * Returns true if the stack is empty, false otherwise
         */

        return this.top == null;
    }

}