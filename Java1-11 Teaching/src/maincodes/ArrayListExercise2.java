package maincodes;

import java.util.ArrayList;

public class ArrayListExercise2 {

	public static void main(String[] args) {
		ArrayList<String> teamA = new ArrayList<String>();
		teamA.add("Andy");
		teamA.add("Alex");
		teamA.add("Jasmin");
		teamA.add("Jason");
		teamA.add("Kevin");
		teamA.add("Kenny");
		
		//Build a second ArrayList, randomly add 3 of the person to it
		//Remove the ones in the original first list
		
		//Random
		//Math.random();   returns double within the range of 0.0 to 0.999999
		
		//Round up
		// (int) (num to round up)
		
		//Pick a random number from 0 - 5 
		//Use that number as index to pick out names from team A
		// Add that name to teamB
		// Remove that name from teamA
		
		ArrayList<String> teamB = new ArrayList<String>();
		
		for (int i = 0; i < 3; i++) {
			int randomIndex = (int)(Math.random() * teamA.size());
			teamB.add(teamA.get(randomIndex));
			teamA.remove(randomIndex);
		}
		
		System.out.println(teamA);
		System.out.println(teamB);

	}
}
