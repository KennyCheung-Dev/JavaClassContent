package maincodes;
import java.util.Scanner;
import java.util.ArrayList;

public class AlexAnswer {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList <String> group = new ArrayList<String>();
		ArrayList <String> ticket = new ArrayList<String>();
		ArrayList <String> shirtcolors = new ArrayList<String>();
		ArrayList <String> weekday = new ArrayList<String>();

		int j = 1;
		while (j > 0) {
		System.out.println("What are your names?");
		String names = in.nextLine();
		group.add(names);
		System.out.println("Got a ticket?");
		String bruh = in.nextLine();
		ticket.add(bruh);
		System.out.println("What color is your shirt?");
		String color = in.nextLine();
		shirtcolors.add(color);
		System.out.println("Is it a weekday?");
		String huh = in.nextLine();
		weekday.add(huh);
		if (weekday.equals("yes")) {
		for (int i = 0; i < group.size(); i++);
		}
		   
		}
	}

}



