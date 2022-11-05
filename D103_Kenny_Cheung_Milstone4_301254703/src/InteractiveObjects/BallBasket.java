package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

import main.Util;

//The ball pool on the ground
public class BallBasket extends Object {

	private boolean hover = false;
	private boolean open = true;

	public BallBasket(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.translate(xPos, yPos);

		if (!hover) {
			g2.setColor(c);
		} else if (hover) {
			g2.setColor(new Color((int) Util.random(170, 220), (int) Util.random(70, 90), (int) Util.random(30, 40)));
		}
		g2.fillOval(-20, -22, 10, 10);
		g2.fillOval(0, -26, 10, 10);
		g2.fillOval(-10, -29, 10, 10);
		g2.fillOval(10, -23, 10, 10);
		g2.fillOval(20, -25, 10, 10);
		g2.fillOval(30, -20, 10, 10);

		g2.fillOval(10, -1, 10, 10);
		g2.fillOval(0, -6, 10, 10);
		g2.fillOval(-10, -2, 10, 10);
		g2.fillOval(-5, -9, 10, 10);
		g2.fillOval(-15, -5, 10, 10);
		g2.fillOval(15, -3, 10, 10);
		g2.fillOval(20, -8, 10, 10);

		g2.fillOval(10, -11, 10, 10);
		g2.fillOval(0, -15, 10, 10);
		g2.fillOval(-10, -16, 10, 10);
		g2.fillOval(-5, -12, 10, 10);
		g2.fillOval(-15, -18, 10, 10);
		g2.fillOval(15, -14, 10, 10);
		g2.fillOval(20, -11, 10, 10);

		// future dubugging use
		// g2.setColor(new Color(100, 100, 100, 100));
		// g2.fillRect(-80, -40, 160, 80);

		g2.setTransform(translate);

	}

	public void reflect(Ball b) {
		b.setspeedX(-b.speedX);
	}

	public void setHover(boolean b) {
		hover = b;
	}

	public boolean getOpen() {
		return open;
	}

	public void setOpen(boolean b) {
		open = b;
	}

	@Override
	public boolean getChosen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRotate(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChosen(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
