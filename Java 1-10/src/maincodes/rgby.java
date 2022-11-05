package maincodes;

public class rgby {
	
	public static String[][] colorGrid;

	//Two Part Question:
	
	// 1)
	// Write FormGrid function to generate the grid
	// FormGrid(String colors, int rows, int cols)
	//colors is a string that consists of all colors: eg. "brrygrggyyyr"
	//rows and cols are the number of rows and columns for the string
	//Example to test: FormGrid("brrygrggyyyr", 3, 4);
	
	// 1.5)
	// For our debugging Convenience, let's create a PrintGrid() function that 
	// Prints the grid in the following way: 
	// b r r y
	// g r g g
	// y y y r
	
	// 2)
	// Write PaintRegion function to paint a blob a new color
	// PaintRegion(int row, int col, String newColor, String oldColor);
	// Example:  PaintRegion(2, 2, "b", "y"); yield:
	// b r r y
	// g r g g
	// b b b r
	
	//Notes: 
	//To Prevent user entering the same color in both old and new color,
	//Don't call recursively if the new and old colors are the same
	public static void main(String[] args) {
		FormGrid("brrygrggyyyr", 3, 4);
		PrintGrid();
		PaintRegion(2, 2, "b", "y");
		PrintGrid();
	}
	
	public static void FormGrid(String colors, int rows, int cols) {
		colorGrid = new String[rows][cols];
		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				colorGrid[i][j] = String.valueOf(colors.toCharArray()[counter]);
				counter++;
			}
		}
	}
	
	public static void PrintGrid() {
		for (int i = 0; i < colorGrid.length; i++) {
			for (int j = 0; j < colorGrid[0].length; j++) {
				System.out.print(colorGrid[i][j]  + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void PaintRegion(int row, int col, String newColor, String oldColor) {
		if (row >= 0 && row < colorGrid[0].length && col >= 0 && col < colorGrid.length) {
			//Added check for newColor, to prevent infinite loop
			if (!colorGrid[col][row].equals(newColor) && colorGrid[col][row].equals(oldColor)) {
				colorGrid[col][row] = newColor;
				PaintRegion(row + 1, col, newColor, oldColor);
				PaintRegion(row - 1, col, newColor, oldColor);
				PaintRegion(row, col + 1, newColor, oldColor);
				PaintRegion(row, col - 1, newColor, oldColor);
			}
		}
	}
}
