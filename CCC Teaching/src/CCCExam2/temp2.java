package CCCExam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class temp2 {

	static ArrayList<int[]> arr =new ArrayList<int[]>();
	static int width = -1;
	static int height = -1;
	static String[][] matrix;
	
	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String size = br.readLine();
		
		width = Integer.valueOf(size.split(" ")[0]);
		height = Integer.valueOf(size.split(" ")[1]);
		matrix = new String[width][height];
		
		//Plug in values for matrix
		for (int i = 0; i < width; i++) {
			String l = br.readLine();
			for (int j = 0; j < height; j++) {
				matrix[i][j] = l.substring(j, j+1);
			}
		}
		
		//Using Propegate recursive methods to get an arr of all connected points
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (matrix[i][j].contentEquals("*")) {
					arr.clear();
					Propegate(new int[] {i, j});
					matrix[i][j] = String.valueOf(arr.size() % 10);
				}
			}
		}
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void Propegate(int[] currentPos) {
		if (!IntArrayEquals(arr, new int[] {currentPos[0], currentPos[1]})) 
			arr.add(new int[] {currentPos[0], currentPos[1]});
		
		//Checks:
		//If in bound of matrix
		//If it is a "."
		//If the coordinates is not already in arr
		//Then we want to add the coordinate into arr
		//Also want to run Propegate on the new coordinate
		if (currentPos[0] - 1 >= 0) {
			if (matrix[currentPos[0] - 1][currentPos[1]].contentEquals(".")) {
				if (!IntArrayEquals(arr, new int[] {currentPos[0] - 1, currentPos[1]})) {
					arr.add(new int[] {currentPos[0] - 1, currentPos[1]});
					Propegate(new int[] {currentPos[0] - 1, currentPos[1]});
				}
			}
		}
		
		if (currentPos[0] + 1 < width) {
			if (matrix[currentPos[0] + 1][currentPos[1]].contentEquals(".")) {
				if (!IntArrayEquals(arr, new int[] {currentPos[0] + 1, currentPos[1]})) {
					arr.add(new int[] {currentPos[0] + 1, currentPos[1]});
					Propegate(new int[] {currentPos[0] + 1, currentPos[1]});
				}
			}
		}
		
		if (currentPos[1] - 1 >= 0) {
			if (matrix[currentPos[0]][currentPos[1] - 1].contentEquals(".")) {
				if (!IntArrayEquals(arr, new int[] {currentPos[0], currentPos[1] - 1})) {
					arr.add(new int[] {currentPos[0], currentPos[1] - 1});
					Propegate(new int[] {currentPos[0], currentPos[1] - 1});
				}
			}
		}
		
		if (currentPos[1] + 1 < height) {
			if (matrix[currentPos[0]][currentPos[1] + 1].contentEquals(".")) {
				if (!IntArrayEquals(arr, new int[] {currentPos[0], currentPos[1] + 1})) {
					arr.add(new int[] {currentPos[0], currentPos[1] + 1});
					Propegate(new int[] {currentPos[0], currentPos[1] + 1});
				}
			}
		}
 	}
	
	public static boolean IntArrayEquals(ArrayList<int[]> a, int[] b) {
		boolean equals = false;
		for (int[] temp : a) {
			boolean digitsEquals = true;
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] != b[i]) digitsEquals = false;
			}
			if (digitsEquals) equals = true;
		}
		return equals;
	}
}
