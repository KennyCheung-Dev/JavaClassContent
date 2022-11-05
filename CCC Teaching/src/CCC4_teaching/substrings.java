package CCC4_teaching;

import java.util.Arrays;

public class substrings {

	public static void main(String[] args) {
		System.out.println("hello".substring(1, 4));
		int[] num = new int[] {12, 23, 34, 45, 56};
		num = Arrays.copyOfRange(num, 1, 4);
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
