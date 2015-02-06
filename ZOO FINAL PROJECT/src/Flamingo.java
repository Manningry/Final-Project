
import java.util.ArrayList;


public class Flamingo extends AirAnimal
	{
	
	protected String FlamingoFacts;

	public Flamingo(int age, String AnimalName, String yourName, String I, String c, String ef)
		{
		super(age, AnimalName, yourName, I, c);
		FlamingoFacts = ef;
		}

	public String getFlamingoFacts()
		{
		return FlamingoFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name\t" + getYourName() +
			   "\nAnimal Call\t" + getCall() +
			   "\nHabitat:\t" + getInAir() +
			   "\nFlamingo Facts:\t" + getFlamingoFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}

