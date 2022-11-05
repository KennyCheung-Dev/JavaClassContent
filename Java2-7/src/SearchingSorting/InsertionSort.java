package SearchingSorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] sorted = InsertionSort(new int[]{5, 4, 3, 2, 1});
		
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static int[] InsertionSort(int[] input) {
		//Starting from second position
		for (int i = 1; i < input.length; i++) {
			int currentIndex = i;
			for (int j = i - 1; j >= 0 && input[j] > input[currentIndex]; j--) {
					
				//Print the Numbers Before Change
				System.out.print("Numbers: ");
				for (int k : input) {
					System.out.print(k);
				}
					
				//Print the Change
				System.out.print("       Changed: " + input[j] + " " + input[currentIndex]);
					
				//Swap the numbers
				int temp = input[j];
				input[j] = input[currentIndex];
				input[currentIndex] = temp;
				//Change the current checking index
				currentIndex = j;
					
				//Print the Changed Numbers
				System.out.print("       Changed Numbers: ");
				for (int k : input) {
					System.out.print(k);
				}
				System.out.println();
			}
		}
		return input;
	}

}
