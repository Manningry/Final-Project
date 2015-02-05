
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
	return getInAir() + getAnimalName() + getAge() + getYourName() + getCall() + getFlamingoFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}

