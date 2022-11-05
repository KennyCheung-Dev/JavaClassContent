package CCC5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CCC2015J2_HappyOrSad {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//https://dmoj.ca/problem/ccc15j2
		
		//Input:
		//How are you :-) doing :-( today :-)?
		//Output:
		//happy
		
		//Input:
		//This :-(is str :-(:-a(nge te:-)xt.
		//Output:
		//sad
		
		//Input:
		//:)
		//Output:
		//none
		int happy = 0, sad = 0;
		String s = sc.nextLine();
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.substring(i, i+3).equals(":-)")) happy++;
			if (s.substring(i, i+3).equals(":-(")) sad++;
		}
		if (happy > sad) System.out.println("happy");
		else if (sad > happy) System.out.println("sad");
		else if (sad != 0) System.out.println("unsure");
		else System.out.println("none");

	}

}
