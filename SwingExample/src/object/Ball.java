package object;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Ball extends Object {

	public Ball(double posX, double posY, double width, double height, double speedX, double speedY, double scale,
			Color c) {
		super(posX, posY, width, height, speedX, speedY, scale, c);
	}

	public void DrawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.translate(posX, posY);
		
		g2.scale(scale, scale);
		g2.setColor(c);
		g2.fillOval((int)0, (int)0, (int)width, (int)height);
		
		g2.setTransform(translate);
		
		scale+=0.001;
	}
	
	public void Move() {
		this.posX += speedX;
		this.posY += speedY;
	}
}
