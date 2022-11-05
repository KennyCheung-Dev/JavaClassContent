package CCC18_teaching;

import java.util.Scanner;

public class temp {

	public static int[][] spiral;
	public static int layers;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int low = Integer.valueOf(sc.nextLine());
		int high = Integer.valueOf(sc.nextLine());
		
		//Calculate the layers we need:
		int numAmount = high + 1 - low;
		layers = 1;
		while (true) {
			if (numAmount < Math.pow(layers, 2))
				break;
			layers++;
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
		
		//Actually going around and printing numbers
		int nextNum = low;
		String currentMovingDirection = "down";
		spiral[x][y] = nextNum;
		
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
		
		//Print spiral
		for (int i = 0; i < layers; i++) {
			for (int j = 0; j < layers; j++) {
				if (spiral[i][j] == -1) continue;
				System.out.print(spiral[i][j]);
				if (j != layers - 1) System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static boolean CheckDirEmpty(String s, int x, int y) {
		switch (s) {
			case "up":
				if (x - 1 < 0) return false;
				if (spiral[x - 1][y] == -1) return true;
				return false;
			case "down":
				if (x + 1 >= layers) return false;
				if (spiral[x + 1][y] == -1) return true;
				return false;
			case "left":
				if (y - 1 < 0) return false;
				if (spiral[x][y - 1] == -1) return true;
				return false;
			case "right":
				if (y + 1 >= layers) return false;
				if (spiral[x][y + 1] == -1) return true;
				return false;
			default:
				return false;
			
		
		}
	}

}
