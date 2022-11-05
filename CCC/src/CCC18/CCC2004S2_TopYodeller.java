package CCC18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CCC2004S2_TopYodeller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		int[] scores = new int[Integer.valueOf(firstLine.split(" ")[0])];
		int[] lowestRank = new int[scores.length];
		int rounds = Integer.valueOf(firstLine.split(" ")[1]);
		for (int i = 0; i < rounds; i++) {
			String[] round = sc.nextLine().split(" ");
			for (int j = 0; j < scores.length; j++) {
				scores[j] += Integer.valueOf(round[j]);
			}
//			}
			
			//First attempt
			int yodellerRanked = 1;
			int currentRank = 1;
			int[] dupScoreForRanking = scores.clone();
			while (yodellerRanked <= scores.length) {
				int highestScore = Arrays.stream(dupScoreForRanking).max().getAsInt();
				for (int index = 0; index < dupScoreForRanking.length; index++) {
					if (dupScoreForRanking[index] == highestScore) {
						if (currentRank > lowestRank[index]) lowestRank[index] = currentRank;
						dupScoreForRanking[index] = -2147483648; //Nullify score
						yodellerRanked++;
					}
				}
				currentRank++;
				if (currentRank < yodellerRanked) {
					currentRank = yodellerRanked;
				}
			}
			
		}
		//Find out best yodeller:
		ArrayList<Integer> winnerIndex = new ArrayList<Integer>();
		int currentHigh = scores[0]; 
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == currentHigh) {
				winnerIndex.add(i);
			}
			else if (scores[i] > currentHigh) {
				winnerIndex.clear();
				winnerIndex.add(i);
				currentHigh = scores[i];
			}
		}
		Collections.sort(winnerIndex);
		for (int i : winnerIndex)
			System.out.println(String.format("Yodeller %d is the TopYodeller: score %d, worst rank %d", i + 1, scores[i], lowestRank[i]));
		
	}

}
