package InterfaceExample;

import java.util.ArrayList;

public class Animal {
    
	public static ArrayList<Animal> animalList = new ArrayList<Animal>();
	
    private String name;
    private int age;
   
    public Animal(String name, int age) {
          this.name = name;
          this.age = age;
    }
   
    public void magicSpeak() {
          System.out.println("Hello! my name is " + name);
          System.out.println("I am " + age + " years old");
    }


}
