package CCCExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCC2005J3_ReturningHome {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<String> places = new ArrayList<String>();
		List<String> directions = new ArrayList<String>();
		while (true) {
			directions.add(sc.nextLine());
			places.add(sc.nextLine());
			if (places.get(places.size()-1).contentEquals("SCHOOL")) break;
		}
		for (int i = 0; i < directions.size(); i++) {
			if (directions.get(i).contentEquals("L")) directions.set(i, "RIGHT");
			else directions.set(i, "LEFT");
		}
		//Build Result strings
		for (int i = directions.size() - 1; i > -1; i--) {
			StringBuilder s = new StringBuilder();
			s.append("Turn ");
			s.append(directions.get(i));
			if (i > 0)  {
				s.append(" onto ");
				s.append(places.get(i - 1));
				s.append(" street.");
			}
			else 
				s.append(" into your HOME.");
			System.out.println(s.toString());
		}
		
	}

}
