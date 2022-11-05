package main;

public class Main8 {

	public static void main(String[] args) {
		
		//Parse Decimal to Hex/Binary
		//Dec -> Bin
		System.out.println(Integer.toString(159, 2));
		//Dec -> Hex
		System.out.println(Integer.toString(159, 16));
		
		
		//Bin -> Dec
		System.out.println(Integer.parseInt("9F", 16));
		//Hex -> Dec
		System.out.println(Integer.parseInt("10011111", 2));
		
		//Homework:
		/*
		 * Turn these numbers into Hexadecimal (base 16):
		 * 1, 15, 1640
		 * 
		 * Turn these numbers into Binary (base 2):
		 * 421
		 * 
		 * Turn these numbers back to Decimal (base 10):
		 * FF 9E 111101110
		 */
			
	}

}
