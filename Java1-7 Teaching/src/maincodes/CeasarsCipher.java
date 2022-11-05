package maincodes;
import java.util.Scanner;

public class CeasarsCipher {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String msg = GetStringInput();
		int index = GetIntInput();
		
		System.out.println(Cipher(msg, index));
		
//		for (int i = 0; i < 26; i++) {
//			System.out.println(Cipher("ZDRC WJVN JUYQJ FRW", i));
//		}
	}
	
	public static String Cipher(String input, int code) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String output = "";
		
		while (code < 0) code += 26;
		
		for (char c : input.toCharArray()) {
			boolean isUpperCase = false;
			//Check
			if (Character.toUpperCase(c) == c) {
				isUpperCase = true;
			}
			
			//Make lowercase 
			c = Character.toLowerCase(c);
			
			char newChar;
			
			if (alphabet.indexOf(c) == -1) {
				newChar = c;
			} else {
				int currentIndex = alphabet.indexOf(c);
				int newIndex = (currentIndex += code) % 26;
				newChar = alphabet.charAt(newIndex);
			}
			
			//Revert to Upper Case if applicable
			if (isUpperCase) newChar = Character.toUpperCase(newChar);
			
			output += newChar;
		}
		
		return output;
	}
	
	public static String GetStringInput() {
		while (true) {
			System.out.println("Please enter your message");
			String temp = in.nextLine();
			if (temp.isEmpty()) {
				System.out.println("Message is empty");
				continue;
			}
			return temp;
		}
	}
	
	//In-Class Exercise
	public static int GetIntInput() {
		while (true) {
			try {
				System.out.println("Please enter your desired encoding index");
				int temp = in.nextInt();
				System.out.println(temp);
				return temp;
			} catch (Exception e) {
				System.out.println("Input requires an integer!");
				in.nextLine();
			}
		}
	}
}
