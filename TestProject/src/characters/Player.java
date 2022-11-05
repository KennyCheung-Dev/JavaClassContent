package characters;

public class Player {
	public int hp = 100;
	
	public Player(String name, int age) {
		hp = 50;
	}
	
	public void reportHP() {
		System.out.println("I have " + this.hp + " hp!");
	}

}
