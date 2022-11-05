package CCC17;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2001S2_Spiral {

	public static int[][] spiral;
	public static int layers;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int low = Integer.valueOf(sc.nextLine());
		int high = Integer.valueOf(sc.nextLine());
		//Layers and number of elements that fits: 
		//2 * 2 = 4
		//3 * 3 = 9
		//4 * 4 = 16
		//5 * 5 = 25
		//6 * 6 = 35
		//7 * 7 = 49
 		
		// Calculate the layers we need:
		int numsAmount = high + 1 - low;
		layers = 2;
		while (true) {
			if (numsAmount < Math.pow(layers, 2)) {
				break;
			}
			layers += 1;
		}
		
		spiral = new int[layers][layers];
		for (int i = 0; i < layers; i++)
			for (int j = 0; j < layers; j++)
				spiral[i][j] = -1;
		
		int x = Math.floorDiv(layers, 2);
		int y = Math.floorDiv(layers, 2);
		if (layers % 2 == 0) {
			x--;
			y--;
		}
		
		int nextNum = low;
		spiral[x][y] = nextNum;
		String currentMovingDirection = "down";
		while (true) {
			if (nextNum + 1 > high) break;
			switch (currentMovingDirection) {
				case "up":
					while (true) {
						if (nextNum + 1 > high) break;
						nextNum++;
						x--;
						spiral[x][y] = nextNum;
						if (CheckDirEmpty("left", x, y)) {
							currentMovingDirection = "left";
							break;
						}
					}
					break;
				case "down":
					while (true) {
						if (nextNum + 1 > high) break;
						nextNum++;
						x++;
						spiral[x][y] = nextNum;
						if (CheckDirEmpty("right", x, y)) {
							currentMovingDirection = "right";
							break;
						}
					}
					break;
				case "left":
					while (true) {
						if (nextNum + 1 > high) break;
						nextNum++;
						y--;
						spiral[x][y] = nextNum;
						if (CheckDirEmpty("down", x, y)) {
							currentMovingDirection = "down";
							break;
						}
					}
					break;
				case "right":
					while (true) {
						if (nextNum + 1 > high) break;
						nextNum++;
						y++;
						spiral[x][y] = nextNum;
						if (CheckDirEmpty("up", x, y)) {
							currentMovingDirection = "up";
							break;
						}
					}
					break;
			}
		}
		
		
		//Print result
		for (int i = 0; i < layers; i++) {
			StringBuilder sb = new StringBuilder();
			
			//Figure out spaces needed on the left within this line
			int validCount = 0;
			for (int k = 0; k < layers; k++) {
				if (spiral[i][k] != -1) {
					validCount++;
				}
			}
			for (int l = 0; l < layers - validCount - 1; l++) sb.append("   ");
			
			//Printing the numbers
			for (int j = 0; j < layers; j++) {
				if (spiral[i][j] != -1) {
					if (spiral[i][j] < 10) sb.append(" ");
					sb.append(spiral[i][j]);
					if (j != layers - 1) sb.append(" ");
				}
			}
			System.out.println(sb.toString());
		}
				
		
		
	}
	
	public static boolean CheckDirEmpty(String s, int x, int y) {
		switch (s) {
			case "up":
				if (x - 1 < 0) return false;
				if (spiral[x-1][y] == -1) return true;
				else return false;
			case "down":
				if (x + 1 >= layers) return false;
				if (spiral[x+1][y] == -1) return true;
				else return false;
			case "left":
				if (y - 1 < 0) return false;
				if (spiral[x][y-1] == -1) return true;
				else return false;
		case "right":
				if (y + 1 >= layers) return false;
				if (spiral[x][y+1] == -1) return true;
				else return false;
			default:
				return false;
		}
	}

}
