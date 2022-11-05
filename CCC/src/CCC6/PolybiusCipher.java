package CCC6;

public class PolybiusCipher {

	public static void main(String[] args) {
//		int[][] grid = new int[6][6];
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 6; j++) {
//				grid[i][j] = 
//			}
//		}
//		String[][] grid = {
//				{"a", "b", "c", "d", "e", "f"}, 
//				{"g", "h", "i", "j", "k", "l"},
//				{"m", "n", "o", "p", "q", "r"},
//				{"s", "t", "u" ,"v", "w", "x"}, 
//				{"y", "z", "0", "1", "2", "3"},
//				{"4", "5", "6", "7", "8", "9"}
//		};
		
		
		System.out.println(Decipher("bcfbfeacbdadafcacafacacedfffffabfa"));
		
	}
	
	public static String Decipher(String s) {
		String[][] grid = {
				{"n", "a", "l", "c", "3", "h"}, 
				{"g", "t", "b", "2", "o", "m"},
				{"e", "5", "w", "r", "p", "d"},
				{"4", "f", "6" ,"g", "7", "i"}, 
				{"g", "j", "0", "k", "l", "q"},
				{"s", "u", "v", "x", "y", "z"}
		};
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length()-1; i+=2) {
			char[] charArray = s.toLowerCase().toCharArray();
			result.append(grid[(int)(charArray[i]) - 97][(int)(charArray[i+1]) - 97]);
		}
		return result.toString();
	}

}
















