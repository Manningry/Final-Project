
import java.util.ArrayList;


public class Toucan extends AirAnimal
	{
	
	protected String ToucanFacts;

	public Toucan(int age, String AnimalName, String yourName, String I, String c, String ef)
		{
		super(age, AnimalName, yourName, I, c);
		ToucanFacts = ef;
		}

	public String getToucanFacts()
		{
		return ToucanFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age: \t" + getAge() + " years old" + 
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getInAir() + "." +
			   "\nToucan Facts:\t" + getToucanFacts() + ".";
			
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}


