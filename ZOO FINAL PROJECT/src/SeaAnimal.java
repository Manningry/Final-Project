
import java.util.ArrayList;


public class SeaAnimal extends Animal
	{
	
	protected String InSea = "This animal gives birth, lives, and dies in the sea.";
	protected String call; 

	public SeaAnimal(int age, String AnimalName, String yourName, String c, String I)
		{
		super(age, AnimalName, yourName);
		InSea = I;
		call = c;
		}

	public String getInSea()
	{
		return InSea;
	}
	
	public String getCall()
	{
		return call; 
	}
	
@Override
	public String toString() {
		return getInSea() + getAnimalName() + getAge() + getYourName();
	}

	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
