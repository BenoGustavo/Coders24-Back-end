package queue.interfaces;

import queue.components.Node;

public interface IQueue {
    @SuppressWarnings("rawtypes")
    public void enqueue(Node item);

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