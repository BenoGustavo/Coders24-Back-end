package linkedlist.interfaces;

import linkedlist.components.Node;

public interface LinkedListInterface<T> {
    // Insert values
    public void append(T data);

    public void prepend(T data);

    public void append(T data, int index);

    // Read values
    public void printFromBeginning();

    public void printFromEnd();

    public void printFromIndex(int index);

    // delete values
    @SuppressWarnings("rawtypes")
    public Node pop();

    public void deleteHead();

    public void deleteFromPosition(int index);

    // get values
    public int getLength();

    public boolean isEmpty();

    public void makeEmpty();
}