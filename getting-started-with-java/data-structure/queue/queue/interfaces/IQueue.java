package queue.interfaces;

import queue.components.Node;

public interface IQueue {
    @SuppressWarnings("rawtypes")
    public <T> void enqueue(T item);

    @SuppressWarnings("rawtypes")
    public Node dequeue();

    public void print();

    @SuppressWarnings("rawtypes")
    public Node getFirst();

    @SuppressWarnings("rawtypes")
    public Node getLast();

    public int getLength();

    public boolean isEmpty();
}