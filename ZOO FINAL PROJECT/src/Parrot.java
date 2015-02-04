
import java.util.ArrayList;


public class Parrot extends AirAnimal
	{
	
	protected String ParrotFacts = "All parrots have cuved beaks and have four toes on each foot, two forward and two backward. \n Parrots are found in warm climates.";

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
	return getInAir() + getAnimalName() + getAge() + getYourName() + getCall() + getParrotFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
