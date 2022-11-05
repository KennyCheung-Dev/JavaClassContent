package CCCExam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BeautifulPaintings {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
		 BufferedReader br=new BufferedReader(r);     
		 int size = Integer.valueOf(br.readLine());
		 ArrayList<Integer> ai = new ArrayList<Integer>();
		 
		 String line = br.readLine();
		 String[] entries = line.split(" ");
		 for (String entry : entries) {
			 ai.add(Integer.valueOf(entry));
		 }
		 
		 Collections.sort(ai);
		 
		 int happyCount = 0;
		 int currentEntry = ai.get(0);
		 ai.remove(0);
		 int currentIndex = 0;
		 while (ai.size() > 0) {
			 if (ai.get(currentIndex) > currentEntry) {
				 currentEntry = ai.get(currentIndex);
				 ai.remove(currentIndex);
				 happyCount++;
				 currentIndex = 0;
			 } else {
				 if (currentIndex + 1 < ai.size()) 
					 currentIndex++;
				 else {
					 currentEntry = ai.get(0);
					 ai.remove(0);
					 currentIndex = 0;
				 }
			 }
		 }
		 System.out.println(happyCount);
	}

}
