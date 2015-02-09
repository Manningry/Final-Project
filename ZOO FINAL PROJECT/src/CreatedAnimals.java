
public class CreatedAnimals
	{



protected int age;
protected String animalName;
protected String yourName;
protected String habitat;
protected String call;
protected String funFact;
	
public CreatedAnimals(int a, String aN, String yN, String c, String h, String ff)	
	{
	age = a;
	animalName = aN;
	yourName = yN;
	habitat = h;
	call = c;
	funFact = ff;
	}

public void setAge(int age)
	{
	this.age = age;
	}

public void setAnimalName(String animalName)
	{
	this.animalName = animalName;
	}

public void setYourName(String yourName)
	{
	this.yourName = yourName;
	}

public void setHabitat(String habitat)
	{
	this.habitat = habitat;
	}

public void setCall(String call)
	{
	this.call = call;
	}

public void setFunFact(String funFact)
	{
	this.funFact = funFact;
	}

public int getAge()
	{
	return age;
	}

public String getAnimalName()
	{
	return animalName;
	}

public String getYourName()
	{
	return yourName;
	}

public String getHabitat()
	{
	return habitat;
	}

public String getCall()
	{
	return call;
	}

public String getFunFact()
	{
	return funFact;
	}

@Override
public String toString()
	{
	return  "Animal Species:\t" + getAnimalName() + 
			   "\nAnimal Name\t" + getYourName() +
			   "\nAnimal Call\t" + getCall() +
			   "\nHabitat:\t" + getHabitat() +
			   "\nOwl Facts:\t" + getFunFact();
	}


	
	}
