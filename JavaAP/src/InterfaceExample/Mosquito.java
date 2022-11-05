package InterfaceExample;

public class Mosquito extends Animal implements FlyingObject {
    double flyingSpeed;
   
    public Mosquito(String name, int age, double speed) {
          super(name, age);
          flyingSpeed = speed;
    }

    public void fly() {
          System.out.println("I'm a mosquito! My speed is " + flyingSpeed + "km/h");
    }


}