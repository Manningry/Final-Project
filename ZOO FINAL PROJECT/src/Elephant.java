
import java.util.ArrayList;


public class Elephant extends LandAnimal
	{
	
	protected String EFacts = "Elephants are the largest land-living mammal in the world!\nAn elephant can use its tusks to dig for ground water. They drink\n210 litres of water per day.";

	public Elephant(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		EFacts = of;
		}

	public String getEFacts()
		{
		return EFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getOnLand() +
			   "\nElephant Facts:\t" + getEFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
