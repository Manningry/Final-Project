
import java.util.ArrayList;


public class BaldEagle extends AirAnimal
	{
	
	protected String EagleFacts;

	public BaldEagle(int age, String AnimalName, String yourName, String I, String c, String ef)
		{
		super(age, AnimalName, yourName, I, c);
		EagleFacts = ef;
		}

	public String getEagleFacts()
		{
		return EagleFacts;
		}
	
	
@Override
	public String toString()
	{
	return getInAir() + getAnimalName() + getAge() + getYourName() + getCall() + getEagleFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}

