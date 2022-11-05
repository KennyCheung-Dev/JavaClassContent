package CCC20_teaching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int num = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < num; i++) {
			String[] line =sc.nextLine().split(" ");
			int score = 2 * Integer.valueOf(line[1]) + 3 * Integer.valueOf(line[2]) 
				+ Integer.valueOf(line[3]);
			map.put(line[0], score);
		}
		String highestName = "";
		String secondHighestName = "";
		int highestScore = -1;
		int secondHighestScore = -2;
		if (map.size() == 1) {
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey());
				return;
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			//If the value is higher than highest
			if ((int)entry.getValue() > highestScore) {
				secondHighestScore = highestScore;
				secondHighestName = highestName;
				highestScore = entry.getValue();
				highestName = entry.getKey();
				continue;
			//If the value is equal to highest
			} else if ((int)entry.getValue() == highestScore) {
				if (entry.getKey().compareTo(highestName) < 0) {
					secondHighestScore = highestScore;
					secondHighestName = highestName;
					highestScore = entry.getValue();
					highestName = entry.getKey();
					continue;
				}
			}
			//If the value is higher than secondHigehst
			if ((int)entry.getValue() > secondHighestScore) {
				secondHighestScore = entry.getValue();
				secondHighestName = entry.getKey();
				continue;
			//If the value is equal to secondHigehst
			} else if ((int)entry.getValue() == secondHighestScore) {
				if (entry.getKey().compareTo(secondHighestName) < 0) {
					secondHighestScore = entry.getValue();
					secondHighestName = entry.getKey();
					continue;
				}
			}
		}
		System.out.println(highestName);
		System.out.println(secondHighestName);

	}

}
