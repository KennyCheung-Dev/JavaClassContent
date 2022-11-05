package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkInt(0));
	}

	public static int checkInt(int i) {
		assert i > 0;
		return i;
	}
}
