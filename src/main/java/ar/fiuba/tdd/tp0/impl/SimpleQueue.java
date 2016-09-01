package ar.fiuba.tdd.tp0.impl;

import ar.fiuba.tdd.tp0.Queue;
import ar.fiuba.tdd.tp0.SimpleLinkedList;

/**
 * Created by mcapolupo on 27/8/16.
 */
public class SimpleQueue<T> implements Queue<T> {

    private SimpleLinkedList<T> linkedList;

    public SimpleQueue() {
        this.linkedList = new SimpleLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public void add(T item) {
        linkedList.add(item);
    }

    @Override
    public T top() {
        return linkedList.topData();
    }

    @Override
    public void remove() {
        linkedList.removeTop();
    }
}
