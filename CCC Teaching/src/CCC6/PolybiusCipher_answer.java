package CCC6;

public class PolybiusCipher_answer {

	public static void main(String[] args) {
		System.out.println(Decipher("bcfbfeacbdadafcacafacacedfffffabfa"));
	}

	public static String Decipher(String s) {
		String[][] grid = {
				{"n", "a", "1", "c", "3", "h"}, 
				{"g", "t", "b", "2", "o", "m"},
				{"e", "5", "w", "r", "p", "d"},
				{"4", "f", "6" ,"g", "7", "i"}, 
				{"g", "j", "0", "k", "l", "q"},
				{"s", "u", "v", "x", "y", "z"}
		};
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length()-1; i+=2) {
			char[] charArray = s.toLowerCase().toCharArray();
			result.append(grid[(int)charArray[i]-97][(int)charArray[i+1]-97]);
		}
		return result.toString();
	}
}
