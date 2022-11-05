package CCC16;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2006S1_Maternity {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Compute possible Alelles
		String parentA = sc.nextLine();
		String parentB = sc.nextLine();
		ArrayList<Character> possibleAlelles = new ArrayList<Character>();
		for (int i = 0; i < 10; i+=2) {
			for (int j = i; j < i+2; j++) {
				for (int k = i; k < i+2; k++) {
					if (Character.isUpperCase(parentA.charAt(j)) || Character.isUpperCase(parentB.charAt(k))) {
						possibleAlelles.add(Character.toUpperCase(parentA.charAt(j)));
					} else {
						possibleAlelles.add(Character.toLowerCase(parentA.charAt(j)));
					}
				}
			}
		}
		
		//Check each child
		int childNum = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < childNum; i++) {
			String child = sc.nextLine();
			boolean possibleChild = true; 
			for (Character c : child.toCharArray()) {
				if (!possibleAlelles.contains(c)) {
					possibleChild = false;
				}
			}
			System.out.println(possibleChild ? "Possible baby." : "Not their baby!");
		}
	}

}
