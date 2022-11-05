package CCC11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DictionaryCountUsage {

	public static void main(String[] args) {
		// Determine the number of times that a certain element appears in an array or List
		//find the index that the element first appear
		
		int[] nums = new int[] {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4};
		List<Integer> nums2 = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4);
		
		//Position
		System.out.println(nums2.indexOf(3)); //List
		System.out.println(Arrays.binarySearch(nums, 3)); //Arrays
		
		
		//Times appeared
		//List
		System.out.println(Collections.frequency(nums2, 3));
		//Arrays
		int count = 0;
		for (int i : nums) if (i == 3) count++;
		System.out.println(count);
		
		
		
		
		//Q.
		//Given an int[] and a integer target. Find the first pair of elements a and b
		//that satisfy a + b = target and return their index
		//Assume numbers within the int[] will not contain duplicates
		//Output "Found the numbers at position n and position m."   (0-based index is fine)
		int[] nums3 = new int[] {2, 7, 11, 15};
		int target = 26;
		
		
		//A.
		//For-loop
		boolean con = true;
		for (int i = 0; i < nums3.length; i++) {
			for (int j = 0; j < nums3.length; j++) {
				if (i != j) {
					if (nums3[i] + nums3[j] == target) {
						System.out.println("Found the numbers at position " + i + " and position " + j + ".");
						con = false;
						break;
					}
				}
			}
			if (!con) break;
		}
		
		
		//Dictionary
		HashMap<Integer, Integer> dict = new HashMap();
		for (int i = 0; i < nums3.length; i++) {
			if (dict.containsKey(target - nums3[i])) {
				System.out.println("Found the numbers at position " + dict.get(target - nums3[i]) + " and position " + i + ".");
				break;
			} else {
				dict.put(nums3[i], i);
			}
		}
		
		//Loop through the dictionary
//		for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + "   value : " + entry.getValue());
//		}
		
		
		
		
		//Q.
		//Counts the number of occurrences of the second most frequent element in an int[]
		//Try to use dictionary
		int[] nums4 = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4};
		
		//A.
		Map<Integer, Integer> dict2 = new HashMap(); 
		for (int i = 0; i < nums4.length; i++) {
			if (dict2.containsKey(nums4[i])) {
				dict2.replace(nums4[i], dict2.get(nums4[i]) + 1);
			} else {
				dict2.put(nums4[i], 1);
			}
		}
		int max = -1;
		int secondMax = -1;
		for (Map.Entry<Integer, Integer> entry : dict2.entrySet()) {
			if (entry.getValue() > max) {
				secondMax = max;
				max = entry.getKey();
			} else if (entry.getValue() > secondMax) {
				secondMax = entry.getKey();
			}
		}
		System.out.println("Second most occured value: " + secondMax);
		
		
		
		
		
		//Q. 
		//Given two String[], find the intersection of the two
		//Only counts those that is intersected once only
		//Try Practicing counting with dictionary
		String[] arr1 = new String[] {"1", "abc", "3", "6", "9", "Is", "3", "1"};
		String[] arr2 = new String[] {"4", "bc", "8", "Is", "9", "9", "4", "6"};
		//Return String[] {"Is", "6"}    <- do not count 9
		//Print out each String in result : 
		//Intersected at Is
		//Intersected at 6
		
		//A.
		String[] intersectedResult = SingleIntersection(arr1, arr2);
		for (String s : intersectedResult) {
			System.out.println("Intersected at " + s);
		}
	}
	
	public static String[] SingleIntersection(String[] arr1, String[] arr2) {
		Map<String, Integer> dict3 = new HashMap<String, Integer>();
		for (String s : arr1) {
			if (!dict3.containsKey(s))
				dict3.put(s, 1);
			else {
				dict3.remove(s);
			}
		}
		for (String s : arr2) {
			if (dict3.containsKey(s)) {
				dict3.replace(s, dict3.get(s) + 1);
			}
		}
		
		//Record result which has 2 occurences
		List<String> tempResult = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : dict3.entrySet()) {
			if (entry.getValue() == 2) {
				tempResult.add(entry.getKey());
			}
		}
		//Transform result to array
		String[] result = new String[tempResult.size()];
		for (int i = 0; i < tempResult.size(); i++) {
			result[i] = tempResult.get(i);
		}
		
		return result;
	}

}
