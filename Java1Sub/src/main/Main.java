package main;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Homework Answer
		 */
		
//		System.out.println(round(-23f));
		
		
		
	}
	
	public static int round(float f) {
		float dec = f - (int)f;
		if (dec < 0) { //If it is a negative number
			if (dec < -0.5f) return (int)f - 1;
			else return (int)f;
		} else { //If it is a positive number
			if (dec < 0.5f) return (int)f;
			else return (int)f + 1;
		}
	}
	
	

	
}
