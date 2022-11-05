package CCC9;

public class Downpayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(savingsduration(120000, 0.05, 500000, 0.03));
	}
	
	public static int savingsduration(double annualsalary, double percentagesaved, double totalcost, double payraise) {
		double currentSavings = 0.0;
		int currentMonth = 0;
		while (currentSavings < totalcost * 0.25) {
			currentMonth++;
			if (currentMonth > 0 && currentMonth % 6 == 0) annualsalary *= (1.0 + payraise);
			currentSavings += annualsalary * percentagesaved / 12.0;
			if (currentMonth > 0 && currentMonth % 12.0 == 0) currentSavings *= 1.04;
			System.out.println(currentSavings);
			
		}
		return currentMonth;
	}

}
