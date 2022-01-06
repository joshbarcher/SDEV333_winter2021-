package ds;

import java.util.Arrays;

public class Bag implements IBag
{
    //fields to store the data and track the status of the bag?
    private Object[] dataArray;
    private int nextAvailableIndex;

    public Bag(int capacity)
    {
        //preconditions
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Bag capacity must be positive.");
        }

        dataArray = new Object[capacity];
    }

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

    @Override
    public int size()
    {
        return nextAvailableIndex;
    }

    @Override
    public int capacity()
    {
        return dataArray.length;
    }

    @Override
    public boolean contains(Object element)
    {
        return false;
    }

    @Override
    public boolean remove(Object element)
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public String toString()
    {
        //print out the data array in "pretty print" form
        return "Bag: " + Arrays.toString(dataArray);
    }
}











