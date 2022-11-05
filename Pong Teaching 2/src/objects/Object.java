package objects;

import java.awt.Color;

public abstract class Object {
	public double GetWidth() {
		return width;
	}

	public void SetWidth(double width) {
		this.width = width;
	}

	public double GetHeight() {
		return height;
	}

	public void SetHeight(double height) {
		this.height = height;
	}

	public double GetxPos() {
		return xPos;
	}

	public void SetxPos(double xPos) {
		this.xPos = xPos;
	}

	public double GetyPos() {
		return yPos;
	}

	public void SetyPos(double yPos) {
		this.yPos = yPos;
	}

	protected double xPos;
	protected double yPos;
	protected double width;
	protected double height;
	public double speedX;
	public double speedY;
	protected double scale;
	protected Color c;
	
	public Object(double xPos, double yPos, double width, double height, double speedX, double speedY, double scale,
			Color c) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.speedX = speedX;
		this.speedY = speedY;
		this.scale = scale;
		this.c = c;
	}
	
	
}
