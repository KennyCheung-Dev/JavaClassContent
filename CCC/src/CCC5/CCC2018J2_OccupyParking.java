package CCC5;

import java.util.Scanner;

public class CCC2018J2_OccupyParking {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//https://dmoj.ca/problem/ccc18j2
		
		
		int size = sc.nextInt();
		int count = 0;
		sc.nextLine();
		String firstDay = sc.nextLine();
		String secondDay = sc.nextLine();
		
		
		for (int i = 0; i < size; i++) {
//			if (firstDay.substring(i, i+1).equals("C") && secondDay.substring(i, i+1).equals("C")) {
//				count++;
//			}
			if (String.valueOf(firstDay.charAt(i)).equals("C") && 
					String.valueOf(secondDay.charAt(i)).equals("C")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
