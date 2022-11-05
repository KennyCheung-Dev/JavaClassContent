package CCC11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC2019J3_ColdCompress {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int times = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < times; i++) {
			String s = sc.nextLine();
			LinkedHashMap<String, Integer> dict = new LinkedHashMap<String, Integer>();
			for (int j = 0; j < s.length(); j++) {
				if (dict.containsKey(s.substring(j, j+1))) {
					dict.replace(s.substring(j, j+1), dict.get(s.substring(j, j+1)) + 1);
				} else {
					dict.put(s.substring(j, j+1), 1);
				}
			}
			
			for (int j = 0; j < dict.size(); j++) {
				System.out.print(dict.values().toArray()[j] + " " + dict.keySet().toArray()[j]);
				if (j != dict.size() - 1) System.out.print(" ");
			}
			System.out.println();
		}
	}

}
