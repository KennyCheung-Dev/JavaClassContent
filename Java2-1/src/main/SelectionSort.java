package main;

public class SelectionSort {

	public static void main(String[] args) {
		int[] selectionSort = SelectionSort(new int[] {8, 5, 7, 2, 9, 10, 20002, -9});
		for (int i : selectionSort) {
			System.out.println(i);
		}
	}
	
	public static int[] SelectionSort(int[] input) {
		for (int i = 0; i < input.length; i++) { //looping for the start position, first unsafe pos
			int minIndex = i; //Start declaring first number is minimum
			for (int j = i + 1; j < input.length; j++) {  //Loop through all numbers after
				if (input[j] < input[minIndex])  //If we find a smaller number 
					minIndex = j; //Set that smaller as min
			}
			int temp = input[minIndex]; //Swap the smallest with the number on first unsafe position
			input[minIndex] = input[i]; //This increased the size of our sorted partition by 1
			input[i] = temp;
		}
		return input;
	}
}
