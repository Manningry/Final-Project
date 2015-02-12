
	
import java.util.ArrayList;


public class Lion extends LandAnimal
	{
	
	protected String LionFacts = "Lions are usually referred to as King of The Jungle! \n\t\tOnly 21,000 remain in all of Africa today.";

	public Lion(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		LionFacts = of;
		}

	public String getLionFacts()
		{
		return LionFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getOnLand() +
			   "\nLion Facts:\t" + getLionFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
