package InteractableObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import Interface.Movable;

public class Ball extends Object implements Movable {

	public Ball(double x, double y, double width, double height, double speedX, double speedY, double scale, Color c) {
		super(x, y, width, height, speedX, speedY, scale, c);
	}

	@Override
	public void drawMe(Graphics2D g2) {
		// Draw simple Pong balls
		AffineTransform translate = g2.getTransform();
		g2.scale(scale, scale);
		g2.translate(xPos, yPos);
		g2.setColor(c);
		g2.fillOval((int) -width / 2, (int) -height / 2, (int) width, (int) height);
		g2.setTransform(translate);
	}

	@Override
	public void move() {
		this.xPos += speedX;
		this.yPos += speedY;
	}

	

}
