package InterfaceExample;

public class Main {
    public static void main(String[] args) {  
          Bird bird = new Bird("Chippy", 2, 20.2);
          ((FlyingObject) bird).fly();
         
          Mosquito mos = new Mosquito("Moss", 1, 6.5);
          ((FlyingObject) mos).fly(); 
          
    }

}
