package equals;

public class TestSpecs
{
    public static void main(String[] args)
    {
        ComputerSpec defaultSpec = new ComputerSpec();
        ComputerSpec mySpec = new ComputerSpec("Intel i7 7700K", 64, true, 5.0);

        System.out.println(defaultSpec);
        System.out.println(mySpec);

        ComputerSpec referenceToDefault = defaultSpec;
        System.out.println(referenceToDefault);

        //let's use == to make a comparison
        System.out.println(defaultSpec == mySpec);

        //let's use the default Object.equals()
        System.out.println(defaultSpec.equals(mySpec));
    }
}
