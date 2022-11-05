package SearchingSorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 3, 5, 2, 4, 7, 4, 0};
		QuickSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	//Partition() takes last element as pivot,
	//places the element at its correct position,
	//places smaller elements to the left and greater elements to the right.
	//Returns pivot index
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; //The right most element as pivot
		int i = (low - 1); //index of smaller element (-1 because we will be adding 1 each time we found an element)
		for (int j = low; j < high; j ++) {
			//Found an element that should be on the left
			if (arr[j] < pivot) {
				i++;
				
				//Swap arr[i] and arr[j]  
				int temp = arr[j];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		//swap arr[i+1] and arr[high]  (putting the pivot in the right place
		int temp = arr[i+1];
		arr[i+1]  = arr[high];
		arr[high] = temp;
		
		//Return the pivot's index
		return i + 1;
	}

	public static void QuickSort(int[] arr, int low, int  high) {
		if (low < high) { //if low and high are not at the same element or reversed 
			
			//pivotIndex pivot is now  at the right place, with left and right sorted
			int pivotIndex = partition(arr, low, high);
			
			//Recursively sort elements on both partition 
			QuickSort(arr, low, pivotIndex - 1);
			QuickSort(arr, pivotIndex + 1, high);
		}
	}
	
}
