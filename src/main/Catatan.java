package main;

import java.util.ArrayList;
import java.util.Random;

public  class Catatan {
	Random rand = new Random();
	public Catatan() {
		// upcasting = childclass --> parentclass
		// downcasting = parentclass --> childclass
		// data_type nama_variable = new nama_class()
		Character player = new Berserker("Johnny");
		Character player2 = new Archer("Jeki");
//		System.out.println(player.Dagger);
//		game(player);
		
		// downcasting =
//		Character player2 = new Archer("Jeki");
//		Archer player3 = (Archer player2);
//		System.out.println(player.getDagger);
		
		// primitive casting
		// narrowing -> Dari kompleks ke sederhana
//		double a = 10.99;
//		int b = (int) a;
//		System.out.println(b);
		
		// widening -> dari sederhana ke kompleks
//		int c = 10;
//		double d = c;
//		System.out.println(d);
		
		// data type non primitive ada builtIn function
//		Integer number = 100;
//		number.doubleValue();
		
		// a-- = mengurangi nilai variable 1
		// a++ = menambah nilai variable 1
		
//		for(int i=0; i<11; i++) {
//			System.out.println(i);
//		}
		
		//array
//		Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println(array[3]); // Mau akses data ke berapa di array
		// array list
		
		// ctrl + alt + downArrow buat copy paste line
		ArrayList<Character> characterList = new ArrayList<Character>();
		characterList.add(player);
		characterList.add(player2);
		int length = characterList.size();
		for(int i=0; i<length; i++) {
			System.out.println(characterList.get(0).getName());
		}
		
		int randNumber = rand.nextInt();
		System.out.println(randNumber);
		
	}
}
