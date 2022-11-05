package usaco;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapsSets_2017_b_p1_DontBeLast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		HashMap<String, Integer> cows = new HashMap<String, Integer>();
		cows.put("Bessie", 0);
		cows.put("Elsie", 0);
		cows.put("Daisy", 0);
		cows.put("Gertie", 0);
		cows.put("Annabelle", 0);
		cows.put("Maggie", 0);
		cows.put("Henrietta", 0);
		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
			if (cows.containsKey(line[0])) {
				cows.put(line[0], Integer.valueOf(cows.get(line[0])) + Integer.parseInt(line[1]));
			} 
		}
		
		TreeMap<Integer, List<String>> milkOrdered = new TreeMap<Integer, List<String>>();
		for (Map.Entry<String, Integer> entry : cows.entrySet()) {
			if (milkOrdered.containsKey(entry.getValue())) {
				List<String> cowListWithSameAmount = milkOrdered.get(entry.getValue());
				cowListWithSameAmount.add(entry.getKey());
				milkOrdered.put(entry.getValue(), cowListWithSameAmount);
			} else {
				List<String> newCowList = new ArrayList<String>();
				newCowList.add(entry.getKey());
				milkOrdered.put(entry.getValue(), newCowList);
			}
		}
		System.out.println(milkOrdered.toString());
		Set<Map.Entry<Integer, List<String>>> resultEntrySet = milkOrdered.entrySet();
		Object[] resultArray = resultEntrySet.toArray();
		if (milkOrdered.size() < 2 ||
				((Map.Entry<Integer, List<String>>)resultArray[1]).getValue().size() > 1) {
			System.out.println("Tie");
		} else {
			System.out.println(((Map.Entry<Integer, List<String>>)resultArray[1]).getValue().get(0));
		}
		
		
/*
10
Bessie 1
Maggie 13
Elsie 3
Elsie 4
Henrietta 4
Gertie 12
Daisy 7
Annabelle 10
Bessie 6
Henrietta 5
 */
	}

}
