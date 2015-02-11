

import java.util.ArrayList;


public class LandAnimal extends Animal
	{
	
	protected String OnLand = "This animal gives birth, lives, and dies on land.";
	protected String call; 

	public LandAnimal(int age, String AnimalName, String yourName, String O, String c)
		{
		super(age, AnimalName, yourName);
		OnLand = O;
		call = c;
		}

	public String getOnLand()
	{
		return OnLand;
	}
	
	public String getCall()
		{
		return call; 
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