package maincodes;

public class Jason {

	public static void main(String[] args) {
		int add=1;
		for (int i=0; i<5; i++) {
//			System.out.println("FirstLine" + add);
			
			for(int a=0;a<=i;a++) {
				System.out.print(add + " ");
				add+=1;
			}
//			add++;
			System.out.println();
		}
	}
	
	//What Changed:
	//Commented line 8, 
	//Commented line 14, we only want to increment the number when we print it
	//Added space in line 11
	//Added println() to skip a line in line 15, after a line of number is completed
	
	//Suggestion, you would also want to build this into a function that takes an integer as parameter
	

}
