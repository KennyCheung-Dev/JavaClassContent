package CCC8;

public class Main {

	public static void main(String[] args) {
		//Warmup Questions:
		//Print the following
		
		//*
		//**
		//***
		//****
		//*****
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		String s = "";
//		for (int i = 0; i < 5; i++) {
//			s += "*";
//			System.out.println(s);	
//		}

		//Print the multiplication table
		// 1 * 1 = 1 | 1 * 2 = 2 | 1 * 3 = 3 .... 1 * 9 = 9
		// 2 * 1 = 2 | ..........
		// ............
		// ....................  | 9 * 9 = 81
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(String.format("%d * %d = %d", i, j, i*j));
				if (j != 9) System.out.print(" | ");
			}
			System.out.println();
		}

		//There were 35 heads
		//There was at least one chicken and at most 34
		//There were 94 feet
		//There was at least one rabbit and at most 23 rabbit
		//Find out how many chickens and rabbits there are
		//Use loops
		//Print the answer like : 23 chickens and 12 rabbits
		
//		for (int i = 1; i < 35; i++) {
//			if (i * 2 + (35 - i) * 4 == 94) {
//				System.out.println("Chickens : " + i + " Rabbits: " + (35 - i));
//			}
//		}
		
//		for (int i = 1; i < 35; i++) {
//			for (int j = 1; j < 24; j++) {
//				if (i + j == 35 && i * 2 + j * 4 == 94) {
//					System.out.println("Chickens : " + i + " Rabbits: " + (35 - i));
//				}
//			}
//		}
		
	}
}