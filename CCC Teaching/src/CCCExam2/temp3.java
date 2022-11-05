package CCCExam2;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Scanner;

public class temp3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int card = sc.nextInt();
		
		sc.nextLine();
		
		int[] cardnumber = new int[card];
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int[] cardrange = new int[card];
		
		for(int i = 0; i < card; i ++) {
		
			cardnumber[i] = sc.nextInt();
			
			arr.add(cardnumber[i]);
			
			cardrange[i] = cardnumber[i];
		
		}
		
		Arrays.sort(cardrange);
		
		for(int h = 0; h < card/2; h ++) {
		
			System.out.print(arr.indexOf(cardrange[h])+1 + " ");
			
			arr.set(arr.indexOf(cardrange[h]), 0);
			
			System.out.print(arr.indexOf(cardrange[cardrange.length-1-h]) + 1);
			
			arr.set(arr.indexOf(cardrange[cardrange.length-1-h]), 0);
			
			System.out.println();
		
		}
	
	}

}
