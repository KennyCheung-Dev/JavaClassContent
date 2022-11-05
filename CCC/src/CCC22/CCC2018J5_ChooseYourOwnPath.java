package CCC22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CCC2018J5_ChooseYourOwnPath {

	public static class Page {
		int[] pages;
		int distance;
		boolean visited;
		
		Page(int[] pages, int distance, boolean visited) {
			this.pages = pages;
			this.distance = distance;
			this.visited = visited;
		}
	}
	
	public static ArrayList<Page> pages = new ArrayList<Page>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pageNum = Integer.valueOf(br.readLine());
		
		//Starting pages
		for (int i = 0; i < pageNum; i++) {
			String[] line = br.readLine().split(" ");
			int[] toPages = new int[line.length - 1];
			for (int j = 1; j < line.length; j++) 
				toPages[j-1] = Integer.valueOf(line[j]) - 1;
			pages.add(new Page(toPages, 2147483647, false));
		}
			
		//Set the first page's distance to 1
		pages.get(0).distance = 1;
		
		
		RecurVisit(0);
		
		boolean allVisited = true;
		int shortestDistance = 2147483647;
		for (Page p : pages) {
			if (p.pages.length == 0 && p.distance < shortestDistance) 
				shortestDistance = p.distance;
			if (!p.visited) allVisited = false;
		}
		
		System.out.println(allVisited? "Y" : "N");
		System.out.println(shortestDistance);
	}
	
	public static void RecurVisit(int index_to_visit) {
		pages.get(index_to_visit).visited = true;
		if (pages.get(index_to_visit).pages.length != 0) {
			boolean updated = false;
			for (int page_to_go : pages.get(index_to_visit).pages) {
				int updatedDistance = pages.get(index_to_visit).distance + 1;
				if (updatedDistance < pages.get(page_to_go).distance) {
					pages.get(page_to_go).distance = updatedDistance;
					updated = true;
				}
				if (pages.get(page_to_go).visited == false || updated)
					RecurVisit(page_to_go);
			}
		}
	}
}
