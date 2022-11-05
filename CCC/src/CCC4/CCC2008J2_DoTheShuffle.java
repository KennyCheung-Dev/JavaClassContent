package CCC4;

import java.util.Scanner;

public class CCC2008J2_DoTheShuffle {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//https://dmoj.ca/problem/ccc08j2
		
		String playList = "ABCDE";
		boolean running = true;
		while (running) {
			int buttonPressed = sc.nextInt();
			int times = sc.nextInt();
			switch (buttonPressed) {
				case 1:
					for (int i = 0; i < times; i++) playList = Button1(playList);
					break;
				case 2:
					for (int i = 0; i < times; i++) playList = Button2(playList);
					break;
				case 3:
					for (int i = 0; i < times; i++) playList = Button3(playList);
					break;
				case 4:
					System.out.println(playList.replace("", " ").trim());
					running = false;
					break;
			}
		}
		

	}
	public static String Button1(String l) {
		String temp = l.substring(1) + String.valueOf(l.charAt(0));
		return temp;
	}
	
	public static String Button2(String l) {
		String temp =  String.valueOf(l.charAt(l.length() - 1)) + l.substring(0, l.length() - 1);
		return temp;
	}
	
	public static String Button3(String l) {
		String temp =  String.valueOf(l.charAt(1)) + String.valueOf(l.charAt(0)) + l.substring(2);
		return temp;
	}

}
