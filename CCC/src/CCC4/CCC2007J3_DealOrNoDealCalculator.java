package CCC4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CCC2007J3_DealOrNoDealCalculator {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//https://dmoj.ca/problem/ccc07j3
		
		int times = sc.nextInt();
		List<Integer> casesLeft = new ArrayList<Integer>();
		casesLeft.add(100);
		casesLeft.add(500);
		casesLeft.add(1000);
		casesLeft.add(5000);
		casesLeft.add(10000);
		casesLeft.add(25000);
		casesLeft.add(50000);
		casesLeft.add(100000);
		casesLeft.add(500000);
		casesLeft.add(1000000);
		//Record the numbers that are taken
		int[] numbersTaken = new int[times];
		for (int i = 0; i < times; i++) {
			numbersTaken[i] = casesLeft.get(sc.nextInt() - 1);
		}

		//For each number taken, remove the value from casesLeft
		for (int i : numbersTaken) {
			casesLeft.remove(casesLeft.indexOf(i));
		}
		
		//Calculate Average
		float avg = 0;
		int sum = 0;
		for (int j : casesLeft) sum += j;
		avg = sum / casesLeft.size();
		
		//Output Result
		if (sc.nextInt() > avg) 
			System.out.println("Deal");
		else 
			System.out.println("No Deal");
	}

}
