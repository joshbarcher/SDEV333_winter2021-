package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreakThings
{
    public static void main(String[] args)
    {
        List<Integer> listOfNums = new LinkedList<>();

        //how long will this take to complete?
        //System.out.println("Adding elements");
        for (int i = 1; i <= 10000000; i++)
        {
            listOfNums.add(i);
        }
        //System.out.println("All done");

        System.out.println("Selecting elements");
        for (int i = 0; i < listOfNums.size(); i++)
        {
            int element = listOfNums.get(i);

            //do something...
        }
        System.out.println("All done");
    }
}
