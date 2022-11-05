package CCC14;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2001S1_KeepingScore {
	
	static Scanner sc = new Scanner(System.in);
	static final int lineLen = 31;
	
	public static void main(String[] args) {
		int totalPoint = 0;
		StringBuilder sb = new StringBuilder();
		int cardCount = 0;
		String currentSuit = "C";
		ArrayList<String> currentHand = new ArrayList<String>();
		int currentPoint = 0;
		
		String s = sc.nextLine();
		
		//First Line
		System.out.println("Cards Dealt              Points");
		
		//Set Starting Suit
		if (s.substring(0, 1).contentEquals("C")) currentSuit = "Clubs";
		if (s.substring(0, 1).contentEquals("D")) currentSuit = "Diamonds";
		if (s.substring(0, 1).contentEquals("H")) currentSuit = "Hearts"; 
		if (s.substring(0, 1).contentEquals("S")) currentSuit = "Spades";
		
		//Loop through the line
		for (int i = 1; i < s.length(); i++) {
			//Obtain current character
			String currentChar = s.substring(i, i+1);
			//Accumulate hands
			if (!currentChar.contentEquals("C") &&
					!currentChar.contentEquals("D") &&
					!currentChar.contentEquals("H") &&
					!currentChar.contentEquals("S")) {
				currentHand.add(currentChar);
				cardCount++;
				if (currentChar.contentEquals("A")) currentPoint += 4;
				if (currentChar.contentEquals("K")) currentPoint += 3;
				if (currentChar.contentEquals("Q")) currentPoint += 2;
				if (currentChar.contentEquals("J")) currentPoint += 1;
			}
			
			//Handling ending of a sequence
			if (currentChar.contentEquals("C") ||
					currentChar.contentEquals("D") ||
					currentChar.contentEquals("H") ||
					currentChar.contentEquals("S") || 
					i == s.length() - 1) {
				
				//Calculating suit combo points
				if (currentHand.size() == 0) currentPoint += 3;
				if (currentHand.size() == 1) currentPoint += 2;
				if (currentHand.size() == 2) currentPoint += 1;
				
				//Print the resulting line
				sb.append(currentSuit);
				sb.append(" ");
				for (int j = 0; j < currentHand.size(); j++) {
					sb.append(currentHand.get(j));
					sb.append(" ");
				}
				int pointDigit = String.valueOf(currentPoint).length();
				int spaceNeeded = lineLen - sb.length() - pointDigit;
				for (int j = 0; j < spaceNeeded; j++) {
					sb.append(" ");
				}
				sb.append(currentPoint);
				totalPoint += currentPoint;
				System.out.println(sb.toString());
				
				//Resetting data
				if (currentChar.contentEquals("C")) currentSuit = "Clubs";
				if (currentChar.contentEquals("D")) currentSuit = "Diamonds";
				if (currentChar.contentEquals("H")) currentSuit = "Hearts"; 
				if (currentChar.contentEquals("S")) currentSuit = "Spades";
				sb = new StringBuilder();
				cardCount = 0;
				currentHand.clear();
				currentPoint = 0;
			}
		}
		sb = new StringBuilder();
		sb.append("Total ");
		sb.append(totalPoint);
		int spaceNeeded = lineLen - sb.length();
		for (int i = 0; i < spaceNeeded; i++) {
			sb.insert(0, " ");
		}
		System.out.println(sb.toString());
	}

}
