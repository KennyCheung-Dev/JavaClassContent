package main;

public class main {

	public static void main(String[] args) {
		System.out.println(CheckNum(10));

	}
	
	public static int CheckNum(int num) {
		assert num > 20;
		return num;
	}

}
