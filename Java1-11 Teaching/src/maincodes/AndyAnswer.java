package maincodes;
import java.util.Scanner;
import java.util.ArrayList;

public class AndyAnswer {

	public static void main(String[] args) {
		System.out.println("Enter the accepted color(please type as 'black, blue, green'): ");
		Scanner in=new Scanner(System.in);
		String[] colors =in.nextLine().split(", ");
		
		System.out.println("How many student: ");
		int students = in.nextInt();
		
		int x = 1;
		System.out.println("Enter the students information(please type as 'name, tickets, shirtcolor'example 'Andy, yes, green'): ");
		
		do {
			System.out.println("Student" + x);
			Scanner get=new Scanner(System.in);
			String[] infos = get.nextLine().split(", ");
			String[] nameStart = infos[0].split("");
			if (check(nameStart[0], isWeekday(), infos[2], colors, infos[1])) {
				System.out.println(infos[0] + ": able to ride");
			}
			else
				System.out.println(infos[0] + ": unable to ride");
			x ++;
		}while(x <= students);
	}
	
	public static boolean isWeekday() {
		System.out.println("Is today weekday? (please type 'yes' or 'no'): ");
		Scanner in=new Scanner(System.in);
		String weekday = in.nextLine();
		if(weekday.equals("yes"))
			return true;
		else
			return false;
	}
	
	public static boolean check(String nameStart, boolean isWeekday, String shirtCol, String[] accCol, String haveTicket) {
		if(isWeekday) {
			if(nameStart.equals("A") || nameStart.equals("E") || nameStart.equals("I") || nameStart.equals("O") || nameStart.equals("U")) {
				if(haveTicket.equals("yes")) {
					for (int i = 0; i < accCol.length; i ++) {
					if(shirtCol.equals(accCol[i])) {
						return true;
						}
					}
				}
			}
		}
		return false;
	}

}
