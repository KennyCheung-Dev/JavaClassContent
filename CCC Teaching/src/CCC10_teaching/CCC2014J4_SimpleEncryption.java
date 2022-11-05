package CCC10_teaching;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2014J4_SimpleEncryption {

	private static final String List = null;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println(SimpleEncryption("TRICKY", "I LOVE PROGRAMMING!"));
	}
	
	public static String SimpleEncryption(String key, String content) {
		content = StripSymbols(content);
		
		//Put content into a few columns storage
		ArrayList<ArrayList<String>> storage = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < key.length(); i++) { 
			storage.add(new ArrayList<String>());
		}
		for (int i = 0; i < content.length(); i++) {
			int column = i % key.length();
			storage.get(column).add(content.substring(i , i+1));
		}
		
		//Encrypt message
		for (int i = 0; i < storage.size(); i++) {
			for (int j = 0; j < storage.get(i).size(); j++) {
				String s = PositionToString(
						(StringToPosition(storage.get(i).get(j)) + StringToPosition(key.substring(i, i+1)))
						% 26
						);
				storage.get(i).set(j, s);
			}
		}
		
		//Construct the new result string
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < content.length(); i++) {
			int column = i % key.length();
			s.append(storage.get(column).get(0));
			storage.get(column).remove(0);
		}
		return s.toString();
	}
	
	public static String StripSymbols(String s) {
		return s.replaceAll("[^a-zA-Z]", "");
	}
	public static String PositionToString(int i) {
		return Character.toString((char)(i + 65));
	}
	public static int StringToPosition(String c) {
		return (((int)c.toCharArray()[0]) - 65);
	}

}
