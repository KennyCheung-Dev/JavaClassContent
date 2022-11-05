package CCC8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Answer_SumacSequence {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(sc.nextInt());
		li.add(sc.nextInt());
		
		while (true) {
			if (li.get(li.size()-2) - li.get(li.size()-1) < 0) break;
			li.add(li.get(li.size()-2) - li.get(li.size()-1));
			if (li.get(li.size()-2) < li.get(li.size()-1)) {
				break;
			}
		}
		
		System.out.println(li.size());
		
	}

}
