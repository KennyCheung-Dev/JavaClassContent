package CCC17;

import java.util.HashMap;
import java.util.Scanner;

public class CCC2008S1_ItsColdHere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lowestTemp = 200;
		String lowestCity = "";
		while (true) {
			String line = sc.nextLine();
			int tempTemp = Integer.valueOf(line.split(" ")[1]);
			String tempCity = line.split(" ")[0];
			if (tempTemp < lowestTemp) {
				lowestTemp = tempTemp;
				lowestCity = tempCity;
			}
			if (tempCity.contentEquals("Waterloo")) break;
		}
		System.out.println(lowestCity);
	}

}
