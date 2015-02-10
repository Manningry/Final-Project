
import java.util.ArrayList;


public class Parrot extends AirAnimal
	{
	
	protected String ParrotFacts;

	public Parrot(int age, String AnimalName, String yourName, String I, String c, String pf)
		{
		super(age, AnimalName, yourName, I, c);
		ParrotFacts = pf;
		}

	public String getParrotFacts()
		{
		return ParrotFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getInAir() +
			   "\nParrot Facts:\t" + getParrotFacts(); 
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
