
	
import java.util.ArrayList;


	public class Lion extends Animal
		{
		
		protected String roar;

		public Lion(int age, String name, String r)
			{
			super(age, name);
			roar = r;
			}

		public String getRoar()
		{
			return roar;
		}
		
	@Override
		public String toString() {
			return getRoar() + getName() + getAge();
		}

		//	
		public static ArrayList <Animal> myAnimals()
		{
			animal.add(new Lion(3, "Jorge", "ROARRRR"));
			return animal;
		}
	}
