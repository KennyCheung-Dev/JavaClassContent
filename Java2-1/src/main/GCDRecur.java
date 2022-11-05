package main;

public class GCDRecur {

	public static void main(String[] args) {
		System.out.println(GCDRecur(420, 276));
	}

	public static int GCDRecur(int n1, int n2) {
		int n3 = n1 % n2;
		if (n3 == 0)
			return n2;
		return GCDRecur(n2, n3);
	}
}
