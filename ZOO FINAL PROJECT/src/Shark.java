
import java.util.ArrayList;


public class Shark extends SeaAnimal
	{
	
	protected String SharkFacts = "The Great White Shark averages between 15 and 20 feet in length.\n\t\tThey can reach speeds up to 15mph!";

	public Shark(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		SharkFacts = of;
		}

	public String getEFacts()
		{
		return SharkFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getInSea() +
			   "\nShark Facts:\t" + getEFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}

