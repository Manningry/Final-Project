



import java.util.ArrayList;


public class Owl extends AirAnimal
	{
	
	protected String owlFacts = "There are 200 different kinds of owl species. \nOwls are active at night (nocturnal). \nA group of owls is called a parliament.";

	public Owl(int age, String AnimalName, String yourName, String I, String c, String of)
		{
		super(age, AnimalName, yourName, I, c);
		owlFacts = of;
		}

	public String getOwlFacts()
		{
		return owlFacts;
		}
	
	
@Override
	public String toString()
	{
	return "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name:\t" + getYourName() +
			   "\nAnimal Age:\t" + getAge() + " years old." +
			   "\nAnimal Call:\t" + getCall() +
			   "\nHabitat:\t" + getInAir() +
			   "\nOwl Facts:\t" + getOwlFacts();
	}


	
	public static ArrayList <Animal> myAnimals()
	{
		return animal;
	}
	


	
	}
