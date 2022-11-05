package CCC4;

import java.util.Arrays;

public class Substring {

	public static void main(String[] args) {
		System.out.println("hello".substring(1, 4));
		int[] nums = new int[] {1, 2, 3, 4, 5};
		int[] cut = Arrays.copyOfRange(nums, 1, 4);
		for (int i : cut) {
			System.out.println(i);
		}
	}

}
