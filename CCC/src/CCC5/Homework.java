package CCC5;

import java.util.Scanner;

public class Homework {
	
	//FindNucleotides
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(FindNucleotides("ATATGTAGCTAGCATAATA"));
		System.out.println(FindNucleotides("AAAAATTTTTGGGGAAAGGGTTTAAAGGGGGATGTAG"));
	}
	
	public static String FindNucleotides(String s) {
		for (int i = 0; i < s.length() - 3; i++) {
			if (s.substring(i, i+3).equals("ATG")) {
				for (int j = s.length() - 3; j > -1; j--) {
					if ((s.substring(j, j+3).equals("TAA") ||
							s.substring(j, j+3).equals("TAG") ||
							s.substring(j, j+3).equals("TGA")) &&
							j - i > 0 &&
							(j - i) % 3 == 0) {
						System.out.println(i);
						return s.substring(i, j+3);
					}
				}
				return "No Nucleotides Found";
			}
		}
		return "No Nucleotides Found";
	}

}
