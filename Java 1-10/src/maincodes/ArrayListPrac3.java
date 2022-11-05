package maincodes;

import java.util.ArrayList;

public class ArrayListPrac3 {

	public static void main(String[] args) {
		//Splitting into Team?!
		
		ArrayList<String> teamA = new ArrayList<String>();
		teamA.add("Andy");
		teamA.add("Alex");
		teamA.add("Jasmin");
		teamA.add("Jason");
		teamA.add("Kevin");
		teamA.add("Kenny");

		//Build Another ArrayList and random add 3 names into it, 
		//remove the added one from the original list
		ArrayList<String> teamB = new ArrayList<String>();
		
		for (int i = 0; i < 3; i ++) {
			int randomIndex = (int)(Math.random() * teamA.size());
			teamB.add(teamA.get(randomIndex));
			teamA.remove(randomIndex);
			System.out.println("Moving index : " + randomIndex);
		}
		
		System.out.println(teamA);
		System.out.println(teamB);
	}
	

}
