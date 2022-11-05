package CCC13;

import java.util.Scanner;

public class CCC2004S1_Fix {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int times = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < times; i++) {
			boolean fixFree = true;
			String[] words = new String[3];
			words[0] = sc.nextLine();
			words[1] = sc.nextLine();
			words[2] = sc.nextLine();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (words[k].length() <= words[j].length() && j != k) {
						if (words[j].substring(0, words[k].length()).contentEquals(words[k]) ||
								words[j].substring(words[j].length() - words[k].length(), words[j].length()).contentEquals(words[k])) {
								fixFree = false;
						}
					}
				}
			}
			System.out.println(fixFree? "Yes" : "No");
		}

	}

}
