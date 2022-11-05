package main;

public class InsertionSort {

	public static void main(String[] args) {
		int[] sorted = InsertionSort(new int[] {5, 4, 2, 3, 1});
		for (int i : sorted) {
			System.out.println(i);
		}
	}

	public static int[] InsertionSort(int[] input) {
		//Start from second position
		for (int i = 1; i < input.length; i++) { //Start index 1 after sorted partition
			int currentIndex = i;   // Current index will be our currently moving number on the right side
			//Loop backwards and continue swapping as long as 
			//number on left is still bigger than number on currentIndex
			for (int j = i - 1; j >= 0 && input[j] > input[currentIndex]; j--) {  
				//Swap the numbers
				int temp = input[j];
				input[j] = input[currentIndex];
				input[currentIndex] = temp;
				currentIndex = j; //Update currentIndex to the left swapped position
			}
		}
		return input; 
	}
}
