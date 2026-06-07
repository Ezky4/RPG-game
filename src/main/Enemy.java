package main;

import java.util.ArrayList;
import java.util.Random;

public abstract class Enemy {
	Random rand = new Random();
	
	private String name;
	private String role;
	private Integer attack;
	private Integer hp;
	private Integer agility;

	public Enemy(String name, String role, Integer attack, Integer hp, Integer agility) {
		super();
		this.name = name;
		this.role = role;
		this.attack = attack;
		this.hp = hp;
		this.agility = agility;
	}
	public void dealDamage(ArrayList<Character> charlist) {
		int idx = rand.nextInt(3);
		if(charlist.get(idx).isDodge() == true) {
			System.out.println("Attack failed");
		} else {
			int charlistHp = charlist.get(idx).getHp() - attack;
			charlist.get(idx).setHp(charlistHp);
			System.out.printf("Deal %d damage", attack);
			return;
		}
	}



	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getAgility() {
		return agility;
	}
	public void setAgility(Integer agility) {
		this.agility = agility;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer health) {
		this.hp = health;
	}

}
