package CCC22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CCC2015J5_PiDay {

	public static Scanner sc = new Scanner(System.in);
	public static int pieces = 0;
	public static int person = 0;
	public static HashMap<Context, Integer> map = new HashMap<Context, Integer>();
	
	public static class Context {
		int piecesStarting;
		int piecesTaken;
		int depth;
		
		public Context(int piecesStarting, int piecesTaken, int depth) {
			this.piecesStarting = piecesStarting;
			this.piecesTaken = piecesTaken;
			this.depth = depth;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + depth;
			result = prime * result + piecesStarting;
			result = prime * result + piecesTaken;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Context other = (Context) obj;
			if (depth != other.depth)
				return false;
			if (piecesStarting != other.piecesStarting)
				return false;
			if (piecesTaken != other.piecesTaken)
				return false;
			return true;
		}
	}
	
	public static void main(String[] args) {
		pieces = sc.nextInt();
		person = sc.nextInt();
		int maxStartPiece = Integer.valueOf(pieces / person) + 1;
		int totalCount = 0;
		for (int i = 1; i < maxStartPiece; i++) {
			map.clear();
			int result = RecurPie(i, 0, 0, new ArrayList<Integer>());
			totalCount += result;
		}
		System.out.println(totalCount);
	}
	
	public static int RecurPie(int pieceStarting, int piecesTaken, int depth, ArrayList<Integer> sequence) {
		ArrayList<Integer> newSequence = (ArrayList<Integer>) sequence.clone();
		newSequence.add(pieceStarting);
		
		if (depth < person - 1) {
			int piecesRemaining = pieces - piecesTaken;
			int personRemaining = person - depth - 1;
			int maxPossiblePiecesToStart = Integer.valueOf(piecesRemaining / personRemaining) + 1;
			
			if (map.containsKey(new Context(pieceStarting, piecesTaken, depth))) 
				return map.get(new Context(pieceStarting, piecesTaken, depth));
			
			int subsequentCount = 0;
			
			for (int i = pieceStarting; i < maxPossiblePiecesToStart; i++) {
				int result = RecurPie(i, piecesTaken + i, depth + 1, newSequence);
				subsequentCount += result;
			}
			
			map.put(new Context(pieceStarting, piecesTaken, depth), subsequentCount);
			
			return subsequentCount;
		} else if (depth == person - 1) {
			int sum = 0;
			for (int i : newSequence) sum+= i;
			if (sum == pieces) {
				map.put(new Context(pieceStarting, piecesTaken, depth), 1);
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
}
