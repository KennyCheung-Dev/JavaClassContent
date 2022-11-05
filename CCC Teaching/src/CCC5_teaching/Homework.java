package CCC5_teaching;

import java.util.Scanner;

public class Homework {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.println(FindNucleotides("GGGGGGGGGGGGTAAATGGGGFGG"));
	}
	
	public static String FindNucleotides(String s) {
		for (int i = 0; i < s.length() - 3; i++) {
			if (s.substring(i, i+3).equals("ATG")) {
				// Found the start! \o/
				for (int j = s.length() - 3; j > -1; j--) {
					if (s.substring(j, j+3).equals("TAA") || 
							s.substring(j, j+3).equals("TAG") || 
							s.substring(j, j+3).equals("TGA")) {
						if ((j - i) % 3 == 0 && (j - i) > 0) return s.substring(i, j+3);
					}
				}
				return "None Nucleotide Found";
			}
		}
		return "None Nucleotide Found";
	}
}
