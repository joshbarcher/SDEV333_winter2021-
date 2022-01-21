package driver;

import ds.Bag;

public class BagTest
{
    public static void main(String[] args)
    {
        //test our data structure in here...
        Bag<String> bagOfColors = new Bag<String>(7);

        //add a few colors
        bagOfColors.add("blue");
        bagOfColors.add("beige");
        bagOfColors.add("teal");
        bagOfColors.add("gray");
        bagOfColors.add("black");
        bagOfColors.add("dark blue");

        String color = bagOfColors.pickOne();
        System.out.println(color.toUpperCase());

        /*bagOfColors.add("purple");
        bagOfColors.add("white");
        bagOfColors.add("yellow");*/

        //see if the bag reports the state of itself correctly!
        System.out.println("Size: " + bagOfColors.size());
        System.out.println("Capacity: " + bagOfColors.capacity());
        System.out.println("How full? " + bagOfColors.size() + "/" + bagOfColors.capacity());

        //try to use our Bag object with a for-each
        for (String eachColor : bagOfColors)
        {
            System.out.println(eachColor);
        }
    }
}





















