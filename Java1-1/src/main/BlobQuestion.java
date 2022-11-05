package main;

public class BlobQuestion {
	public static int size = 7;
	public static int[][] image = new int[size][size];
	private static int increment = 1;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				image[i][j] = 0;
			}
		}

		image[1][1] = 1;
		image[2][1] = 1;
		image[3][1] = 1;
		image[5][1] = 1;
		image[1][1] = 1;
		
		image[1][2] = 1;
		image[5][2] = 1;
		
		image[1][3] = 1;
		image[3][3] = 1;
		image[5][3] = 1;
		
		image[1][4] = 1;
		image[5][4] = 1;
		
		image[1][5] = 1;
		image[2][5] = 1;
		image[3][5] = 1;
		image[4][5] = 1;
		image[5][5] = 1;
		
		
		System.out.println("Starting Image: ");
		PrintBlob();
		EraseBlob(5, 3);
		PrintBlob();
	}
	
	public static void PrintBlob() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void EraseBlob(int i, int j) {
//		if (i < 0 || i >= size)
//			return;
//		if (j < 0 || j >= size)
//			return;
				
		if (!InBound(i, j))
			return;
		image[i][j] = 0;
		if (InBound(i, j + increment) && image[i][j + increment] == 1) EraseBlob(i, j + increment);
		if (InBound(i, j - increment) && image[i][j - increment] == 1) EraseBlob(i, j - increment);
		if (InBound(i + increment, j) && image[i + increment][j] == 1) EraseBlob(i + increment, j);
		if (InBound(i - increment, j) && image[i - increment][j] == 1) EraseBlob(i - increment, j);
	}
	
	public static boolean InBound(int i, int j) {
		if (i >= 0 && i < size)
			if (j >= 0 && j < size)
				return true;
		return false;
	}
}
