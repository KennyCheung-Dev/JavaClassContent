package CCCExam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheLostCow {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);     
		String line  = br.readLine();
		int x = Integer.valueOf(line.split(" ")[0]);
		int y = Integer.valueOf(line.split(" ")[1]);
		int currentPos = x;
		int destination = x; 
		int displacement = 1;
		int traveled = 0;
		while (true) {
			destination = x + displacement;
			if (y >= currentPos && y <= destination || y <= destination && y >= currentPos) {
				traveled += Math.abs(currentPos - y);
				break;
			} else {
				traveled += Math.abs(destination - currentPos);
				currentPos = destination;
			}
			
			displacement *= -2;
		}
		System.out.println(traveled);
	}

}
