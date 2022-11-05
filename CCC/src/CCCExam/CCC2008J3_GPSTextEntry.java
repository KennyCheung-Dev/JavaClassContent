package CCCExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC2008J3_GPSTextEntry {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int total = 0;
		String[][] keys = new String[][] {
			{"A", "B", "C", "D", "E", "F"},
			{"G", "H", "I", "J", "K", "L"},
			{"M", "N", "O", "P", "Q", "R"},
			{"S", "T", "U", "V", "W", "X"},
			{"Y", "Z", " ", "-", ".", "enter"}
		};
		List<int[]> steps = new ArrayList<int[]>();
		steps.add(new int[] {0, 0});
		
		String s = sc.nextLine();
		for (char letter : s.toCharArray()) {
			for (int i = 0; i < keys.length; i++) {
				for (int j = 0; j < keys[i].length; j++) {
					if (String.valueOf(letter).contentEquals(keys[i][j])) {
						steps.add(new int[] {i, j});
					}
				}
			}
		}
		steps.add(new int[] {4, 5});
		
		for (int i = 1; i < steps.size(); i++) {
			total += Math.abs(steps.get(i)[0] - steps.get(i - 1)[0]);
			total += Math.abs(steps.get(i)[1] - steps.get(i - 1)[1]);
		}
		
		System.out.println(total);
	}

}
