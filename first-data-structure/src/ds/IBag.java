package ds;

public interface IBag<T>
{
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    int capacity();
    void clear();
}
