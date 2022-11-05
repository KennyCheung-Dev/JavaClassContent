package Java3_1;

import java.util.ArrayList;

public abstract class temp2 extends temp implements iTemp {
	
	protected int getId() {
		return Add();
	}
	
	public static void main(String[] args) {
		int x = 0;
		
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		int[] arr = new int[10];
		
		
		//Getting length/size
		//ArrayList
		intArrList.size();
		//Array
		System.out.println(arr.length);
		
		//Extracting an element with index
		//ArrayList
		intArrList.get(5);
		//Array
		System.out.println(arr[5]);
		
		
		for (Integer item : intArrList) {
			System.out.println(item);
			item += 5;
		}
		
		for (Integer item : arr) {
			System.out.println(item);
			item += 5;
		}
		
		while(x>0) {
			
		}


	}




}
