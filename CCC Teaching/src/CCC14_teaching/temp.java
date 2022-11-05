package CCC14_teaching;

import java.util.Scanner;

public class temp {
	
	static Scanner sc = new Scanner(System.in);
	
	static String[] keys = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) {
		int totalTime = 0;
		int previousKey = -1;
		
		while (true) {
			String s = sc.nextLine();
			if (s.contentEquals("halt")) break;
			previousKey = -1;
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < keys.length; j++) {
					for (int k = 0; k < keys[j].length(); k++) {
						if (s.substring(i, i+1).contentEquals(keys[j].substring(k, k+1))) {
							totalTime += k + 1;
							if (previousKey == j) totalTime += 2;
							previousKey = j;
						}
					}
				}
			}
			System.out.println(totalTime);
			totalTime = 0;
		}
	}

}
