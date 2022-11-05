package main;

public class PsuedoCode {

	public static void main(String[] args) {
		
		int[] sorted = new int[]{76, 384, 372, 108, 849, 570, 868, 195, 873, 736, 934, 485, 264, 661, 653, 681, 601, 594, 374, 724, 974, 752, 65, 670, 309, 988, 723, 84, 467, 446, 330, 356, 314, 287, 533, 1, 764, 889, 75, 288, 154, 682, 405, 902, 122, 871, 411, 231, 790, 652};
		QuickSort(sorted, 0, sorted.length - 1);
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static void  QuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = Partition(arr, low, high);
			QuickSort(arr, low, pivot - 1);
			QuickSort(arr, pivot + 1, high);
		}
	}

	public static int Partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int leftwall = low - 1;
		
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				leftwall += 1;
				swap(arr, j, leftwall);
				
			}
		}
		
		swap(arr, leftwall + 1, high);
		
		return leftwall + 1;
	}
	
	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
