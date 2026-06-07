package main;

import java.util.ArrayList;

public class Frog extends Enemy {

	
	public Frog(String name) {
		super(name, name, 20, 40, 55);
	}

	@Override
	public void dealDamage(ArrayList<Character> charlist, int idx) {
		super.dealDamage(charlist, idx);
	}

	
	
	
	
}