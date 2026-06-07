package main;
import java.util.Random;

public abstract class Character {
	
	Random rand = new Random();
	
	private String name;
	private String role;
	private Integer attack;
	private Integer hp;
	private Integer agility;
	private Integer healingPotion;
	
	public Character(String name, String role, Integer attack, Integer hp, Integer agility, Integer healingPotion) {
		super();
		this.name = name;
		this.role = role;
		this.attack = attack;
		this.hp = hp;
		this.agility = agility;
		this.healingPotion = healingPotion;
	}
	
	public void dealDamage(Enemy nemesis) {
		int nemesisHp = nemesis.getHp() - attack;
		nemesis.setHp(nemesisHp);
		System.out.printf("Deal %d damage", attack);
		return;
	}
	
	public void targetHeal(Character target) {
		if(healingPotion > 0) {
			healingPotion--;
			target.increaseHp(30);
			System.out.println("Healed for 30 points");
		} else {
			System.out.println("Your healing potion have ran out");
		}
		return;
	}
	
	public void increaseHp(int point) {
		hp += point;
	}
	
	public void decreaseHp(int point) {
		hp -= point;
	}
	
//	public void heal(ArrayList<Character> charlist, int idx) {
//		if(healingPotion > 0) {
//			charlist.get(idx).hp += 20;
//			healingPotion--;
//			System.out.println("Healed 20 hp");
//		} else {
//			System.out.println("Your healing potion have ran out");
//		}
//		return;
//	}
	
	
	public boolean isDodge() {
		int dodgeChance = rand.nextInt(101);
		if(dodgeChance <= agility) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	public abstract Integer dealDamage();
	
	
	
	
	
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
	public Integer getHealingPotion() {
		return healingPotion;
	}
	public void setHealingPotion(Integer healingPotion) {
		this.healingPotion = healingPotion;
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
	public void setHp(Integer hp) {
		this.hp = hp;
	}

}
