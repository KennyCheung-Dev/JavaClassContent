package CCC12;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2008J4_FromPrefixToSuffix {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Receive input
		ArrayList<String> startArr = new ArrayList<String>();
		while (true) {
			String temp = sc.nextLine();
			if (temp.contentEquals("0")) break;
			startArr.add(temp);
		}
		//Split by " "
		ArrayList<ArrayList<String>> processedArr = new ArrayList<ArrayList<String>>();
		for (String s : startArr) {
			ArrayList<String> singleEntryArr = new ArrayList<String>();
			String[] splitWord = s.split(" ");
			for (String ss : splitWord) {
				singleEntryArr.add(ss);
			}
			processedArr.add(singleEntryArr);
		}
		//Converge and reorder each statement recursively
		for (int i = 0; i < processedArr.size(); i++) {
			processedArr.set(i, Converge(processedArr.get(i)));
		}
		//Concatenate to obtain the final string
		ArrayList<String> endArr = new ArrayList<String>();
		for (int i = 0; i < processedArr.size(); i++) {
			String endString = "";
			for (int j = 0; j < processedArr.get(i).size(); j++) {
				endString += processedArr.get(i).get(j);
			}
			endArr.add(endString);
		}
		//Print each line with space
		for (int i = 0; i < endArr.size(); i++) {
			for (int j = 0; j < endArr.get(i).length(); j++) {
				System.out.print(endArr.get(i).substring(j, j+1));
				if (j != endArr.get(i).length() - 1) System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	//Recursive detect and reorder operations
	public static ArrayList<String> Converge(ArrayList<String> arr) {
		if (arr.size() == 1) {
			return arr;
		} else {
			ArrayList<String> result = new ArrayList<String>();
			for (int i = 0; i < arr.size(); i++) {
				//If it is at the last two entry, no need to check for operation
				if (i >= arr.size() - 2) {
					result.add(arr.get(i));
				} else {
					//Check if the there is an operation
					if (arr.get(i).contentEquals("-") || arr.get(i).contentEquals("+")) {
						if (!arr.get(i+1).contentEquals("-") && !arr.get(i+1).contentEquals("+")) {
							if (!arr.get(i+2).contentEquals("-") && !arr.get(i+2).contentEquals("+")) {
								result.add(arr.get(i + 1) + arr.get(i + 2) + arr.get(i));
								i += 2;
								continue;
							}
						}
					}
					result.add(arr.get(i));
				}
			}
			return Converge(result);
		}
	}

}
