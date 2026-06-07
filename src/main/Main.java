package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

//	void gameMenu() {
//		while(true) {
//			System.out.println("1. Fight\n2. Exit");
//			int input = scan.nextInt();
//			if(input == 1) {
//				fight();
//			} else {
//				return;
//			}
//		}
//	}
	
//	private void fight() {
//		System.out.println("Choose your Character\n1. Paladin\n2. Berserker\n3. Archer");
//		int characterChoose = scan.nextInt();
//		if(characterChoose == 1) {
//			Character player = new Paladin("null");
//		} if(characterChoose == 2) {
//			Character player = new Berserker("Null");
//		} if(characterChoose == 3) {
//			Character player = new Archer("Null");
//		} else {
//			System.out.println("Choice not Valid");
//			return;
//		}
		
//	}
	
	private void printEnemy(ArrayList<Enemy> multEnemy) {
		System.out.println("Enemy Stats: ");
		for(int i = 0; i < multEnemy.size(); i++) {
			System.out.println("Name: " + multEnemy.get(i).getName());
			System.out.println("Atk: " + multEnemy.get(i).getAttack());
			System.out.println("Hp: " + multEnemy.get(i).getHp());
		}
	}
	

	
	public void printTeam(ArrayList<Character> charlist) {
		System.out.println("Team Stats: ");
		for(int i=0; i<=2; i++) {
			System.out.println("Name: " + charlist.get(i).getName());
			System.out.println("Atk: " + charlist.get(i).getAttack());
			System.out.println("HP: " + charlist.get(i).getHp());
			System.out.println("");
		}
	}

	private void battle(ArrayList<Enemy> multEnemy, ArrayList<Character> charlist) {
		boolean teamAlive = true;
		boolean enemyAlive = true;
		while(enemyAlive == true && teamAlive == true) {
			printTeam(charlist);
			printEnemy(multEnemy);
			for(int i=0; i<3; i++) {
				System.out.println("1. Attack");
				System.out.println("2. Healing");
				System.out.println("3. Run Away");
				System.out.println("What you do??");
				int input3 = scan.nextInt(); scan.nextLine();
				if(input3 == 1) {
					System.out.println("Who do you want to Attack?");
					int findTarget = scan.nextInt(); scan.nextLine();
					charlist.get(i).dealDamage(multEnemy.get(findTarget));
				} else if(input3 == 2) {
					System.out.println("Who do you want to heal?");
					int findTarget = scan.nextInt(); scan.nextLine();
					charlist.get(i).targetHeal(charlist.get(findTarget));
				} else if(input3 == 3) {
					int randomInt = rand.nextInt(10);
					if(randomInt <= 7) {
						System.out.println("You have ran away from the enemy!");
						break;
					}
				}
			}
			for(int i=0; i<multEnemy.size(); i++) {
			multEnemy.get(i).dealDamage(charlist);
			}
			enemyAlive = false; 
			for(int i=0; i<multEnemy.size(); i++) {
				if(multEnemy.get(i).getHp() > 0) {
					enemyAlive = true;
				}
			}
			
			
			teamAlive = false;
			for(int i=0; i<3; i++) {
				if(charlist.get(i).getHp() > 0) {
					teamAlive = true;
				}
			}
		}
	}
	
	private Enemy generateEnemy() {
			int randomInRange = rand.nextInt(2) + 1;
			if(randomInRange == 1) {
				Enemy nemesis = new Bat("Joko");
				return nemesis;
			} else {
				Enemy nemesis = new Frog("Andy");
				return nemesis;
			}
		}
	
	public ArrayList<Enemy> multipleEnemy() {
		ArrayList<Enemy> multEnemy = new ArrayList<Enemy>();
		int randomEnemy = rand.nextInt(4) + 1;
		for(int i = 0; i < randomEnemy; i++) {
			Enemy tempNemesis = generateEnemy();
			multEnemy.add(tempNemesis);
		}
		return multEnemy;
	}
		

	private Character chooseCharacter() {
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Choose your Character\n1. Paladin\n2. Berserker\n3. Archer");
		int characterChoose = scan.nextInt();
		scan.nextLine();
		Character player;
		if(characterChoose == 1) {
			player = new Paladin(name);
		} else if(characterChoose == 2) {
			player = new Berserker(name);
		} else {
			player = new Archer(name);	
		}
		System.out.println(player.getName());
		return player;
	}
	
	public void gameMenu(ArrayList<Character> charlist) {
		while(true) {
			System.out.println("1. Battle\n2. Exit to Menu");
			int input2 = scan.nextInt();
			scan.nextLine();
			if(input2 == 1) {
				ArrayList<Enemy> multEnemy = multipleEnemy();
				battle(multEnemy, charlist);
			} else {
				break;
			}
		}
	}
	
	public Main() {
		while(true) {
			System.out.println("1. Start Game\n2. Exit");
			int input = scan.nextInt();
			scan.nextLine();
			if(input == 1) {
				ArrayList<Character> charlist = teamCreation();
				gameMenu(charlist);
			} else {
				System.out.println("Bye bye");
				break;
			}
		}
	}
	
	public ArrayList<Character> teamCreation() {
		System.out.println("Let's create your team");
		ArrayList<Character> charlist = new ArrayList<Character>();
		for(int i=1; i<=3; i++) {
			Character tempChar = chooseCharacter();
			charlist.add(tempChar);
		}
		return charlist;
	}
	
	
	

	public static void main(String[] args) {
		new Main();
	}

}
