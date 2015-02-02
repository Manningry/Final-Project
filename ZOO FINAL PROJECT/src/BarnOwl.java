
public class BarnOwl extends Owl
	{

public BarnOwl(int age, String name, String fly, double flySpeed)
	{
	super(age, name, fly);
	double fS = flySpeed;
	}

public static void addAnimal()
	{
	zooAnimals.add(new BarnOwl(14, "Jim", "Fly homie", 101));
	}
	
	}
