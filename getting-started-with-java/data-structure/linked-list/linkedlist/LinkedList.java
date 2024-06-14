package linkedlist;

import linkedlist.components.Node;
import linkedlist.interfaces.LinkedListInterface;

public class LinkedList<T> implements LinkedListInterface<Object> {
    private Node head;
    private T data;
    private int length = 0;

    public LinkedList(T data) {
        this.head = new Node<>(data);
        this.data = data;
        this.length++;
    }

    private Node getLastNode(Node currentNode) {
        if (currentNode.getNext() == null) {
            return currentNode;
        }

        return getLastNode(currentNode.getNext());
    }

    @SuppressWarnings("unchecked")
    @Override
    public void append(Object data) {
        /**
         * Appends a new element at the end of the linked list.
         *
         * @param data The data of the new element to be appended.
         */
        Node current = this.head;

        current = this.getLastNode(current);

        current.setNext(new Node<>(data));
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

        newHead.setNext(this.head);
        this.head = newHead;
        this.length++;
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

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Node pop() {
        /**
         * Removes the last element from the linked list and returns it.
         */

        if (this.head.getNext() == null || this.head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        Node current = this.head;

        current = this.getLastNode(current);

        Node deletedNode = current;
        current.setData(null);

        this.length--;

        return deletedNode;
    }

    @Override
    public void deleteHead() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteHead'");
    }

    @Override
    public void deleteFromPosition(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFromPosition'");
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void makeEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeEmpty'");
    }

    @Override
    public void printFromBeginning() {
        Node current = this.head;

        int count = 0;
        while (current != null) {
            System.out.println("Index: " + count + " - value: " + current.getData());
            count++;
            current = current.getNext();
        }
    }

    @Override
    public void printFromEnd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printFromEnd'");
    }

    @Override
    public void printFromIndex(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printFromIndex'");
    }
}
