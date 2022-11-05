package Java3_1;


public abstract class temp {
	
	private static int tempCount = 0;
	private int id = 1000;
	private 
	
	static int[] arr1 = new int[] {1, 2, 2, 3};
	static int[] arr2 = new int[] {1, 2, 3, 4};
	
	protected abstract void Method(int one);
	
	
	protected int getId() {
		return this.id;
	}
	
	public static int get1() {
		return tempCount;
	}
	
	int one;
	int two;
	int[] fe = new int[3];
	

	
	private temp (int tempOne, int tenoTwo) {
		one = tempOne;
		int tempTempOne = tempOne;
		
		fe.clone();
	}
	
	public temp() {
		this(3, 2);
	}
	
	public int hi2() {
		if (one == 2) {
			return 2;
		} else if (one == 3) {
			return 3;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(findSomething(arr1, arr2));
		
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		int[] original = new int[] {1, 2, 3, 4, 5};
		int[] copy = original.clone();
		
		boolean[][] test = MakeGrid(2, 3);
		for (boolean[] row : test) {
			 for (boolean item : row) {
				 System.out.print(item + " ");
			 }
			 System.out.println();
		}
		
	}
	
	public int[][] modify(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				arr[i] = arr[i-1];
			}
		}
		return arr;
	}

	
	public static boolean[][] MakeGrid(int rows, int cols) {
		boolean[][] grid = new boolean[rows][cols];
		grid[0][0] = true;
		
		for (int i = 1; i < rows; i++)
			grid[i][0] = !grid[i - 1][0];
		
		for (int i = 0; i < rows; i++)
			for (int j = 1; j < cols; j++)
				grid[i][j] = !grid[i][j - 1];
		
		return grid;
	}
	int hi = 2;
	
	public static boolean[][] MakeGrid() {
		
		return MakeGrid(3, 3);
	}
	
	public static boolean findSomething(int[] a, int[] b) {
		
		
        for (int aValue: a) {
			boolean found = false; for (int bValue: b) {
				if (bValue == aValue) found = true;
			}
			if (!found) return false;
		}
        return true;
     }

}
