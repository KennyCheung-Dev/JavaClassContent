package CCC16_teaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		int quotient = dividend /divisor;
		int remainder = dividend % divisor;
		
		if (remainder != 0) {
			for (int i = remainder; i >= 2; i--) {
				if (remainder % i == 0 && divisor % i == 0) {
					remainder /= i;
					divisor /= i;
				}
			}
		}
		
		if (quotient == 0)
			System.out.println(remainder == 0? 0 : remainder + "/" + divisor);
		else
			System.out.println(remainder == 0? quotient : quotient + " " + remainder + "/" + divisor);
		
	}
}
