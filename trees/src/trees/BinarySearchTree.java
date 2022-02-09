package trees;

import java.util.Iterator;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements ISearchTree<T>
{

    @Override
    public boolean add(T element)
    {
        return false;
    }

    @Override
    public boolean addAll(T... elements)
    {
        return false;
    }

    @Override
    public boolean contains(T element)
    {
        return false;
    }

    @Override
    public boolean remove(T element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public List<T> inOrder()
    {
        return null;
    }

    @Override
    public List<T> preOrder()
    {
        return null;
    }

    @Override
    public List<T> postOrder()
    {
        return null;
    }

    @Override
    public int treeHeight()
    {
        return 0;
    }

    @Override
    public Iterator<T> iterator()
    {
        return null;
    }

    private class TreeNode
    {
        private T data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T data)
        {
            this.data = data;
        }

        public TreeNode(T data, TreeNode left, TreeNode right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}














