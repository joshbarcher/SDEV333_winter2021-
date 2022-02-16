package driver;

import trees.BinarySearchTree;

public class TestTree
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        boolean allSuccessful = tree.addAll(10, 5, 21, 3, 7, 15, 30, 1, 6, 45);

        /*System.out.println("All successful? " + allSuccessful);
        System.out.println("Is 0 in the tree? " + tree.contains(0));
        System.out.println("Is 6 in the tree? " + tree.contains(6));*/

        boolean removedSuccessful = tree.remove(10);

        System.out.println("Removed 7 - " + removedSuccessful);
    }
}
