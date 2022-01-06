package model;

/**
 *
 * @author
 * @version
 */
public class Cat
{
    private String name;
    private String breed;
    private String nickname;
    private int age;

    public Cat(String name, String breed, String nickname, int age)
    {
        this.name = name;
        this.breed = breed;
        this.nickname = nickname;
        this.age = age;
    }

    public Cat()
    {
        //???
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
