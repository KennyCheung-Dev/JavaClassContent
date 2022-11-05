package objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import Interface.Movable;

public class Paddle extends Object implements Movable {

	public Paddle(double xPos, double yPos, double width, double height, double speedX, double speedY, double scale,
			Color c) {
		super(xPos, yPos, width, height, speedX, speedY, scale, c);
	}
	
	public void DrawMe(Graphics2D g2) {
		//Draw simple pong paddle
		AffineTransform translate = g2.getTransform();
		g2.translate(xPos, yPos);
		
		//Draw
		g2.scale(scale, scale);
		g2.setColor(c);
		
		g2.fillRect((int) -width / 2, (int) -height / 2, (int) width, (int) height);
		
		g2.setTransform(translate);
	}

	@Override
	public void Move() {
		this.xPos += speedX;
		this.yPos += speedY;
	}

}
