package ar.fiuba.tdd.tp0.impl;

import ar.fiuba.tdd.tp0.Node;

/**
 * Created by mcapolupo on 27/8/16.
 */
public class NodeEmpty<T> implements Node<T> {

    NodeData<T> previous;
    private static final int NODE_EMPTY_SIZE = 0;

    public NodeEmpty(NodeData<T> node) {
        this.previous = node;
    }

    @Override
    public NodeData<T> getNext() {
        throw new AssertionError("invalid access");
    }

    @Override
    public T getData() {
        throw new AssertionError("invalid access");
    }

    @Override
    public int getSize() {
        return NODE_EMPTY_SIZE;
    }

    @Override
    public int getDefaultSize() {
        return NODE_EMPTY_SIZE;
    }

    @Override
    public void setNext(Node<T> node) {}

    @Override
    public void setNext(NodeData<T> node) {
        this.previous.replaceNext(node);
    }

    @Override
    public void setNext(NodeEmpty<T> node) {}

}
