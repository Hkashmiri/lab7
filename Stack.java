package edu.desu;

public class Stack<T> {
    private Node top;
    private int size;


    public void push(T data) {
    }

    public T pop() {
        return null;
    }

    public T peek() {
        return null;
    }

    public Boolean isEmpty() {
        return  null;
    }

    public int size() {
        return -1;
    }
}

=======
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        T data = top.getData();
        top = top.getNextNode();
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
