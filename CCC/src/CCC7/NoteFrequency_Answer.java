package CCC7;

public class NoteFrequency_Answer {

	public static void main(String[] args) {
		
		System.out.println(NoteFrequency(0, 0));
	}
	
	public static double NoteFrequency(double a, double b) {
	    return (double)(440 * Math.pow(2, ((a - 4) + ((b - 9) / 12))));
	}
}
