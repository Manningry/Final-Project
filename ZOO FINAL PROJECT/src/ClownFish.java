
import java.util.ArrayList;


public class ClownFish extends SeaAnimal
	{
	
	protected String CFFacts = "Clown Fish measure 4.3 inches in length. They are named\n\t\t\because of their multicolored sea anemone in which they live";

	public ClownFish(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		CFFacts = of;
		}

	public String getEFacts()
		{
		return CFFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getInSea() +
			   "\nClown Fish Facts:\t" + getEFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}


