
import java.util.ArrayList;


public class Wolf extends LandAnimal
	{
	
	protected String WolfFacts =  "Wolves contain 42 razor sharp teeth. At birth they weigh one pound. \n\t\tThey can spring 36-38 mph for short distances.";

	public Wolf(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		WolfFacts = of;
		}

	public String getWolfFacts()
		{
		return WolfFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getOnLand() +
			   "\nWolf Facts:\t" + getWolfFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
