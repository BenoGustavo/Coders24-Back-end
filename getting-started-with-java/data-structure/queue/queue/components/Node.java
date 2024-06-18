package queue.components;

public class Node<T> {
    public T data;
    public Node<T> next = null;
    public Node<T> previous = null;

    public Node(T data) {
        this.data = data;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
