package maincodes;

public class HomeworkAns_Triangle {
	public static void main(String[] args) {
		Triangle(5);
	}
	
	public static void Triangle(int n) {
		int currentNum = 1;
		for (int i = 1; i < (n + 1); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(currentNum);
				System.out.print(" ");
				 currentNum += 1; 
			}
			System.out.println();
		}
	}
}
/*
Practice:
	#Bin -> Dec:
	11000
	101
	11111100100
*/