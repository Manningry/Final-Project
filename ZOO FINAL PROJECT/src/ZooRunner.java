




import java.util.ArrayList;


public class ZooRunner {

	public static void main(String[] args) {
		
		int zooSize = IntroToZoo.createInitialZoo();
		createZoo.createZooLayoutDimensions(zooSize);
		ArrayList <Animal> animal = AddAnimalsToTheZoo.myAnimals();
		createZoo.addAnimals(animal);
	
		
	}

}
