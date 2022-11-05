package InteractableObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Ball extends Object implements iMovable{

	private int jumpsLeft = 2;
	
	public Ball(double xPos, double yPos, double xSpeed, double ySpeed, double width, double height, double scale,
			Color c) {
		super(xPos, yPos, xSpeed, ySpeed, width, height, scale, c);
	}
	
	public void drawMe(Graphics2D g2) {
		//Storing
		AffineTransform translate =g2.getTransform();
		//Actually moving our coordinate system there
		g2.translate(xPos, yPos);
		
		//Now actually drawing the shapes!
		g2.scale(scale, scale);
		g2.setColor(c);
		g2.fillOval(-((int)width/2), -((int)height/2), (int)width, (int)height);
		
		//Restoring
		g2.setTransform(translate);
	}

	@Override
	public void Move() {
		xPos += xSpeed;
		yPos += ySpeed;
	}
	
	public void SetXSpeed(double value) {
		xSpeed = value;
	}
	
	public void SetYSpeed(double value) {
		ySpeed = value;
	}
	
	public void SetXPos(double value) {
		xPos = value;
	}
	
	public void SetJumpsLeft(int value) {
		jumpsLeft = value;
	}
	
	public int GetJumpsLeft() {
		return jumpsLeft;
	}
}
