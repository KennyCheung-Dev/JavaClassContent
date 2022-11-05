package maincodes;

public class Homework {
	public static void main(String[] args) {
	}
	
	/* Homework:
	 * Overloading Method with JavaDoc Setup
	 */
	
	/**
	 * Attack the closest target 1 hit of 10 damage
	 */
	public static void Attack() {
	}
	
	/**
	 * Attack the {@code enemy} 1 hit of 10 damage
	 * @param enemy A specific enemy specified with id in string
	 */
	public static void Attack(String enemy) {
	}
	
	/**
	 * Attack the {@code enemy} 1 hit of {@code dmg} damage
	 * @param enemy A specific enemy specified with id in string
	 * @param dmg Damage dealt on enemy
	 */
	public static void Attack(String enemy, float dmg) {
	}
	
	/**
	 * Attack the {@code enemy} {@code times} hit of {@code dmg} damage
	 * @param enemy A specific enemy specified with id in string
	 * @param dmg Damage dealt on enemy
	 * @param times multiple attack chained
	 */
	public static void Attack(String enemy, float dmg, int times) {
	}
}
