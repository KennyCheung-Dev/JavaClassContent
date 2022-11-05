package Main;
import Animals.*;

public class AnimalCrossing {

	public static void main(String[] args) {
		Bird bird1 = new Bird("Tweety", 2);
		Dolphin dol1 = new Dolphin("Sylvester", 6);
		
		bird1.Speak();
		dol1.Speak();
		
		bird1.Fly();
		dol1.Swim();
	}

}
