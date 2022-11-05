package CCC10_teaching;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dict {

	public static void main(String[] args) {
		//Determine the number of times that a certain element appears in an array or List
		//Find the index that the element first appear
		int[] nums = new int[] {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4};
		List<Integer> nums2 = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4);
		
		//Position
//		System.out.println(Arrays.binarySearch(nums, 3));
//		System.out.println(nums2.indexOf(3));
		
		//Occurrences
		//Arrays
//		int count = 0;
//		for (int i : nums) if (i == 4) count++;
//		System.out.println(count);
//		//List
//		System.out.println(Collections.frequency(nums2, 4));
		
		//Q.
		//Given an int[] and a integer target. Find the first pair of elements a and b
		// that satisfy a + b = target and return their index position
		//assume numbers within the int[] will not contain duplicates
		// Output: "Found the numbers at position n and position m."
//		int[] nums3 = new int[] {2, 7, 11, 15};
//		int target = 9;

//		boolean con = true;
//		for (int i = 0; i < nums3.length; i++) {
//			for (int j = 0; j < nums3.length; j++) {
//				if (i != j) {
//					if (nums3[i] + nums3[j] == target) {
//						System.out.println("Found the numbers at position " + i + " and position " + j + ".");
//						con = false;
//						break;
//					}
//				}
//			}
//			if (!con) break;
//		}
		
		//Hashmap dictionary creation
		HashMap<Integer, Integer> dict = new HashMap();
		//Add value
		dict.put(1, 0);
		dict.put(2, 100);
		//Change value
		dict.replace(2, 50);
		//Grab value
		System.out.println(dict.get(2));
		//Remove value
		dict.remove(2);
		//Loop through the dictionary:
		for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
	}
}
