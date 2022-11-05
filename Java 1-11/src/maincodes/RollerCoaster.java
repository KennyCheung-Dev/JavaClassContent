package maincodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class RollerCoaster {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Prompt users for the colours
		System.out.println("Number of Acceptable shirt colours and their colours in the following format:");
		System.out.println("red,green,blue");
		String[] colours = in.nextLine().split(",");
		
		//Prompt users for today's weekday or not
		boolean weekday = false;
		while (true) {
			System.out.println("Is today a weekday?, please type \"yes\" or \"no\".");
			String weekdayString = in.nextLine();
			if (weekdayString.equals("yes")) {
				weekday = true;
				break;
			} else if (weekdayString.equals("no")) {
				weekday = false;
				break;
			}
		}
		
		//Prompt users for the students: 
		System.out.println("Please let us know how many students there are:");
		int studentNum = in.nextInt();
		in.nextLine();
		System.out.println("Please type the student's information in the following format:");
		System.out.println("Name,HaveTicket,ColourOfShirt");
		System.out.println("Example: \"Kenny,yes,blue\"");
		String[][] students = new String[studentNum][3];
		for (int i = 0; i < studentNum; i++) {
			System.out.println("Student #" + (i + 1) + ":");
			students[i] = in.nextLine().split(",");
		}
		
		// Array["name", boolean ticket, "color"]
		
		// ---------------------------------------------------------------
		ArrayList<Boolean> canRide = new ArrayList<Boolean>();
		
		//Perform Checks:
		for (String[] student : students) {
			//Initial status is true
			boolean status = true;
			
			//Check color of shirt
			// Convert String Array to List
	        List<String> tempList = Arrays.asList(colours);
	        if(!tempList.contains(student[2])){
	        	status = false;
	        }
	        
	        //Check names
//	        List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' ,'m' ,'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
	        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
	        char firstLetter = student[0].toLowerCase().charAt(0);
	        if (weekday == false)  {
	        	if (vowels.contains(firstLetter)) {
	        		status = false;
//	        		System.out.println("Declined because name contains consonants");
	        	}
	        } else {
	        	if (!vowels.contains(firstLetter)) {
	        		status = false;
//	        		System.out.println("Declined because name contains vowels");
	        	}
	        }
	        
	        //Check Ticket
	        if (!student[1].equals("yes")) {
	        	status = false;
//	        	System.out.println("Declined because ticket is missing");
	        }
	        
	        canRide.add(status);
		}
		
		//---------------------------------------------------------------
		
		
		//Code to check the students list
//		for (int i = 0; i < studentNum; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(students[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//Code to print out the result for all students:
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student #" + (i+1) + ": " + students[i][0] + "  - "  );
			if (canRide.get(i) == true) {
				System.out.print("approved");
			} else {
				System.out.print("declined");
			}
			System.out.println();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
