
import java.util.ArrayList;


public class Moose extends LandAnimal
	{
	
	protected String MooseFacts = "Moose are the largest of the deer family. \n\t\tMales can be recognized by their large antlers, some of\n\t\twhich can grow up to 6 feet wide.";
	public Moose(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		MooseFacts = of;
		}

	public String getMooseFacts()
		{
		return MooseFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getOnLand() +
			   "\nMoose Facts:\t" + getMooseFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
