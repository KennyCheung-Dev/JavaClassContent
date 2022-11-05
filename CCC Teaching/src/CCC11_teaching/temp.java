package CCC11_teaching;

import java.util.HashMap;
import java.util.Map;

public class temp {

	public static void main(String[] args) {
//		int[] nums = {1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};
//		
//		//
//		HashMap<Integer, Integer> dict = new HashMap();
//		for (int i = 0; i < nums.length; i++) {
//			if (dict.containsKey(nums[i])) {
//				dict.replace(nums[i], dict.get(nums[i]) + 1);
//			} else {
//				dict.put(nums[i], 1);
//			}
//		}
//		
//		int max = -1;
//		int secondMax = -1;
//		String maxKey = "";
//		String secondMaxKey = "";
//		for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
//			if (entry.getValue() > max) {
//				secondMax = max;
//				max = entry.getValue();
//				secondMaxKey = maxKey;
//				maxKey = String.valueOf(entry.getKey());
//			} else if (entry.getValue() > secondMax) {
//				secondMax = entry.getValue();
//				secondMaxKey = String.valueOf(entry.getKey());
//			}
//		}
//		System.out.println("Second most occured value : " + secondMaxKey);
		
		
		//Q.
		/*
		 * Given two String[], find the intersection of the two
		 * Only counts those that is intersected once only
		 * this would be really easy with loops, but try practicing dictionaries
		 * 
		 */
		String[] arr1 = new String[] {"1", "abc", "3", "6", "9", "Is", "3", "1"};
		String[] arr2 = new String[] {"4", "bc", "8", "Is", "9", "9", "4", "6"};
		// Return String[] {"Is", "6"}   <- do not count 9
		// OR
		//Print out each String in result:
		//Intersected at Is
		//Intersected at 6
		
		
		//A.
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		for (String s : arr1) {
			if (!dict.containsKey(s))
				dict.put(s, 1);
			else
				dict.replace(s, 999);
		}
		
		for (String s : arr2) {
			if (dict.containsKey(s)) {
				dict.replace(s, dict.get(s) + 1);
			}
		}
		
		for (Map.Entry<String, Integer> entry : dict.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.println("Intersected at " + entry.getKey());
			}
		}
 	}

}
