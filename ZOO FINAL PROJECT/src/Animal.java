import java.util.ArrayList;


public class Animal
	{
static ArrayList <Animal> animal = new ArrayList <Animal> ();
protected String name;	
protected int age;
	
	
	
public Animal (int a, String n)
	{
	age = a;
	name = n;
	}

public static ArrayList <Animal> myAnimals()
{
	animal.add(new Animal(14, "Boo"));
	animal.add(new Animal(15, "Bob"));
	animal.add(new Animal(13, "Hoo"));
	return animal;
}

public String getName()
	{
	return name;
	}

public int getAge()
{
	return age;
}

@Override
public String toString() {
	return getAge() + getName();
}






	}
