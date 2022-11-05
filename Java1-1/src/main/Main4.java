package main;

import java.util.stream.IntStream;

public class Main4 {

	public static void main(String[] args) {
		//Homework
		/*
		 * Make a method that takes in an array of int as parameters, then print 2 lines:
		 * Line1: The sum is : {}
		 * Line2: The lowest number is : {}
		 */
		int lowest = 9999999;
		
		int[] data = {5, 68, 243, 3, 747, 1, 2, 50};
//		ProcessData(data, true);
		
		//If you are not sure how we can do this,
		//You are free to research online
		//Hint, loop through the array
		
//		String[] ourNames = new String[] { "Kenny", "Daisy", "Devin", "Luke", "Philip", "RiceBender" };
		
		//Use foreach loop to print all the names
		
		
		
		
	}

	
	public static void ProcessData(int[] dataIn) {
		int sum = 0;
		int lowestnum = dataIn[0];
		for (int i = 0; i < dataIn.length; i++) {
			sum += dataIn[i];
			if (dataIn[i] < lowestnum) 
				lowestnum = dataIn[i];
		}
		System.out.println("The sum is : " + sum);
		System.out.println("The lowest number is : " + lowestnum);
	}
	
	public static void ProcessData(int[] dataIn, boolean weirdSwitch) {
		int sum = 0;
		int lowestnum = dataIn[0];
		
		//V2
		for (int num : dataIn) {
			sum += num;
			if (num < lowestnum) 
				lowestnum = num;
		}
		
		//Format
		// for (DataType  DataName :  ArrayOfData) {}
		
		System.out.println("The sum is : " + sum);
		System.out.println("The lowest number is : " + lowestnum);
	}

}
