package main;

public class Main11 {

	public static void main(String[] args) {
		ReverseWordRcr("Kenny");
		
		// Print    ynneK
	}

	public static String ReverseWordRcr(String word) {
		if (word.length() == 1) 
			return word;
		return ReverseWordRcr(word.substring(1)) + word.substring(0, 1);
	}
	
//	public static void ReverseWordRcr(String word) {
//		if (word.length() == 0) 
//			return;
//		ReverseWordRcr(word.substring((1)));
//		System.out.print(word.substring(0, 1));
//	}
	
}
