package maincodes;

public class BlobProblem {

	public static int size = 7;
	public static int[][] image = new int[size][size];
	
	
	public static void main(String[] args) {
		//Assign number 0 to every cell in the 2d array
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				image[i][j] = 0;
			}
		}
		
		image[1][1]=1;	image[2][1]=1;	image[3][1]=1;	image[4][1]=1;	image[5][1]=1;
		
		image[1][2]=1;													image[5][2]=1;	
		
		image[1][3]=1;					image[3][3]=1;					image[5][3]=1;
		
		image[1][4]=1;													image[5][4]=1;
		
		image[1][5]=1;	image[2][5]=1;	image[3][5]=1;	image[4][5]=1;	image[5][5]=1;	
		
		
		
		EraseBlob(1, 3);
		
		//Running the functions
//		PrintImage();
	}
	
	//Write a recursive algorithm to erase the blob, setting all connected pixel to 0
	//Your function will takes in 2 int argument, coordinates x,y of the point you start
	//You are the print your erasing process each time you erase a node, mark the space you
	//are erasing with a number "9"
	
	public static void EraseBlob(int i , int j) {
		if (i >= 0 && i < size && j >= 0 && j < size) {
			if (image[i][j] == 1) { 
				image[i][j] = 9;
				PrintImage();
				image[i][j] = 0;
				EraseBlob(i + 1, j);
				EraseBlob(i - 1, j);
				EraseBlob(i, j - 1);
				EraseBlob(i, j + 1);
			}
		}
	}
	
	public static void PrintImage() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
