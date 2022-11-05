package main;

import Classes.*;

public class main {

	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoopy", 10, 5);
		Animal dog2 = new Dog("Snoopy", 10, 3);
		
		System.out.println(dog1.equals(dog2));

	}

}
