package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.impl.SimpleQueue;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mcapolupo on 27/8/16.
 */
public class SimpleQueueTests {

    @Test
    public void testIsEmpty() {
        //Arrange
        Queue<String> stringQueue = new SimpleQueue<>();

        //Call method
        boolean isEmpty = stringQueue.isEmpty();

        //Asserts
        assertTrue(isEmpty);
    }

    @Test
    public void testSize() {
        //Arrange
        Queue<String> stringQueue = new SimpleQueue<>();
        stringQueue.add("item1");
        stringQueue.add("item2");

        //Call method
        int size = stringQueue.size();

        //Asserts
        assertEquals(2, size);
    }

    @Test
    public void testTop() {
        //Arrange
        Queue<String> stringQueue = new SimpleQueue<>();
        stringQueue.add("item1");

        //Call method
        String top = stringQueue.top();

        //Assert
        assertEquals("item1", top);
    }

    @Test
    public void testTopWhenQueueIsEmptyShouldThrowException() {
        Queue<String> stringQueue = new SimpleQueue<>();
        try {
            stringQueue.top();
            fail("method should throw AssertionError");
        } catch (AssertionError e) {
            assertEquals("invalid access", e.getMessage());
        }
    }

    @Test
    public void testRemove() {
        //Arrange
        Queue<String> stringQueue = new SimpleQueue<>();
        stringQueue.add("item1");

        //Call method
        stringQueue.remove();

        //Asserts
        assertTrue(stringQueue.isEmpty());
    }

    @Test
    public void testRemoveWhenQueueIsEmptyShouldThrowException() {
        Queue<String> stringQueue = new SimpleQueue<>();
        try {
            stringQueue.remove();
            fail("method should throw AssertionError");
        } catch (AssertionError e) {
            assertEquals("invalid access", e.getMessage());
        }
    }

}
