package InteractableObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Paddle extends Object implements iMovable {

	public Paddle(double xPos, double yPos, double xSpeed, double ySpeed, double width, double height, double scale,
			Color c) {
		super(xPos, yPos, xSpeed, ySpeed, width, height, scale, c);
	}

	@Override
	public void drawMe(Graphics2D g2) {
		//Storing
		AffineTransform translate =g2.getTransform();
		//Actually moving our coordinate system there
		g2.translate(xPos, yPos);
		
		//Now actually drawing the shapes!
		g2.scale(scale, scale);
		g2.setColor(c);
		g2.fillRect(-((int)width/2), -((int)height/2), (int)width, (int)height);
		
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
}
