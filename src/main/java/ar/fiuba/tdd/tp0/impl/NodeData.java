package ar.fiuba.tdd.tp0.impl;

import ar.fiuba.tdd.tp0.Node;

/**
 * Created by mcapolupo on 27/8/16.
 */
public class NodeData<T> implements Node<T> {

    private Node next = new NodeEmpty(this);
    private T data;
    private static final int NODE_DATA_SIZE = 1;

    public NodeData() {}

    public NodeData(T data) {
        this.data = data;
    }

    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public int getSize() {
        return getDefaultSize() + next.getSize();
    }

    @Override
    public int getDefaultSize() {
        return NODE_DATA_SIZE;
    }

    @Override
    public void setNext(Node<T> node) {
        this.next = node;
    }

    @Override
    public void setNext(NodeData<T> node) {
        this.next.setNext(node);
    }

    @Override
    public void setNext(NodeEmpty<T> node) {
        this.next = node;
    }

    public void replaceNext(NodeData<T> node) {
        this.next = node;
    }
}
