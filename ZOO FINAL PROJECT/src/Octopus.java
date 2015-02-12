
import java.util.ArrayList;


public class Octopus extends SeaAnimal
	{
	
	protected String OctopusFacts = "Octopuses are the first invertebrates to solve problems using \n\t\ttools like coconut shells and rocks. They learn easily!";

	public Octopus(int age, String AnimalName, String yourName, String I, String o, String of)
		{
		super(age, AnimalName, yourName, I, o);
		OctopusFacts = of;
		}

	public String getEFacts()
		{
		return OctopusFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getInSea() +
			   "\nOctopus Facts:\t" + getEFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}


