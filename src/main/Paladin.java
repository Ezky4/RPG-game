package main;

public class Paladin extends Character {


	public Paladin(String name) {
		super(name, name, 30, 100, 30, 10);
	}

	@Override
	public Integer dealDamage() {
		System.out.println("Slashing");
		return super.getAttack();
	}
	

}
