package CCCExam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Cards {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);     
		int size = Integer.valueOf(br.readLine());
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		String line = br.readLine();
		String[] entries = line.split(" ");
		for (String entry : entries) {
			nums.add(Integer.valueOf(entry));
		}

		ArrayList<Integer> numsSorted = (ArrayList<Integer>) nums.clone();
		Collections.sort(numsSorted);
		
		
		int currentIndexFront = 0; 
		int currentIndexEnd = numsSorted.size() - 1;
		while (true) {
			if (currentIndexFront > currentIndexEnd) break;
			System.out.print(nums.indexOf(numsSorted.get(currentIndexFront)) + 1);
			nums.set(nums.indexOf(numsSorted.get(currentIndexFront)), null);	
			System.out.print(" "); 
			System.out.print(nums.indexOf(numsSorted.get(currentIndexEnd)) + 1);
			nums.set(nums.indexOf(numsSorted.get(currentIndexEnd)), null);
			System.out.println();
			currentIndexFront++;
			currentIndexEnd--;
		}
	}

}
