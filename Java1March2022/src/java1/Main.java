package java1;

public class Main {
	
	public static int[] intArr = new int[5];
	
	public static void main(String[] args) {
		Meeettttthod();
		
		System.out.println("I am " + s);
		
		System.out.println(findBirthYear(12, 2000));
		System.out.println(findBirthYear(12));
		
		// "William" did not finish his "Homework"
		System.out.println("\"William\" did not finish his \"Homework\"");
		
		//     \o/
		System.out.println("\\o/");
		
		
		//  !@#$%^&*()-=[]\;',./

		//   \\\\\\""""""
		System.out.println("\\\\\\\\\\\\\"\"\"\"\"\"");
		
		int f = 0; 
//		if (f >= 1 && f <= 10 || f >= 90 && f <= 100) 
//			System.out.println("Never gonna give u up, never gonna let you down, never gonna run around and desert u, never gonna tell a lie never gonna say goodbye");
//
//		else if (f == 55 || f == 100 || f == 0)
//			System.out.println("Urdad");
// 		else {
//			System.out.println("urmom");
//			f++;
// 		}
		switch(f) {
			case 55:
				System.out.println("hehaw");
				
			case 100:
				System.out.println("ohuuh");
			case 0:
				System.out.println("uuhoh");
			default:
				System.out.println("hahah");
		}
		
		switch(5) {
			case -1:
				System.out.print("9");
			case 1:
				System.out.print("9");
			case 0:
				System.out.print("9");
				break;
			case 5:
				System.out.print("9");
			case 10:
				System.out.print("9");
				break;
			case 15:
				System.out.print("9");
			case 25:
				System.out.print("9");
			default:
				System.out.print("9");
				break;
		}
		
		
		//Make a switch statement with String  with 5 cases + default
		//Penalty will be all points gone if not completed
	}
		
	public static String s = "";
		
		// Check for 55, 100, 0, add a default case
		// Print any 5 letter words
	public static void Meeettttthod() {
		String s = "Danny";
		System.out.println("I am " + s);
	}
	
	 public static int findBirthYear(int age, int year) {
		 return year - age; 
	 }
	 
	 public static int findBirthYear(int age) {
		 return 2022 - age; 
	 }
	 
	 public static int ReturnFirst5b() {
		 int found5 = -1;
		 for (int i = 0; i < intArr.length; i++) {
			 if (intArr[i] == 5)
				 found5 = i;
		 }
		 return found5;
	 }
	 
	 public static int ReturnFirstNum5() {
		 for (int i = 0; i < intArr.length; i++) {
			 if (intArr[i] == 5) 
				 return 5;
		 }
		 return -1;
	 }
	 
	 
}