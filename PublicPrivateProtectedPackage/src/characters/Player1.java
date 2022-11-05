package characters;

public class Player1 {
	
	private int hp = 100;
	
	public void ReportHp() {
		System.out.println("My hp is at : " + hp);
	}
	
	public void TakeDamage(int dmg) {
		hp -= dmg;
		System.out.println("Uhhuahu, I have " + hp + " hp left!");
	}
}
