package maincodes;

public class Main2 {

	public static void main(String[] args) {
		//Parsing Binaries/Hex to Decimals:
		System.out.println(  Integer.parseInt("11111100100", 2)   );
		System.out.println(  Integer.parseInt("29", 16)   );
		
		//Parsing Decimal code to Hex/Binary
		System.out.println( Integer.toString(2020, 2));
		System.out.println( Integer.toString(41, 16));
		
		/*
		0 1 2 3 4 5 6 7 8 9 a b c d e f
		
		  29  c2  b5
		 (  2 * 16 + 9 * 1  ),  (12 * 16 + 2 * 1),   (11 * 16 + 5 * 1)
		  
		  
		  Final RGB: 41, 194, 181
		
		*/
	}

}
