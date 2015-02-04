import java.util.ArrayList;


public class Animal
	{
	
static ArrayList <Animal> animal = new ArrayList <Animal> ();

protected String AnimalName;
protected String yourName;
protected int age;
	
	
	
public Animal (int a, String n, String y)
	{
	age = a;
	AnimalName = n;
	yourName = y;
	}

public static ArrayList <Animal> myAnimals()
{
	return animal;
}

public String getAnimalName()
	{
	return AnimalName;
	}

public String getYourName()
	{
	return yourName;
	}

public int getAge()
{
	return age;
}

@Override
public String toString() {
	return getAge() + getYourName() + getAnimalName();
}






	}
