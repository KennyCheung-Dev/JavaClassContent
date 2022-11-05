package java1;

public class Prison {
	static int people = 10500;
	int dedPeople = 10500;
	public int returnDedPeople() {
		return 10;
	}
	
	public static int inmates(){
		return 10000;
	}
	public static int guards() {
		return 500;
	}
	public static int people() {
		return people;
	}
	public static void nuke() {
		people = 1;
		System.out.println("Kenny Survived");
	}

}
