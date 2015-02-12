
import java.util.ArrayList;


public class Sloth extends LandAnimal
	{
	
	protected String SlothFacts = "Sloths only poop once a week. They can turn their\n\t\theads 270 degrees. ";

	public Sloth (int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		SlothFacts = of;
		}

	public String getSlothFacts()
		{
		return SlothFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getOnLand() +
			   "\nSloth Facts:\t" + getSlothFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
