package SearchingSorting;

public class SelectionSort {

	public static void main(String[] args) {
//		int[] selectionSort = SelectionSort(new int[]{5, 4, 6, 3, 7, 1, 9, 8});
//		int[] selectionSort = SelectionSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
		int[] sorted = SelectionSort(new int[]{76, 384, 372, 108, 849, 570, 868, 195, 873, 736, 934, 485, 264, 661, 653, 681, 601, 594, 374, 724, 974, 752, 65, 670, 309, 988, 723, 84, 467, 446, 330, 356, 314, 287, 533, 1, 764, 889, 75, 288, 154, 682, 405, 902, 122, 871, 411, 231, 790, 652});
		
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static int[] SelectionSort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			int temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
		return input;
	}
}
