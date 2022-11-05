package InteractableObjects;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Object {
	protected double xPos;
	protected double yPos;
	protected double width;
	protected double height;
	public double speedX;
	public double speedY;
	protected double scale;
	protected Color c; //Optional
	
	public Object(double x, double y, double width, double height, double speedX, double speedY, double scale, Color c) {
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
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

	public double getxPos() {
		return xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setxPos(double x) {
		xPos = x;
	}

	public void setyPos(double y) {
		yPos = y;
	}

	public void setSpeedX(double s) {
		speedX = s;
	}

	public void setSpeedY(double s) {
		speedY = s;
	}
	
	public double getSpeedX() {
		return speedX;
	}

	public double getSpeedY() {
		return speedY;
	}
	
	public double getScale() {
		return scale;
	}

	public Color getColor() {
		return c;
	}

	public double getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public double getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	public abstract void drawMe(Graphics2D g2);
}
