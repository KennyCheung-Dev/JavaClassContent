package maincodes;

public class FlowOfControl2 {
	static boolean evenSum;
	public static void main(String[] args) {
		evenSum = isSumEven(2, 2);
		System.out.println(evenSum);
	}
	
	public static boolean isSumEven(int num1, int num2) {
		int sum = num1 + num2;
		if (sum % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	//When isSumEven(2,2) is called,  the main pause and handed control over
	//isSumEven() is a return type, therefore it must 
	//return a value at smoe point in the code
	//The executation with (2,2) will result in return true; statement.
	//It does not execute any of the code after it because we have already found our answer(output).
	//The value of  evenSum is then printed, notice that if we do not have the
	//println, the answer would just stood there doing nothing. 
}
