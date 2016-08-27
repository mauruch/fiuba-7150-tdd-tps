package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.impl.NodeData;
import ar.fiuba.tdd.tp0.impl.NodeEmpty;

/**
 * Created by mcapolupo on 27/8/16.
 */
public interface Node<T> {

    public Node<T> getNext();

    public T getData();

    public int getSize();

    public int getDefaultSize();

    public void setNext(Node<T> node);

    public void setNext(NodeData<T> node);

    public void setNext(NodeEmpty<T> node);
}
