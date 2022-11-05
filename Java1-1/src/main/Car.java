package main;

public class Car {
	public String engine;
	public int oilAmount = 0;
	
	public Car(String engine, int oilAmount) {
		this.engine = engine;
		this.oilAmount = oilAmount;
	}
	
	public Car() {
		engine = "Default $100 Engine";
		oilAmount = 50;
	}

//	public void Main() {
//		Main15.DestroyCar(this);
//	}
}
