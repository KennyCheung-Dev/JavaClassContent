package CCC9;

public class Quaterback {

	public static void main(String[] args) {
		System.out.println(QuaterbackRating(35, 26, 235, 2, 1));

	}
	
	public static double QuaterbackRating(double attempts, double comps, double yards, double tdowns, double ints) {
		double[] scores = new double[4];
		scores[0] = (double) ((comps/attempts - 0.3) * 5);
		scores[1] = (double) ((yards/attempts - 3) * 0.25);
		scores[2] = (double) (20.0 * tdowns / attempts);
		scores[3] = (double) (2.375 - (25.0 * ints / attempts));
		
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 2.375) scores[i] = 2.375;
			else if (scores[i] < 0) scores[i] = 0.0;
			total += scores[i];
		}
		
		return (total / 6.0) * 100;
	}

}
