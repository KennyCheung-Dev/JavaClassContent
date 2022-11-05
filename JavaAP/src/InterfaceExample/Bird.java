package InterfaceExample;

import java.util.ArrayList;

public class Bird extends Animal implements FlyingObject {
	
	
	public ArrayList<Integer> intList = new ArrayList<Integer>();
	
	
    double glidingSpeed;
   
    public Bird(String name, int age, double speed) {
          super(name, age);
          glidingSpeed = speed;
          Animal.animalList.add(this);
    }
   
    @Override
    public void fly() {
          System.out.println("I'm a bird! My speed is " + glidingSpeed + "km/h");
    }   
   

}
