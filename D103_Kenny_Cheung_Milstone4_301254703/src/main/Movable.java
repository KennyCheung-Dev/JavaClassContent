package main;

import java.awt.*;

//Early-use abstract class for movable objects
public abstract class Movable {

	protected double xPos;
	protected double yPos;
	protected double width;
	protected double height;
	protected double speedX;
	protected double speedY;
	protected double scale;
	protected Color c;

	public Movable(double x, double y, double speedX, double speedY, double scale, Color c) {
		xPos = x;
		yPos = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.scale = scale;
		this.c = c;
	}

	// general move method contain acceleration
	public void move() {
		xPos += speedX;
		yPos += speedY;
	}

	public abstract void drawMe(Graphics2D g2);

}
