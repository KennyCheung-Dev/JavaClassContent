package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//Class for paddles,
public class Paddle extends Object {

	private boolean chosen;
	private double rotation;

	public Paddle(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
	}

	@Override
	public void drawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.translate(xPos, yPos);
		g2.rotate(rotation);
		// paddles main surface
		g2.setColor(c);
		g2.fillOval(-35, -30, 70, 80);
		// paddles handdle
		g2.setColor(new Color(205, 133, 63));
		g2.fillRect(-8, -50, 16, 33);
		g2.setColor(new Color(185, 113, 43));
		g2.drawRect(-8, -50, 16, 33);
		g2.setTransform(translate);

		// Debugging use:
		// g2.drawRect(-35, -50, 70, 100);
	}

	public boolean getChosen() {
		return chosen;
	}

	public void setChosen(boolean b) {
		chosen = b;
	}

	public void setRotate(double a) {
		rotation = a;
	}

}
