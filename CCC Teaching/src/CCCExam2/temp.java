package CCCExam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class temp {

	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String line = br.readLine();
		
		String openBrackets = "{([<";
		String closeBrackets = "})]>";
		
		int replace = 0;
		
		HashMap<String, String> reverse = new HashMap<String, String>();
		reverse.put("}", "{");
		reverse.put(")", "(");
		reverse.put(">", "<");
		reverse.put("]", "[");
		
		Stack<String> st = new Stack<String>();
		
		for (int i = 0; i < line.length(); i++) {
			String symbol = line.substring(i, i+1);
			
			//Case1 open
			if (openBrackets.contains(symbol)) {
				st.push(symbol);
			}
			
			//Case2 close
			if (closeBrackets.contains(symbol)) {
				if (st.isEmpty()) {
					System.out.println("Impossible");
					return;
				}
				
				if (!st.lastElement().contentEquals(reverse.get(symbol))) {
					replace++;
				}
				st.pop();
			}
		}
		//Handle Abundant opening brackets
		if (st.size() > 0) {
			System.out.println("Impossible");
		} else {
			System.out.println(replace);
		}
		
	}
}
