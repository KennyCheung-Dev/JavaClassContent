package InteractableObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Star extends Object {

	public Star(double x, double y, double width, double height, double speedX, double speedY, double scale, Color c) {
		super(x, y, width, height, speedX, speedY, scale, c);
	}

	@Override
	public void drawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.scale(scale, scale);
		g2.translate(xPos, yPos);
		g2.setColor(c);
		g2.fillPolygon(new int[]{(int) -width/4, 0, (int)width/4, 0}, new int[]{0, (int)height/2, 0, -(int)height/2}, 4);
		g2.rotate(Math.PI / 2);
		g2.fillPolygon(new int[]{(int) -width/4, 0, (int)width/4, 0}, new int[]{0, (int)height/2, 0, -(int)height/2}, 4);
		g2.setTransform(translate);

	}

}
