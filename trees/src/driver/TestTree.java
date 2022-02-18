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
        System.out.println("Root: " + root);
        System.out.println();

        System.out.println("Leaves *******************");
        List<Integer> leaves = tree.leafValues();
        for (int i = 0; i < leaves.size(); i++)
        {
            System.out.println("Leaf: " + leaves.get(i));
        }
        System.out.println();

        System.out.println("Internal nodes *******************");
        List<Integer> internals = tree.internalValues();
        for (int i = 0; i < internals.size(); i++)
        {
            System.out.println("Internal: " + internals.get(i));
        }
        System.out.println();

        //test our inOrder() and invert()
        List<Integer> sorted = tree.inOrder();
        for (int i = 0; i < sorted.size(); i++)
        {
            System.out.println(sorted.get(i));
        }
        System.out.println();

        tree.invert();

        List<Integer> reverseSorted = tree.inOrder();
        for (int i = 0; i < reverseSorted.size(); i++)
        {
            System.out.println(reverseSorted.get(i));
        }
        System.out.println();
    }
}


















