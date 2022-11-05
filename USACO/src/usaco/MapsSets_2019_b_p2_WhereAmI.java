package usaco;

import java.util.HashSet;
import java.util.Scanner;

public class MapsSets_2019_b_p2_WhereAmI {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String mailBoxes = sc.nextLine();
		for (int i = 1; i < n + 1; i++) { //Loop through length of pattern from 1 - 5
			HashSet<String> set = new HashSet<String>();
			for (int j = 0; j < n - i + 1; j++) { //Loop through the starting index
				set.add(mailBoxes.substring(j, j + i)); //Obtain substring 
			}
			if (set.size() == n - i + 1) { //Check if number of substring matches max number possible
				System.out.println(i);
			}
		}
	}

}
