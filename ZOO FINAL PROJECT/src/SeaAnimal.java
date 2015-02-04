
import java.util.ArrayList;


public class SeaAnimal extends Animal
	{
	
	protected String InSea = "This animal gives birth, lives, and dies in the sea.";

	public SeaAnimal(int age, String AnimalName, String yourName, String I)
		{
		super(age, AnimalName, yourName);
		InSea = I;
		}

	public String getInSea()
	{
		return InSea;
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
