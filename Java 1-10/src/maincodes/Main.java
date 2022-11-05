package maincodes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Declaration + Initialization
		ArrayList<Integer> nums = new ArrayList<Integer>();

		// Add Element
		nums.add(11);
		nums.add(13);
		nums.add(15);

		// Add at certain index
		nums.add(1, 12);

		// Adding from another ArrayList
		nums.addAll(nums);
		nums.addAll(0, nums);

		// Retrieve values
		System.out.println(nums.get(0));

		// Get Index of the first of given element
		System.out.println(nums.indexOf(11));

		// Remove element by index and by element
		nums.remove(3);
		nums.remove(nums.get(3));

		// Cloning ArrayLists
		ArrayList<Integer> clonedNums = (ArrayList<Integer>) nums.clone();

		// Check if element's presence
		System.out.println(nums.contains(11));

		// Printing the ArrayList would bring us an informative list
		System.out.println(nums);
		System.out.println(clonedNums);

	}

}
