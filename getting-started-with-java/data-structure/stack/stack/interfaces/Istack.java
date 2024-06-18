package stack.interfaces;

import stack.components.Node;

public interface Istack {
    public void push(int item);

    @SuppressWarnings("rawtypes")
    public <T> Node pop();

    @SuppressWarnings("rawtypes")
    public <T> Node getTop();

    public int getHeight();

    public void print();

    public boolean isEmpty();

}
