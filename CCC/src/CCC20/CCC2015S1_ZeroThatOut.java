package CCC20;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2015S1_ZeroThatOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> li = new ArrayList<Integer>();
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				if (li.size() > 0) li.remove(li.size() - 1);
			} else {
				li.add(num);
			}
		}
		int sum = 0;
		for (int i : li) sum+=i;
		System.out.println(sum);
	}

}
