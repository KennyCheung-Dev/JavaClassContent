package CCC22_teaching;

import java.util.ArrayList;
import java.util.HashMap;

public class CCC2015J5_PiDay {
	
	public static class Context {
		
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

		int piecesStarting;
		int piecesTaken;
		int depth;
		
		public Context(int piecesStarting, int piecesTaken, int depth) {
			this.piecesStarting = piecesStarting;
			this.piecesTaken = piecesTaken;
			this.depth = depth;
		}
	}
	
	public static HashMap<Context, Integer> map = new HashMap<Context, Integer>();
	
	
	
	public static void main(String[] args) {
		map.put(new Context(1, 0, 0), 13);
	}
	
	public static int RecurPie(int pieceStarting, int piecesTaken, int depth, ArrayList<Integer> sequence) {
		/*
		 * if map.containsKey(new Context(121231312)) {
		 * 		return map.get(new Context(....));
		 * }
		 * 
		 * Depending on the depth, if we are not at the last person
		 * 		For each possibility of number of pieces the next person can get e.g. 1 piece, 2 pieces
		 * 			Figure out the possible combinations onwards, and accumulate
		 * 			Next person can go with [1, 1  or [1, 2
		 * 			[1, 1 recursively called, and return with 5
		 * 			[1, 2 recursively called, returned with 8 possibilities
		 * 			
		 * 			
		 * if (!map.containsKey(new Context(pieceStarting, pieceTaken, depth))) {
			map.put(new Context(pieceStarting, pieceTaken, depth), result);
		}
		Return 5 + 8.
		 * If you are the last person
		 * 		Figure out if its a valid sequence, by adding your sequence, see if it matches total pieces
		 * 		If match, return 1,
		 * 		If not, return 0
		 * 
		 * 
		 */
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int result = RecurPie(1, 0, 0, new ArrayList<Integer>());
			sum += result;
		}
		return sum;
	}
}
