package main;

public class Main1 {

	public static void main(String[] args) {
		float height = 3f;
		float money = 4.00f;
		if (height < 5) {
			System.out.println("Shortas, get " + (5 - height) + " taller");
		} else if (money < 10) {
			System.out.println("sorry you're too poor, get " + (10 - money) + " more money");
		
		} else {
			System.out.print("you can ride");
		}
	}

}