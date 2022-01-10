package test_storage_classes;

import storage_classes.GenericStorage;
import storage_classes.ObjectStorage;

public class Test
{
    public static void main(String[] args)
    {
        ObjectStorage storage1 = new ObjectStorage("Hello");
        ObjectStorage storage2 = new ObjectStorage(10.2);
        ObjectStorage storage3 = new ObjectStorage(false);

        boolean flag = (Boolean)storage3.getData();
        System.out.println("Flag: " + flag);

        //use our generic class (no redundancy or casting involved!)
        GenericStorage<String> stringStorage = new GenericStorage<String>("Hello");
        GenericStorage<Double> doubleStorage = new GenericStorage<Double>(10.2);
        GenericStorage<Boolean> booleanStorage = new GenericStorage<Boolean>(false);

        System.out.println(stringStorage.getData().toUpperCase());
    }
}
