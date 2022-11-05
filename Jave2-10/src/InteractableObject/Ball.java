package InteractableObject;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Ball extends Object implements iMovable{

	public Ball(double xPos, double yPos, double xSpeed, double ySpeed, double width, double height, double scale,
			Color c) {
		super(xPos, yPos, xSpeed, ySpeed, width, height, scale, c);
	}
	
	public void drawMe(Graphics2D g2) {
		//Storing
		AffineTransform translate = g2.getTransform();
		//Actually moving our coordinate system there
		g2.translate(xPos, yPos);
		
		//Now actually drawing the shapes
		g2.scale(scale, scale);
		g2.fillOval(0 - ((int)width / 2), 0 - ((int)height / 2), (int)width, (int)height);
		
		
		g2.setTransform(translate);
		
	}

	@Override
	public void Move() {
		xPos += xSpeed;
		yPos += ySpeed;
		
	}
	
	public void setxSpeed(double value){
		xSpeed = value;
	}
	
	public void setySpeed(double value){
		ySpeed = value;
	}
	

}
