package CCC4;

import java.util.Scanner;

public class CCC2000J3_SlotMachine {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		/*
		 * Martha takes a jar of quarters to the casino with the intention of becoming rich. 
		 * She plays three machines in turn. Unknown to her, the machines are entirely predictable. 
		 * Each play costs one quarter. The first machine pays 30 quarters every 35th time it is played; 
		 * the second machine pays 60 quarters every 100th time it is played; 
		 * the third pays 9 quarters every 10th time it is played.

			Your program should take as input the number of quarters in Martha's jar 
			(there will be at least one and fewer than 1000), and the number of times 
			each machine has been played since it last paid.
			
			Your program should output the number of times Martha plays until she goes broke.
			
			Input:
			How many quarters does Martha have in the jar?
			48
			
			How many times has the first machine been played since paying out?
			3
			
			How many times has the second machine been played since paying out?
			10
			
			How many times has the third machine been played since paying out?
			4
			
			Output:
			Martha plays 66 times before going broke.
		 */
		
		
		
		System.out.println("How many coin do you have?");
		int coins = sc.nextInt();
		System.out.println("How many times has the first machine been played?");
		int m1 = sc.nextInt();
		System.out.println("How many times has the second machine been played?");
		int m2 = sc.nextInt();
		System.out.println("How many times has the third machine been played?");
		int m3 = sc.nextInt();
		System.out.println("You will be able to play " + TimesPlayed(coins, m1, m2, m3) + " times before going broke.");
		

	}
	
	public static int TimesPlayed(int coins, int m1, int m2, int m3) {
		int times = 0;
	    while (true) {
	        // First Machine
	        coins--;
	        m1++;
	        times++;
	        if (m1 == 35) {
	            coins += 30;
	            m1 = 0;
	        }

	        // Ending Condition
	        if (coins <= 0) {
	            return times;
	        }

	        // Second Machine
	        coins--;
	        m2++;
	        times++;
	        if (m2 == 100) {
	            coins += 60;
	            m1 = 0;
	        }
	        
    		// Ending Condition
	        if (coins <= 0) {
	            return times;
	        }

	        // Third Machine
	        coins--;
	        m3++;
	        times++;
	        if (m3 == 10) {
	            coins += 9;
	            m3 = 0;
	        }
	         // Ending Condition
	        if (coins <= 0) {
	            return times;
	        }
	    }
	}
}
