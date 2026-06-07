package main;

import java.util.ArrayList;

public class Bat extends Enemy {

	
	public Bat(String name) {
		super(name, name, 15, 60, 44);
	}


	@Override
	public void dealDamage(ArrayList<Character> charlist, int idx) {
		super.dealDamage(charlist, idx);
	}
	
	
}
	