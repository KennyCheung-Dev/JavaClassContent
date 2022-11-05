package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
//		Box<String> boxOfStrings = new Box<String>("Kenny", "Kenny2");
//		Box<Float> boxOfFloats = new Box<Float>(2.5f, 0.12f);
		
		Box<String, Float> boxOfSandF = new Box<String, Float>("Kenny", 99f);
		
		PrintString(boxOfSandF.ExportItem1());
		
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		ChangeItemInList(li);
		System.out.println(li.get(0));
	}
	
	public static void PrintString(String s) {
		System.out.println(s);
	}
	
	public static void ChangeItemInList(ArrayList<Integer> li) {
		li.set(0, 1000);
	}
	
	/*
	 * Homework:
	 * Chapter 6 Program Design and Analyze Question 1-10
	 * Chapter 7 Arrays and Array Lists Question 1-10
	 * 
	 * Bonus practice:
	 * Implement Generic in one of your classes in the past
	 */
	
}
