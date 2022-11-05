package CCC21_teaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CCC2010J4_GlobalWarming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			
			ArrayList<Integer> intList = new ArrayList<Integer>();
			String[] arr = line.split(" ");
			if (arr[0].contentEquals("0")) break;
			for (int i = 1; i < arr.length; i++)
				intList.add(Integer.valueOf(arr[i]));
			//Check all size
			ArrayList<String> pattern = ExposePattern(intList);
			int shortestPattern = pattern.size();
			for (int i = pattern.size(); i > 0; i--) {
				if (CheckPattern(i, pattern)) {
					if (i < shortestPattern) shortestPattern = i;
				}
			}
			System.out.println(shortestPattern);
		}

	}
	
	public static ArrayList<String> ExposePattern(ArrayList<Integer> intList) {
		ArrayList<String> stringList = new ArrayList<String>();
		for (int i = 1; i < intList.size(); i++)
			stringList.add(String.valueOf(intList.get(i) - intList.get(i-1)));
		return stringList;
	}
	
	public static boolean ContainsPattern(ArrayList<String> list1, ArrayList<String> list2) {
		boolean pass = true;
		for (int i = 0; i < list2.size(); i++) {
			if (!list1.get(i).contentEquals(list2.get(i))) {
				pass = false;
				break;
			}
		}
		return pass;
	}
	
	public static boolean CheckPattern(int length, ArrayList<String> list) {
		ArrayList<String> pattern = new ArrayList<String>(list.subList(0,  length));
		for (int j = 0; j < list.size(); j+=length) {
			if (list.size() - j < length) {
				ArrayList<String> split = new ArrayList<String>(list.subList(j, list.size()));
				if (!ContainsPattern(pattern, split)) return false;
			} else {
				ArrayList<String> split = new ArrayList<String>(list.subList(j,  j+length));
				if (!pattern.equals(split)) return false;
			}
		}
		return true;
	}

}
