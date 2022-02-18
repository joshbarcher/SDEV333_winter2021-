package driver;

import trees.BinarySearchTree;

import java.util.List;

public class TestTree
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        boolean allSuccessful = tree.addAll(10, 5, 21, 3, 7, 15, 30, 1, 6, 45);

        /*System.out.println("All successful? " + allSuccessful);
        System.out.println("Is 0 in the tree? " + tree.contains(0));
        System.out.println("Is 6 in the tree? " + tree.contains(6));*/

        //boolean removedSuccessful = tree.remove(10);
        //System.out.println("Removed 7 - " + removedSuccessful);
        //System.out.println();

        //test root, internal and leaf nodes
        int root = tree.root();
        List<Integer> leaves = tree.leafValues();
        List<Integer> internals = tree.internalValues();

        System.out.println("Root: " + root);
        System.out.println();

        for (int i = 0; i < leaves.size(); i++)
        {
            System.out.println("Leaf: " + leaves.get(i));
        }
        System.out.println();

        for (int i = 0; i < internals.size(); i++)
        {
            System.out.println("Internal: " + internals.get(i));
        }
        System.out.println();

        //test invert
        System.out.println("In-order");
        for (int element : tree.inOrder())
        {
            System.out.println(element);
        }
        System.out.println();

        tree.invert();

        System.out.println("In-order after invert()");
        for (int element : tree.inOrder())
        {
            System.out.println(element);
        }
        System.out.println();
    }
}
