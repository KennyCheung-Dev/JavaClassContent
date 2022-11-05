package maincodes;

public class FlowOfControl {

	public static void main(String[] args) {
		
		int money = 0;
		//Flow of Control
		//You are counting money, you opened an empty container, there should been 
		//another briefcase in the container, you realize you left it at Vancouver. 
		//You ask personA to get if for you.
		//You have to wait for him since without the briefcase, you can't count the money
		//Person A does his job, return to your room, put the briefcase in the empty container
		//Person A finished his task, he is no longer needed, 
		//he stays on the side and ready for his next task.
		//Now that you have your briefcase, you continue and finish counting money.
		
		//Counting Money
		money += 1;
		money += 1;
		money += 1;
		money += 1;
		money += 1;
		
		//Discover that briefcase is missing
		// "Kenny go get it for me"
		// "Ok"
		
		money += GetBriefCase();
		
		//Continue counting money
		money += 1;
		money += 1;
		money += 1;
		money += 1;
		money += 1;
		
		//Finish!~ 
		System.out.println("The company has: " + money + " dollars");
	}
	
	//BriefCase with 20 dollars
	public static int GetBriefCase() {
		GettingMoney();
		return 20;
	}
	
	public static void GettingMoney() {
		System.out.println("Getting Money");
	}
}
