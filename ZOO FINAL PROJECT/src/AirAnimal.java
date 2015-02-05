
import java.util.ArrayList;


public class AirAnimal extends Animal
	{
	
	protected String InAir;
	protected String call; 

	public AirAnimal(int age, String AnimalName, String yourName, String I, String c)
		{
		super(age, AnimalName, yourName);
		InAir = I;
		call = c;
		
		}

	public String getInAir()
	{
		return InAir;
	}
	
	public String getCall()
		{
		return call;
		}
	
@Override
	public String toString() {
		return getInAir() + getAnimalName() + getAge() + getYourName() + getCall();
	}

	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}