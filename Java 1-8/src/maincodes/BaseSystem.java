package maincodes;

public class BaseSystem {

	public static void main(String[] args) {
		/* Practice:
		 * Bin -> Dec:
		 * 11000
		 * 101
		 * 11111100100
		 * 
		 * Answer: 24/05/2020
		 */
		
		
		//------------Parsing Decimal to Hex/Binary-------------
		//Bin -> Dec
		System.out.println(Integer.toString(500, 2));
		//Hex -> Dec
		System.out.println(Integer.toString(500, 16));
		
		
		//------------Parsing Hex/Bin code to Decimal------------
		//Dec -> Hex
		System.out.println(Integer.parseInt("FF", 16));
		//Dec -> Bin
		System.out.println(Integer.parseInt("111110100", 2));
		
		/* Color Hex Code:
		 * #FFFFFF
		 * #90e3f0
		 * Every two digits is a a value from 0 - 255, corresponding to Red Green Blue
		 */
		
		System.out.println(Integer.toString(24, 2));
		System.out.println(Integer.toString(5, 2));
		System.out.println(Integer.toString(2020, 2));
	}

}
