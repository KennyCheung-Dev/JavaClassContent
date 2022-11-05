package maincodes;

public class FunctionCallStack {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		boolean isEven = isSumEven(num1, num2);
		System.out.println(isEven);
	}
	
	public static boolean isSumEven(int x, int y) {
		int sum = x + y;
		boolean  isEven = isNumberEven(sum);
		return isEven;
	}
	
	public static boolean isNumberEven(int x) {
		if (x % 2 == 0) {
			return true;
		}
		return false;
	}
	
	
	//Consider This Function Call Stack
	
	/* -------------------------------------
	 * First Stack: 
	 * isNumbeEven : x 
	 * -------------------------------------
	 * 2nd Stack:
	 * isSumEven : x, y, sum, isEven
	 * -------------------------------------
	 * 3rd Stack: 
	 * num1, num2, isEven
	 * -------------------------------------
	 */
	
	/*
	 * Our definition for Function Call Stack:
	 * Function Call Stack  is  a stack-like structure used to keep track of 
	 * the variables each time a method is called
	 * When a function is called, it registers stacks of function calls and variables from inside out 
	 * When a function is finished,  its stack frame is popped (removed) off the stack
	 * The execution order runs from top to bottom
	 * Typically the stack on the top is the currently executing method 
	 * 
	 */
	
	/* Variable Lifetime:
	 * Variables only lasts as long as their parent method or class
	 */
	
	
}
