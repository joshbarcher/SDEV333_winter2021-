package adts;

import java.util.Iterator;

/**
 * Represents a fixed-size queue. It cannot grow beyond
 * the bound returned by capacity().
 *
 * DO NOT EDIT THIS FILE!
 *
 * @param <T> the type of elements in the queue
 *
 * @author Josh Archer
 * @version 1.0
 */
public interface IBoundedQueue<T> extends ICollection<T>
{
    /**
     * Adds an element to the collection if there is room.
     *
     * @param element the element to add'
     * @throws IllegalStateException if the queue is full
     */
    void add(T element);

    /**
     * Returns the bound of the queue (the maximum number
     * of elements)
     *
     * @return the bound of the queue
     */
    int getCapacity();

    /**
     * Returns true if the queue is full.
     *
     * @return true if size == capacity, otherwise false
     */
    boolean isFull();

    /**
     * This method should not include an implementation.
     *
     * @param element the input element to remove
     * @throws UnsupportedOperationException when called
     */
    void remove(T element);

    /**
     * Removes the front element in the queue.
     *
     * @return the front element in the queue
     * @throws java.util.NoSuchElementException if the queue
     * is empty
     */
    T remove();
}
