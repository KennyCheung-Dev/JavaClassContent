package CCC17_teaching;

import java.util.ArrayList;
import java.util.Scanner;

public class temp {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> startStreams = new ArrayList<Integer>();
		
		int startStreamNum = sc.nextInt();
		for (int i = 0; i < startStreamNum; i++)
			startStreams.add(sc.nextInt());
		sc.nextLine();
		
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
						resultStreams.add(streams.get(i) - streams.get(i) * percentage / 100);
					} else 
						resultStreams.add(streams.get(i));
				}
				RecursiveStreams(resultStreams);
				break;
			case "88":
				int joiningStream = Integer.valueOf(sc.nextLine()) - 1;
				for (int i = 0; i < streams.size(); i++) {
					if (i == joiningStream + 1) {
						resultStreams.add(streams.get(i) + streams.get(i-1));
					}
					else if (i != joiningStream)
						resultStreams.add(streams.get(i));
				}
				RecursiveStreams(resultStreams);
				break;
			case "77":
				for (Integer i : streams) {
					System.out.print(i);
					if (i != streams.size() - 1)
						System.out.print(" ");
				}
				break;
			default: 
				return streams;
		}
		return streams;
	}
}
