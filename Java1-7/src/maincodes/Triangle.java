package maincodes;

public class Triangle {

	public static void main(String[] args) {
		int currentNum = 0;
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(currentNum + " ");
				 currentNum += 1;
			}
			System.out.println();
		}

	}

}
