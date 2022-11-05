package CCCExam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class ReplaceToMakeRegularBracketSequence {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
		 BufferedReader br=new BufferedReader(r);     
		 String line = br.readLine();
		 String openBrackets = "{([<";
		 String closeBrackets = "})]>";
		 int replace = 0;
		 HashMap<String, String> reverse = new HashMap<String, String>();
		 reverse.put("}", "{");
		 reverse.put(">", "<");
		 reverse.put(")", ")");
		 reverse.put("]", "[");
		 
		 Stack<String> st = new Stack<String>();
		 for (int i = 0; i < line.length(); i++) {
			 String symbol = line.substring(i, i+1);
			 if (openBrackets.contains(symbol)) {
				 st.push(symbol);
			 } else if (closeBrackets.contains(symbol)) {
				 if (st.isEmpty()) {
					 System.out.println("Impossible");
					 return;
				 }
				 if (!st.lastElement().contentEquals(reverse.get(symbol))) {
					 System.out.println(symbol);
					 replace++;
				 }
				 st.pop();
			 }
		 }
		 if (st.size() > 0) {
			 System.out.println("Impossible");
		 } else {
			 System.out.println(replace);
		 }
	}

}
