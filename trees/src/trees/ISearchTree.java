package trees;

import java.util.List;

public interface ISearchTree<T extends Comparable<T>> extends Iterable<T>
{
    //basic operations
    boolean add(T element);
    boolean addAll(T... elements);
    boolean contains(T element);
    boolean remove(T element);
    int size();
    boolean isEmpty();

    //exercises
    T min();
    T max();
    T root();
    List<T> leafValues();
    List<T> internalValues();
    void invert();

    //fancy operations
    List<T> inOrder();
    List<T> preOrder();
    List<T> postOrder();
    int treeHeight();
}
