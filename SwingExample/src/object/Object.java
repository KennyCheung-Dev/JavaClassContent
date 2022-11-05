package object;

import java.awt.Color;

public class Object {
	protected double posX;
	protected double posY;
	protected double width;
	protected double height;
	protected double speedX;
	protected double speedY;
	protected double scale;
	protected Color c;
	
	public Object(double posX, double posY, double width, double height, double speedX, double speedY, double scale,
			Color c) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.speedX = speedX;
		this.speedY = speedY;
		this.scale = scale;
		this.c = c;
	} 
	
	
}
