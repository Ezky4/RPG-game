package main;

public class Archer extends Character {


	public Archer(String name) { 
		super(name, name, 20, 120, 60, 7);
	}


	@Override
	public Integer dealDamage() {
		System.out.println("Shooting");
		return super.getAttack();
	}
	
}
