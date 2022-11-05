package CCC21;

import java.util.Scanner;

public class CCC2017J4_FavouriteTimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int minutesPassed = sc.nextInt();
		int count = 0;
		
		int hours = 12;
		int minutes = 0;
		
		int days = (int)(minutesPassed / 1440);
		count += days * 62;
		
		minutesPassed = minutesPassed % 1440;
		
		if (minutesPassed == 0 && days == 0) {
			System.out.println(0);
			return;
		}
		
		for (int i = 0; i < minutesPassed; i++) {
			sb.setLength(0);
			boolean pass = true;
			minutes++;
			minutes = minutes % 60;
			if (minutes == 0) hours++;
			hours = hours % 13;
			if (hours == 0) hours++;
			sb.append(hours);
			if (minutes < 10) sb.append("0");
			sb.append(minutes);
			String time = sb.toString();
			int tempDiff = Integer.valueOf(time.substring(1, 2)) - Integer.valueOf(time.substring(0, 1));
			for (int j = 1; j < time.length(); j++) {
				int digit = Integer.valueOf(time.substring(j, j+1));
				int previousDigit = Integer.valueOf(time.substring(j - 1, j));
				int currDiff = digit - previousDigit;
				if (currDiff != tempDiff) {
					pass = false;
					break;
				};
			}
			if (pass) count++;
		}
		System.out.println(count);
	}

}
