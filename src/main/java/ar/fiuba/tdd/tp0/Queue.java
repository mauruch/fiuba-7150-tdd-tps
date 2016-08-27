package ar.fiuba.tdd.tp0;

/**
 * Created by mcapolupo on 27/8/16.
 */
public interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top();

    void remove();
}
