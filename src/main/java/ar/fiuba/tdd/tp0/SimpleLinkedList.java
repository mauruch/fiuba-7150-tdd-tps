package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.impl.NodeData;
import ar.fiuba.tdd.tp0.impl.NodeFirst;

/**
 * Created by mcapolupo on 27/8/16.
 */
public class SimpleLinkedList<T> {

    private Node<T> first;

    public SimpleLinkedList() {
        this.first = new NodeFirst();
    }

    public SimpleLinkedList(T data) {
        this.first = new NodeData(data);
    }

    public void add(T item) {
        first.setNext(new NodeData(item));
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return first.getNext().getSize();
    }

    public T topData() {
        return first.getNext().getData();
    }

    public void removeTop() {
        first.setNext(first.getNext().getNext());
    }
}
