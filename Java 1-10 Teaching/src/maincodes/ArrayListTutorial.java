package maincodes;

import java.util.ArrayList;

public class ArrayListTutorial {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 3;
		nums[4] = 4;
		
		ArrayList<Integer> numsArrayList = new ArrayList<Integer>();

		
		for (int i  = 1; i < 101; i++) {
			numsArrayList.add(i);
		}
		numsArrayList.remove(1);
//		System.out.println(numsArrayList);
//		System.out.println(  numsArrayList.indexOf(5) );
		
		//Retrieve number at a certain index
//		System.out.println(numsArrayList.get(10));
		
		//Clone ArrayLists
		ArrayList<Integer> copied = (ArrayList<Integer>) numsArrayList.clone();
		
		System.out.println(copied);
		
		//Check element's presence
		System.out.println(    copied.contains(310)     );
		
//		for (Type var : list) {
//			print(var)
//		}
		
//		for (Integer entry : numsArrayList) {
//			System.out.println(entry);
//		}
		
//		for (int i = 0; i < numsArrayList.size(); i++) {
//			System.out.println(numsArrayList.get(i));
//		}
		
		
	}

}
