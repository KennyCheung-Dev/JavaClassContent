package CCC13_teaching;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2008J4_FromPrefixToSuffix {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> startArr = new ArrayList<String>();
		while (true) {
			String temp = sc.nextLine();
			if (temp.contentEquals("0")) break;
			startArr.add(temp);
		}

		ArrayList<ArrayList<String>> processedArr = new ArrayList<ArrayList<String>>();
		for (String s : startArr) {
			ArrayList<String> singleEntryArr = new ArrayList<String>();
			String[] splitWord = s.split(" ");
			for (String ss : splitWord) {
				singleEntryArr.add(ss);
			}
			processedArr.add(singleEntryArr);
		}
		
		for (int i = 0; i < processedArr.size(); i++) {
			processedArr.set(i, Converge(processedArr.get(i)));
		}
		
		for (ArrayList<String> temparr : processedArr) {
			for (String sss : temparr) {
				for (int i = 0; i < sss.length(); i++) {
					System.out.print(sss.substring(i, i + 1));
					if (i != sss.length() - 1) System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	
	public static ArrayList<String> Converge(ArrayList<String> arr) {
		while (arr.size() > 1) {
			ArrayList<String> result = new ArrayList<String>();
			for (int i = 0; i < arr.size(); i++) {
				if (i >= arr.size() - 2) {
					result.add(arr.get(i));
				} else {
					if (arr.get(i).contentEquals("-") || arr.get(i).contentEquals("+")) {
						if (!arr.get(i+1).contentEquals("-") && !arr.get(i+1).contentEquals("+")) {
							if (!arr.get(i+2).contentEquals("-") && !arr.get(i+2).contentEquals("+")) {
								result.add(arr.get(i+1) + arr.get(i+2) + arr.get(i));
								i += 2;
								continue;
							}
						}
					}
					result.add(arr.get(i));
				}
			}
			arr = result;
		}
		return arr;
	}
}
