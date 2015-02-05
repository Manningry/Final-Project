
	
import java.util.ArrayList;


	public class Lion extends Animal
		{
		

		public Lion(int age, String AnimalName, String yourName)
			{
			super(age, AnimalName, yourName);

			}

		
		
	@Override
		public String toString() {
			return getYourName() + getAnimalName() + getAge();
		}

		//	
		public static ArrayList <Animal> myAnimals()
		{
			return animal;
		}
	}
