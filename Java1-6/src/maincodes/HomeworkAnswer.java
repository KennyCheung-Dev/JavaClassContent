package maincodes;

public class HomeworkAnswer {

	public static void main(String[] args) {
		//Q
		//Homework: 
				//Make a method that takes in an array of int as input, then print 2 lines: 
				//Line 1: The Sum is : { }
				//Line 2: The lowest number is : { }
				//Challenge: See if you an finish with just 1 loop
				int[] data = {5, 68, 243, 3, 747, 1, 2, 50};
				ProcessData(data);

	}

	//Answer
	public static void ProcessData(int[] input) {
		int sum = 0;
		int lowest = input[0];
		for(int i : input) {
			if (i < lowest) {
				lowest = i;
			}
			sum += i;
		}
		System.out.println("The sum is : " + sum);
		System.out.println("The lowest number is : " + lowest);
	}
	
}

