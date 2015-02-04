

import java.util.ArrayList;


public class LandAnimal extends Animal
	{
	
	protected String OnLand = "This animal gives birth, lives, and dies on land.";

	public LandAnimal(int age, String AnimalName, String yourName, String O)
		{
		super(age, AnimalName, yourName);
		OnLand = O;
		}

	public String getOnLand()
	{
		return OnLand;
	}
	
@Override
	public String toString() {
		return getOnLand() + getAnimalName() + getAge() + getYourName();
	}

	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}