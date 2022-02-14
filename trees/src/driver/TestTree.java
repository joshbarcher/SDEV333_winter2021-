package driver;

import trees.BinarySearchTree;

public class TestTree
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        boolean allSuccessful = tree.addAll(7, 13, 5, 2, 0, 5, 3, 4);
        System.out.println("All successful? " + allSuccessful);
    }
}
