package Java3_1;

import java.util.ArrayList;

public class temp3 {

	public static void main(String[] args) {
		
//		ArrayList rabbitList = new ArrayList();
//		rabbitList.add(new Rabbit());
//		
//		//Case 1: No Cast
//		rabbitList.get(0).Age();
//		
//		//Case 2: Casted by no bracket
//		(Rabbit)rabbitList.get(0).Age();
//		
//		//Case 3: With Bracket
//		((Rabbit)rabbitList.get(0)).Age();
		
		Double dd = 0.0;
		dd++;
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("blah");
		ArrayList<String> l2 = new ArrayList<String>(l1);
		System.out.println(l2.get(0));
		
		
		
	}
	
	public static boolean isSelfDivisor(int number){
		int temp = number;
		while(temp>0) {
			int checkInt = temp%10;
			if(checkInt==0) {
				return false;
			}
			if(number%checkInt!=0)return false;
			temp/=10;
		}
		return true;
	}
	public static int[] firstNumSelfDivisors(int start, int num) {
		int[] result = new int[num];
		int counter = 0;
		int index = start;
		while (counter!=num) {
			if(isSelfDivisor(index)) {
				result[counter]=index;
				counter++;
			}
			index++;
		}
		return result;
	}
}
