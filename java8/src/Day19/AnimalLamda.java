package Day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AnimalLamda {

	public static void main(String[] args) {

			Animal ani1 = new Animal("dog", 4);
			Animal ani2 = new Animal("pig", 2);
			Animal ani3 = new Animal("cat", 8);
			
			List<Animal> animallist = new ArrayList<Animal>();
			animallist.add(ani1);
			animallist.add(ani2);
			animallist.add(ani3);
			
			System.out.println("입력순 : " + animallist);
			
			Collections.sort(animallist, (a, b) -> a.age - b.age);
			System.out.println("오름 : " + animallist);
			
			Collections.sort(animallist, (a, b) -> b.age - a.age);
			System.out.println("내림 : " + animallist);
	}

}
