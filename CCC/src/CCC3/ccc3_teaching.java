package CCC3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ccc3_teaching {

	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
//		String s = sc.nextLine();
//		String[] a = s.split("");
//		boolean isR = true;
//		
//		for (int i = 0; i <= a.length-1; i++) {
//			if (!a[i].equals("I") && 
//					!a[i].equals("O") && 
//					!a[i].equals("S") && 
//					!a[i].equals("X") && 
//					!a[i].equals("H") && 
//					!a[i].equals("Z") && 
//					!a[i].equals("N")) {
//				isR = false;
//				break;
//			}
//		}
//		
//		if (isR) 
//			System.out.println("YES");
//		else
//			System.out.println("NO");
		
		
		
		String word = "Hello";
		for (char letter : word.toCharArray()) {
			String.valueOf(letter);
		}
		String[] alphabet = new String[] {"a", "b"};
		
		System.out.println(Arrays.asList(alphabet).indexOf("b"));
		
//		List<String> alphabet = Arrays.asList("a", "b", "c", )
	}
	

}
