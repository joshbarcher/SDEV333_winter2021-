package equals;

public class Cat
{
    private int age;
    private String name;
    private boolean longHair;

    public Cat(int age, String name, boolean longHair)
    {
        this.age = age;
        this.name = name;
        this.longHair = longHair;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;

        if (age != cat.age) return false;
        if (longHair != cat.longHair) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (longHair ? 1 : 0);
        return result;
    }
}
