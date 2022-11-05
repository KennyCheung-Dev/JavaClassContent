package CCC14;

import java.util.Scanner;

public class CCC2003S1_SnakesAndLadders {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int currentBlock = 1;
		while (true) {
			//Get number
			int steps = sc.nextInt();
			
			//Quit
			if (steps == 0) {
				System.out.println("You Quit");
				break;
			} 
			
			//Quick save
			int tempBlock = currentBlock;
			
			//Advance steps
			currentBlock += steps;
			if (currentBlock == 99) currentBlock = 77;
			if (currentBlock == 90) currentBlock = 48;
			if (currentBlock == 67) currentBlock = 86;
			if (currentBlock == 40) currentBlock = 64;
			if (currentBlock == 54) currentBlock = 19;
			if (currentBlock == 9) currentBlock = 34;
			
			//If new location is not valid, do not move
			if (currentBlock > 100) {
				currentBlock = tempBlock;
				System.out.println("You are now on square " + currentBlock);
				continue;
			}
			
			System.out.println("You are now on square " + currentBlock);
			
			if (currentBlock == 100) {
				System.out.println("You Win!");
				break;
			}
		}

	}
	
}
