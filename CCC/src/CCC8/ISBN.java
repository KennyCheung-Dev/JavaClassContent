package CCC8;

import java.util.Scanner;

public class ISBN {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s = sc.nextLine();
		s = s.replace("-", "");
		
		int[] nums = new int[10];
		
		for (int i = 0; i < s.length(); i++) { 
			nums[i] = Integer.valueOf(String.valueOf(s.charAt(i))); 
		}
		
		int sum = 0;
		
		for (int i = 0; i < 9; i++) { 
			sum += (i + 1) * nums[i]; 
		}
		
		if (sum % 11 == nums[9]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		 
	}

}
