
import java.util.ArrayList;


public class BaldEagle extends AirAnimal
	{
	
	protected String EagleFacts = "Bald eagles are not actually bald, the name derives from older meaning \nof \"white headed\". The sexes are identical\n in plummage, but females are 25% bigger than males.";

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

