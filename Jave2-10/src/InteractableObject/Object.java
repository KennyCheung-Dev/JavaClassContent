package InteractableObject;

import java.awt.Color;

public abstract class Object {
	protected double xPos;
	protected double yPos;
	protected double xSpeed;
	protected double ySpeed;
	protected double width;
	protected double height;
	protected double scale;
	protected  Color c;
	
	public Object(double xPos, double yPos,
				  double xSpeed, double ySpeed,
				  double width, double height,
				  double scale, Color c) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.width = width;
		this.height = height;
		this.scale = scale;
		this.c = c;
	}

	public double getxPos() {
		return xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public double getxSpeed() {
		return xSpeed;
	}
	
	public double getySpeed() {
		return ySpeed;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getScale() {
		return scale;
	}

	public Color getC() {
		return c;
	}
	
}
