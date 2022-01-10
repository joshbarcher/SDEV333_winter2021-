package ds;

import java.util.Arrays;

/**
 * A simple data structure with the properties:
 * - fixed size
 * - no access by index
 * - basic methods to add, remove or query for elements
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Bag implements IBag
{
    //fields to store the data and track the status of the bag?
    private Object[] dataArray;
    private int nextAvailableIndex;

    /**
     * Creates a new bag with the specified capacity
     * @param capacity the maximum elements that can be
     *                 placed in the bag
     */
    public Bag(int capacity)
    {
        //preconditions
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Bag capacity must be positive.");
        }

        dataArray = new Object[capacity];
    }

    /**
     * Adds a new element to the bag. If the bag
     * is at capacity then no element is added.
     *
     * @param element the element to put in the bag
     * @return true if the element was added, otherwise false
     */
    @Override
    public boolean add(Object element)
    {
        //precondition
        if (nextAvailableIndex == dataArray.length)
        {
            return false;
        }

        dataArray[nextAvailableIndex] = element;
        nextAvailableIndex++;
        return true;
    }

    /**
     * Returns the number of elements in the bag.
     * @return the element count
     */
    @Override
    public int size()
    {
        return nextAvailableIndex;
    }

    /**
     * Returns the total elements that can fit in
     * the bag before it is full.
     * @return the max capacity of the bag
     */
    @Override
    public int capacity()
    {
        return dataArray.length;
    }

    /**
     * Reports whether an element is in the bag or not.
     *
     * @param element the element to search for
     * @return true if found, or false otherwise
     */
    @Override
    public boolean contains(Object element)
    {
        //NOTE: we only need to loop through the occupied indices
        //and not to the end of the array necessarily
        for (int i = 0; i < nextAvailableIndex; i++)
        {
            //NOTE: it is best to use .equals() and not ==
            if (dataArray[i].equals(element))
            {
                return true; //found it!
            }
        }
        return false; //did not find it!
    }

    /**
     * Removes the first occurrence of the element
     * in the bag, if found. Comparisons are made
     * using the .equals() method of the input
     * element.
     *
     * @param element the element to search for
     * @return true if the element is found and removed,
     * or false otherwise
     */
    @Override
    public boolean remove(Object element)
    {
        //search for the element
        for (int i = 0; i < nextAvailableIndex; i++)
        {
            //if we found it!
            if (dataArray[i].equals(element))
            {
                //shift all higher indices down one spot
                for (int j = i; j < nextAvailableIndex && j < dataArray.length; j++)
                {
                    dataArray[i] = dataArray[i + 1];
                }

                //clear the newly available spot and decrement next available index
                dataArray[nextAvailableIndex - 1] = null;
                nextAvailableIndex--;

                return true; //found it!
            }
        }
        return false;
    }

    /**
     * Removes all elements from the bag. After calling clear,
     * new elements are then placed in an empty bag.
     */
    @Override
    public void clear()
    {
        //reset occuppied indices
        for (int i = 0; i < nextAvailableIndex; i++)
        {
            dataArray[i] = null;
        }

        //reset next available index
        nextAvailableIndex = 0;
    }

    /**
     * Prints out a visualization of the bag as a string.
     * @return the bag contents
     */
    @Override
    public String toString()
    {
        //print out the data array in "pretty print" form
        return "Bag: " + Arrays.toString(dataArray);
    }
}











