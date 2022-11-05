package CCC20;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2011J4_BoringBusiness {

	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<int[]> passedCoords = new ArrayList<int[]>();
	
	public static int[] currentCoord = new int[] {-1, -5};
	
	public static void main(String[] args) {
		passedCoords.add(new int[] {0, -1});
		passedCoords.add(new int[] {0, -2});
		passedCoords.add(new int[] {0, -3});
		passedCoords.add(new int[] {1, -3});
		passedCoords.add(new int[] {2, -3});
		passedCoords.add(new int[] {3, -3});
		passedCoords.add(new int[] {3, -4});
		passedCoords.add(new int[] {3, -5});
		passedCoords.add(new int[] {4, -5});
		passedCoords.add(new int[] {5, -5});
		passedCoords.add(new int[] {5, -4});
		passedCoords.add(new int[] {5, -3});
		passedCoords.add(new int[] {6, -3});
		passedCoords.add(new int[] {7, -3});
		passedCoords.add(new int[] {7, -4});
		passedCoords.add(new int[] {7, -5});
		passedCoords.add(new int[] {7, -6});
		passedCoords.add(new int[] {7, -7});
		passedCoords.add(new int[] {6, -7});
		passedCoords.add(new int[] {5, -7});
		passedCoords.add(new int[] {4, -7});
		passedCoords.add(new int[] {3, -7});
		passedCoords.add(new int[] {2, -7});
		passedCoords.add(new int[] {1, -7});
		passedCoords.add(new int[] {0, -7});
		passedCoords.add(new int[] {-1, -7});
		passedCoords.add(new int[] {-1, -6});
		passedCoords.add(new int[] {-1, -5});
		
		
		boolean safe = true;
		while (true) {
			String[] line = sc.nextLine().split(" ");
			if (line[0].contentEquals("q")) break;
			int steps = Integer.valueOf(line[1]);
			for (int i = 0; i < steps; i++) {
				switch (line[0]) {
					case "u":
						 currentCoord[1]++;
						break;
					case "d":
						currentCoord[1]--;
						break;
					case "l":
						currentCoord[0]--;
						break;
					case "r":
						currentCoord[0]++;
						break;
				}
				if (PreviouslyPassed(currentCoord)) safe = false;
				passedCoords.add(currentCoord.clone());
				
			}
			System.out.println(currentCoord[0] + " " + currentCoord[1] + " " + (safe ? "safe" : "DANGER"));
			if (!safe) break;
		}
	}
	
	public static boolean PreviouslyPassed(int[] coord) {
		for (int[] passed : passedCoords) {
			boolean match = true;
			for (int i = 0; i < 2; i++)
				if (coord[i] != passed[i]) match = false;
			if (match) return true;
		}
		return false;
	}

}
