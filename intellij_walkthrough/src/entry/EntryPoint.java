package entry;

/**
 * This starts my program.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class EntryPoint
{
    /**
     * This main() method is the entry point of my application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("hello world!");

        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);
        }

        boolean isTrue = true;
        if (isTrue)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("World");
        }
    }
}
