package Day2Exercise2;

import java.util.List;

public class main extends Rodent {
	
	public static void main(String args[]) {
		Rodent rod = new Rodent();
		Gerbil ger = new Gerbil();
		Hamster hams = new Hamster();
		Mouse mous = new Mouse();
		Rodent[] animals = new Rodent[5];
		animals[1] = mous;
		animals[2] = ger;
		animals[3] = hams;
		animals[4] = rod;
		
		
		int numberOfAnimals = (int )(Math.random() * 10 + 1);
		Rodent[] zoo = new Rodent[numberOfAnimals];
		
		for(int x = 0; x < numberOfAnimals; x++) {
			int random = (int )(Math.random() * 4 + 1);
			zoo[x] = animals[random];	
		}
		
		for(Rodent rods : zoo) {
			rods.run();
			rods.speak();
		}
		
	}

}
