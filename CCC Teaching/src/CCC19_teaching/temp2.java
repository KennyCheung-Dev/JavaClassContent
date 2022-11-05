package CCC19_teaching;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class temp2 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int player = sc.nextInt();
		int match = sc.nextInt();
		int [] rank = new int [player];
		int [] score = new int[player];
		for(int i=0;i<match;i++) {
			ArrayList<Integer> roundScore = new ArrayList<Integer>();
			for(int o=0;o<player;o++) {
				int point = sc.nextInt();
				score[o]=score[o]+point;
				roundScore.add(point);
			}
			int rankNum = 1;
			int realRank = 1;
			ArrayList<Integer> sortedRound = (ArrayList<Integer>)roundScore.clone();
			Collections.sort(sortedRound);
//			Collections.reverse(sortedRound);
			int secondLast = sortedRound.get(1);
			int last = sortedRound.get(0);
			boolean round = true;
			for(int o=sortedRound.size()-1;o>=0;o--) {
				for(int p=0;p<roundScore.size();p++) {
					if(sortedRound.get(o)==roundScore.get(p)&&round==true) {
						System.out.println(o + " " + sortedRound.get(o));
						round=false;
						if(o!=0&&sortedRound.get(o)!=sortedRound.get(o-1)) {
							rankNum=realRank;
						}
						if(o==0&&last!=secondLast) {
							rankNum=realRank;
						}
						if(rank[p]<rankNum) {
							rank[p]=rankNum;
						}
						roundScore.set(p, null);
						realRank++;
					}
				}
				round=true;
			}
		}
		int highest=0;
		int ind = -1;
		for(int i=0;i<player;i++) {
			if(score[i]>highest) {
				highest=score[i];
			}
		}
		for(int i=0;i<player;i++) {
			if(score[i]==highest) {
				ind = i+1;
				System.out.println("Yodeller "+ ind + " is the TopYodeller: score "+ score[ind-1]+", worst rank "+rank[ind-1]);
				score[i]=highest-1;
			}
		}
	}
}