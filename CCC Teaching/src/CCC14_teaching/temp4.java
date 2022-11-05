package CCC14_teaching;

import java.util.Scanner;

public class temp4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] keys = new String[10][];
		keys[0] = new String[0];
		keys[1] = new String[0];
		keys[2] = new String[] {"A", "B", "C"};
		keys[3] = new String[] {"D", "E", "F"};
		keys[4] = new String[] {"G", "H", "I"};
		keys[5] = new String[] {"J", "K", "L"};
		keys[6] = new String[] {"M", "N", "O"};
		keys[7] = new String[] {"P", "Q", "R", "S"};
		keys[8] = new String[] {"T", "U", "V"};
		keys[9] = new String[] {"W", "X", "Y", "Z"};
		
		int times = Integer.valueOf(sc.nextLine());
		for (int l = 0; l < times; l++) {
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				if (!s.substring(i, i+1).contentEquals("-")) {
					try {
						int temp = Integer.valueOf(s.substring(i, i+1));
						sb.append(temp);
					} catch (Exception e) {
						for (int j = 0; j < keys.length; j++) {
							for (int k = 0; k < keys[j].length; k++) {
								if (keys[j][k].contentEquals(s.substring(i, i+1))) {
									sb.append(j);
								}
							}
						}
					}
				}
			}
			sb.insert(3, "-");
			sb.insert(7, "-");
			System.out.println(sb.substring(0, 12));
		}
	}

}
