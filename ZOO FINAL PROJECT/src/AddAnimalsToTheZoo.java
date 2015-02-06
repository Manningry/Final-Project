import java.util.ArrayList;


public class AddAnimalsToTheZoo extends Animal
	{

	public AddAnimalsToTheZoo(int a, String n, String y)
		{
		super(a, n, y);
		// TODO Auto-generated constructor stub
		}



	public static ArrayList <Animal> myAnimals() 
	{
		
	animal.add(new BaldEagle(3, " Bald Eagle ", "Captain Sam", "This animal splits its time between the ground, trees, and in the air.","Merica! Merica!", "Bald eagles are not actually bald, the name derives from older meaning \n\t\tof \"white headed\". The sexes are identical in plummage, but females are 25% bigger than males."));	
	animal.add(new Parrot(22, " Parrot ", "Enrique", "This animal splits its time between the ground, trees, and in the air.", "Polly Wants a Cracker", "All parrots have cuved beaks and have four toes on each foot, two forward and two backward. \n\t\t Parrots are found in warm climates."));
	animal.add(new Owl(11, " Owl     ", "Earl", "This animal splits its time between the ground, trees, and in the air.","Whoo whoo", "There are 200 different kinds of owl species. Owls are active at night (nocturnal). \n\t\tA group of owls is called a parliament."));
	animal.add(new Flamingo(1, " Flamingo ", "Waka", "This animal splits its time between the ground, trees, and in the air.", "Squawk Squawk", "Flamingos have only six known species in the entire world. Despite common belief\n\t\t they can fly! They are a social animal and don't do well unles there are plenty of friends around."));
	animal.add(new Toucan(4, " Toucan ", "Sam", "This animal splits its time between the ground, trees, and in the air.", "FROOOOT LOOOPS", "A Toucan's colorful bill make it one of the most popular\n\t birds in the entire world. Both sexes use their bills to catch\n\t\t fruit and toss them to one another during a mating ritual fruit toss. "));
	
	animal.add(new Animal(14, " Sloth   ", "Louie"));
	animal.add(new Animal(15, " Penguin ", "Happy Feet"));
	animal.add(new Animal(13, " Zebra ", "Charles"));
	animal.add(new Lion(3, "Lion    ", "Jorge"));
	return animal;
	}
	

	}
