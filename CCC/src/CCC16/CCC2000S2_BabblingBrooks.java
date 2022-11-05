package CCC16;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2000S2_BabblingBrooks {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> startStreams = new ArrayList<Integer>();

		int startStreamNum = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < startStreamNum; i++) {
			startStreams.add(Integer.valueOf(sc.nextLine()));
		}
		RecursiveStreams(startStreams);
	}

	public static ArrayList<Integer> RecursiveStreams(ArrayList<Integer> streams) {
		String command = sc.nextLine();
		ArrayList<Integer> resultStreams = new ArrayList<Integer>();
		switch (command) {
			case "99":
				int splittingStream = Integer.valueOf(sc.nextLine()) - 1;
				int percentage = Integer.valueOf(sc.nextLine());
				for (int i = 0; i < streams.size(); i++) {
					if (i == splittingStream) {
						resultStreams.add(streams.get(i) * percentage / 100);
						resultStreams.add(streams.get(i) - (streams.get(i) * percentage / 100));
					} else {
						resultStreams.add(streams.get(i));
					}
				}
				RecursiveStreams(resultStreams);
				break;
			case "88":
				int joiningStream = Integer.valueOf(sc.nextLine()) - 1;
				for (int i = 0; i < streams.size(); i++) {
					if (i == joiningStream) {
					} else if (i == joiningStream + 1) {
						resultStreams.add(streams.get(i) + streams.get(i-1));
					} else {
						resultStreams.add(streams.get(i));
					}
				}
				RecursiveStreams(resultStreams);
				break;
			case "77":
				for (Integer i : streams) {
					System.out.print(i);
					if (i != streams.size() - 1) {
						System.out.print(" ");
					}
				}
				return streams;
			default:
				return streams;
		}
		return null;
	}
	
}
