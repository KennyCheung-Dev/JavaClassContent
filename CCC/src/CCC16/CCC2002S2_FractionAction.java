package CCC16;

import java.util.Scanner;

public class CCC2002S2_FractionAction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend = Integer.valueOf(sc.nextLine());
		int divisor = Integer.valueOf(sc.nextLine());
		int quotient = dividend / divisor;
		int remainder = dividend - quotient * divisor;
		
		//Simplify remainder and divisor
		if (remainder != 0) {
			for (int i = remainder; i >= 2 ; i--) {
				if (remainder % i == 0 && divisor % i == 0) {
					remainder = remainder / i;
					divisor = divisor / i;
					break;
				}
			}
		}
		if (quotient == 0)
			System.out.println(remainder == 0 ? 0 : remainder + "/" + divisor);
		else
			System.out.print(remainder == 0 ? quotient : quotient + " " + remainder + "/" + divisor);
		
		
	}

}
