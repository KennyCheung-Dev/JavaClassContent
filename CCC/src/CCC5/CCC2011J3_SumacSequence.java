package CCC5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC2011J3_SumacSequence {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Question:
		//https://dmoj.ca/problem/ccc11j3
		
		/*
		 * In a sumac sequence, 𝑡1,𝑡2,…,𝑡𝑚, each term is an integer greater than or equal 0. 
		 * Also, each term, starting with the third, is the difference of the preceding two terms 
		 * (that is, 𝑡𝑛+2=𝑡𝑛−𝑡𝑛+1 for 𝑛≥1). The sequence terminates at 𝑡𝑚 if 𝑡𝑚−1<𝑡𝑚.

			For example, if we have 120 and 71, then the sumac sequence generated is as follows:
			
			120,71,49,22,27.
			
			This is a sumac sequence of length 5.
			
			Input Specification
			The input will be two positive numbers 𝑡1 and 𝑡2, with 0<𝑡2<𝑡1<10000.
			
			Output Specification
			The output will be the length of the sumac sequence given by the starting numbers 𝑡1 and 𝑡2.
		 */
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(sc.nextInt());
		li.add(sc.nextInt());
		while (true) {
			if (li.get(li.size()-2) < li.get(li.size()-1)) {
//				for (var i : li) {
//					System.out.println(i);
//				}
				System.out.println(li.size());
				break;
			} else {
				li.add(li.get(li.size()-2) - li.get(li.size()-1));
			}
		}
	}

}
