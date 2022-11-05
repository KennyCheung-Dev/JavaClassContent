package InteractiveObjects;

import java.awt.*;

//Parent class for general objects
public abstract class Object {

	protected double xPos;
	protected double yPos;
	protected double width;
	protected double height;
	public double speedX;
	public double speedY;
	protected double scale;
	protected Color c;

	public Object(double x, double y, double speedX, double speedY, double scale, Color c) {
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

	public void setspeedX(double s) {
		speedX = s;
	}

	public void setspeedY(double s) {
		speedY = s;
	}

	public abstract void drawMe(Graphics2D g2);

	public abstract boolean getChosen();

	public abstract void setRotate(double d);

	public abstract void setChosen(boolean b);
}
