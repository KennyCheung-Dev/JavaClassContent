package CCC18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC2003S2_Poetry {

	public static void main(String[] args) {
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		Scanner sc = new Scanner(System.in);
		int numPoem = Integer.valueOf(sc.nextLine());
		String[][] poemsRhymes = new String[numPoem][4]; 
		for (int i = 0; i < numPoem; i++) {
			for (int j = 0; j < 4; j++) {
				//Receiving line
				String[] line = sc.nextLine().split(" ");
				String lastWord = line[line.length - 1];
				//Checking last word
				StringBuilder sb = new StringBuilder();
				boolean hasVowels = false;
				for (char c : lastWord.toCharArray()) {
					if (vowels.contains(c)) {
						sb = new StringBuilder();
						sb.append(c);
						hasVowels = true;
					} else {
						if (hasVowels) sb.append(c);
					}
				}
				//If there is no vowel within the word
				if (!hasVowels)
					sb.append(lastWord);
				//Apply rhymes to array
				poemsRhymes[i][j] = sb.toString();
			}	

			if (poemsRhymes[i][0].contentEquals(poemsRhymes[i][1]) &&
					poemsRhymes[i][0].contentEquals(poemsRhymes[i][2]) &&
					poemsRhymes[i][0].contains(poemsRhymes[i][3]))
				System.out.println("perfect");
			else if (poemsRhymes[i][0].contentEquals(poemsRhymes[i][1]) &&
					poemsRhymes[i][2].contentEquals(poemsRhymes[i][3]))
				System.out.println("even");
			else if (poemsRhymes[i][0].contentEquals(poemsRhymes[i][2]) &&
					poemsRhymes[i][1].contentEquals(poemsRhymes[i][3]))
				System.out.println("cross");
			else if (poemsRhymes[i][0].contentEquals(poemsRhymes[i][3]) &&
					poemsRhymes[i][1].contentEquals(poemsRhymes[i][2]))
				System.out.println("shell");
			else 
				System.out.println("free");
			
		}
	}
}
