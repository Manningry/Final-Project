
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
	return getInAir() + getAnimalName() + getAge() + getYourName() + getCall() + getToucanFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}


