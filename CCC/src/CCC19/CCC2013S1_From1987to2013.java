package CCC19;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CCC2013S1_From1987to2013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		while (true) {
			year++;
			String yearString = String.valueOf(year);
			
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for (char c : yearString.toCharArray()) {
				if (!hm.containsKey(c))
					hm.put(c, 1);
				else 
					hm.replace(c, hm.get(c) + 1);
			}
			boolean match = true;
			for (HashMap.Entry<Character, Integer> entry : hm.entrySet())
				if (entry.getValue() > 1) match = false;
			if (match) {
				System.out.println(yearString);
				break;
			}
		}
				

	}

}
