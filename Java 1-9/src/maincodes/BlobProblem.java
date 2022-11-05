package maincodes;

public class BlobProblem {
	
	public static int size = 7;
	public static int[][] image = new int[size][size];
	
	public static void main(String[] args) {
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				image[i][j] = 0;
			}
		}
		image[1][1] = 1;	image[2][1] = 1;	image[3][1] = 1;	image[4][1] = 1;	image[5][1] = 1;
		
		image[1][2] = 1;																image[5][2] = 1;
		
		image[1][3] = 1;				   		image[3][3] = 1;						image[5][3] = 1;	
		
		image[1][4] = 1;																image[5][4] = 1;
		
		image[1][5] = 1;	image[2][5] = 1;	image[3][5] = 1;	image[4][5] = 1;	image[5][5] = 1;
		
		System.out.println("Starting Image: ");
		PrintBlob();
		EraseBlob(5, 3);
		
	}
	
	public static void PrintBlob() {
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//Write a recursive algorithm to erase the blob, setting all connected pixel to 0
	//Your function takes in 2 int argument, coordinates of the point you start erasing
	//You are to print your erasing process each time you erase a node. with an "9" marking the spot of erase
	public static void EraseBlob(int i, int j) {
		//Check if the coordinates given is within the blob
		if (i >= 0 && i < size && j >= 0 && j < size) {
			//If the position needs to be erased
			if (image[i][j] == 1) {
				System.out.println("Removing Position: [" + j + ", " + i + "]");
				image[i][j] = 9;
				PrintBlob();
				image[i][j] = 0;
				//Recursively calls the connecting pixels
				EraseBlob(i + 1, j);
				EraseBlob(i - 1, j);
				EraseBlob(i, j + 1);
				EraseBlob(i, j - 1);
			}
		}
	}
	
	

}
