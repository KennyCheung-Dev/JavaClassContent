package main;
import java.lang.Math;
import java.util.ArrayList;

public class Main {
	
	public int hello = 5;

	public static void main(String[] args) {
		/*
		
		/*
		 * The "Object" Class
		 */
		
//		Animal dog1 = new Dog("Pluto", 10, 5);
//		Animal dog2 = new Dog("Pluto", 10, 5);
		
		Animal dog1 = new Dog("Pluto", 10, 5);
		Animal dog2 = new Dog("Pluto", 10, -999);
		
		
		System.out.println(dog1.equals(dog2));
		
		Integer myInt = new Integer(5);
		Integer myInt2 = new Integer(6);
		System.out.println(myInt.toString());
		
		int i1 = 5;
		int i2 = 5;
		
//		i1.equals(i2);
//		System.out.println(i1 == i2);
		
		System.out.println(myInt2.compareTo(myInt));
		
		System.out.println(myInt2.compareTo(5));
		
		Double mydouble = new Double(5.5);
		System.out.println(mydouble.hashCode());
		
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		
		
		
		
	}

}
