package linkedlist;

import linkedlist.components.Node;
import linkedlist.interfaces.LinkedListInterface;

public class LinkedList<T> implements LinkedListInterface<Object> {
    @SuppressWarnings("rawtypes")
    private Node head;
    private int length = 0;

    public LinkedList(T data) {
        this.head = new Node<>(data);
        this.length++;
    }

    @SuppressWarnings("rawtypes")
    private Node getLastNode(Node currentNode) {
        if (currentNode.next == null) {
            return currentNode;
        }

        return getLastNode(currentNode.next);
    }

    @SuppressWarnings("rawtypes")
    private Node getAntepenultimate() {
        Node current = this.head;

        for (int i = 0; i < this.length - 2; i++) {
            current = current.getNext();
        }

        return current;
    }

    @SuppressWarnings("rawtypes")
    private Node getNodeAtIndex(int index) {
        Node current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void append(Object data) {
        /**
         * Appends a new element at the end of the linked list.
         *
         * @param data The data of the new element to be appended.
         */

        if (this.head == null) {
            this.head = new Node<>(data);
            this.length++;
            return;
        }

        Node current = this.head;

        current = this.getLastNode(current);

        current.next = new Node<>(data);

        current.next.previous = current;

        this.length++;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void prepend(Object data) {
        /**
         * Prepends a new element at the beginning of the linked list.
         *
         * @param data The data of the new element to be prepended.
         */

        Node newHead = new Node<>(data);

        newHead.next = this.head;
        this.head = newHead;
        this.length++;

        newHead.next.previous = newHead;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void append(Object data, int index) {
        /**
         * Appends a new element at the specified index in the linked list.
         * If the index is 0, the new element is added to the beginning of the list.
         *
         * @param data  The data of the new element to be appended.
         * @param index The index at which the new element should be inserted.
         * @throws IndexOutOfBoundsException if the index is out of the range (index < 0
         *                                   || index > length).
         */

        if (index > this.length || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            prepend(data);
            return;
        }

        Node newNode = new Node<>(data);

        Node current = this.head;

        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        newNode.next = current.next;
        current.next = newNode;

        current.next.previous = current;

        this.length++;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Node pop() {
        /**
         * Removes the last element from the linked list and returns it.
         */

        if (this.head.next == null || this.head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        Node current = this.getAntepenultimate();

        Node deletedNode = current.next;
        current.next = (null);

        this.length--;

        return deletedNode;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void deleteHead() {
        /**
         * Removes the first element from the linked list.
         */

        if (this.head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        this.head = this.head.next;
        this.head.previous = null;
        this.length--;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void deleteFromPosition(int index) {
        /**
         * Removes the element at the specified index from the linked list.
         *
         * @param index The index of the element to be removed.
         * @throws IndexOutOfBoundsException if the index is out of the range (index < 0
         *                                   || index >= length).
         */

        if (index < 0 || index >= this.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            deleteHead();
            return;
        }

        Node current = this.head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        current.next.previous = current;

        this.length--;
    }

    @Override
    public int getLength() {
        /*
         * Returns the length of the linked list.
         */
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        /*
         * Returns true if the linked list is empty, false otherwise.
         */

        return this.length == 0;
    }

    @Override
    public void makeEmpty() {
        /*
         * Removes all elements from the linked list.
         */

        this.head = null;
        this.length = 0;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void printFromBeginning() {
        /**
         * Prints the linked list from the beginning to the end.
         */
        Node current = this.head;

        int count = 0;
        while (current != null) {
            System.out.println("Index: " + count + " - value: " + current.getData());
            count++;
            current = current.getNext();
        }
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void printFromEnd() {
        /*
         * Prints the linked list from the end to the beginning.
         */
        Node current = this.head;

        current = this.getLastNode(current);

        int countIndexReverse = this.length - 1;
        while (current.previous != null) {
            System.out.println("Index: " + countIndexReverse + " - value: " + current.getData());
            current = current.previous;
            countIndexReverse--;
        }
        System.out.println("Index: " + countIndexReverse + " - value: " + current.getData());

    }

    @SuppressWarnings("rawtypes")
    @Override
    public void printFromIndex(int index) {
        /*
         * prints the linked list from the specified index to the end.
         * throws IndexOutOfBoundsException if the index is out of the range
         */

        if (index < 0 || index > this.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = this.head;

        current = this.getNodeAtIndex(index);

        while (current.next != null) {
            System.out.println("Index: " + index + " - value: " + current.getData());
            current = current.next;
            index++;
        }

        System.out.println("Index: " + index + " - value: " + current.getData());
    }
}
