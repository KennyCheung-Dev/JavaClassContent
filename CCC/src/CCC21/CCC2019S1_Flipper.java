package CCC21;

import java.util.Scanner;

public class CCC2019S1_Flipper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] square = new int[][] {{1, 2}, {3, 4}};
		
		String sequence = sc.nextLine();
		int h = sequence.split("H", -1).length-1;
		int v = sequence.split("V", -1).length-1;
		if (h % 2 == 1) FlipHorizontal(square);
		if (v % 2 == 1) FlipVertical(square);
		
		for (int[] line : square) {
			System.out.println(line[0] + " " + line[1]);
		}
	}
	
	public static int[][] FlipHorizontal(int[][] square) {
		int[] line1 = square[0];
		square[0] = square[1];
		square[1] = line1;
		return square;
	}

	public static int[][] FlipVertical(int[][] square) {
		int topLeft = square[0][0];
		int bottomLeft = square[1][0];
		square[0][0] = square[0][1];
		square[1][0] = square[1][1];
		square[0][1] = topLeft;
		square[1][1] = bottomLeft;
		return square;
	}
}
