package maincodes;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPrac2 {

	public static void main(String[] args) {
		// Question generated just to demonstrate the strength of List and ListIterator

		// Generate an ArrayList of integers counting from 0 to 100
		// Loop through the list, if the number can be divided by 3 and 7,
		// add a new number entry right after to indicate a match
		// 0
		// 10000
		// 1
		// 2
		// 3
		// 10000
		// 4
		// 5
		// 6
		// 10000
		// 7
		// 10000
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 101; i++) {
			nums.add(i);
		}

		// Does not work!?
//		for (int number : nums) {
//			 if (number % 3 == 0 || number % 7 == 0) {
//				 nums.add(0);
//			 }
//		}

		// We cannot change the list while we are iterating it
		// We can use the listIterator from Java, only for Lists (ArrayList, LinkedList)
		// List Iterator
		ListIterator<Integer> iter = nums.listIterator();
		while (iter.hasNext()) {
			int currentNum = iter.next();
			if (currentNum % 3 == 0 || currentNum % 7 == 0) {
				iter.add(10000);
			}
		}

		// Test of result
		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println("Size of New List: " + nums.size());

	}

}
