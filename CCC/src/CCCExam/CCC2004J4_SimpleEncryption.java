package CCCExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC2004J4_SimpleEncryption {

	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.println(SimpleEncryption(sc.nextLine(), sc.nextLine()));
	}
	
	public static String SimpleEncryption(String key, String content) {
		//Strip content from symbols
		content = StripSymbols(content);
		//Put content into storage
		List<ArrayList<String>> storage = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < key.length(); i++) {
			storage.add(new ArrayList<String>());
		}
		for (int i = 0; i < content.length(); i++) {
			int column = i % key.length();
			storage.get(column).add(content.substring(i, i+1));
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
		
		//Construct new string
		StringBuilder s = new StringBuilder();
		int count = 0;
		while (storage.get(count % key.length()).size() != 0) {
			s.append(storage.get(count % key.length()).get(0));
			storage.get(count % key.length()).remove(0);
			count++;
		}
		return s.toString();
	}
	
	public static String StripSymbols(String s) {
		return s.replaceAll("[^a-zA-Z]", "");
	}
	
	public static String PositionToString(int i) {
		return Character.toString ((char)(i + 65));
	}
	public static int StringToPosition(String c) {
		return ((int)c.toCharArray()[0]) - 65;
	}

}
