package maincodes;

import java.util.ArrayList;

public class ArrayListPrac1 {

	public static void main(String[] args) {
		String[] listOfStrings = new String[6];
		listOfStrings[0] = "Andy";
		listOfStrings[1] = "Alex";
		listOfStrings[2] = "Jasmin";
		listOfStrings[3] = "Jason";
		listOfStrings[4] = "Kevin";
		listOfStrings[5] = "Kenny";

//		ArrayList<String> listOfStrings = new ArrayList<String>();
//		listOfStrings.add("Andy");
//		listOfStrings.add("Alex");
//		listOfStrings.add("Jasmin");
//		listOfStrings.add("Jason");
//		listOfStrings.add("Kevin");
//		listOfStrings.add("Kenny");

		for (String person : listOfStrings) {
			System.out.println(person);
		}
	}

}
