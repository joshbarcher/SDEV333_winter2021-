package ds;

public interface IBag
{
    boolean add(Object element);
    boolean remove(Object element);
    boolean contains(Object element);
    int size();
    int capacity();
    void clear();
}
