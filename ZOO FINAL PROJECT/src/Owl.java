



import java.util.ArrayList;


public class Owl extends Animal
	{
	
	protected String fly;

	public Owl(int age, String name, String f)
		{
		super(age, name);
		fly = f;
		}

	public String getf()
	{
		return fly;
	}
	
@Override
	public String toString() {
		return getf() + getName() + getAge();
	}

	//	
	public static ArrayList <Animal> myAnimals()
	{
		animal.add(new Animal(14, "Boo"));
		animal.add(new Animal(15, "Bob"));
		animal.add(new Animal(13, "Hoo"));
		animal.add(new Owl(13, "Bill", "Fly Away"));
		return animal;
	}
	


	
	}
