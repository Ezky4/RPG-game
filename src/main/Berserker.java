package main;

public class Berserker extends Character {

	
	public Berserker(String name) {
		super(name, name, 45, 70, 10, 5);
	}


	@Override
	public Integer dealDamage() {
		System.out.println("Smashing");
		return super.getAttack();
	}
	

}
