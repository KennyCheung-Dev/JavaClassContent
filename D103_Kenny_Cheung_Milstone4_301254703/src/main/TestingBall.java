package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//Testing ball class for early-use testing gravity engine
public class TestingBall extends Movable implements Draggable {

	private int width;
	private int height;
	public boolean ballIsHeld;

	public TestingBall(double x, double y, double sX, double sY, double scale, Color c) {
		super(x, y, sX, sY, scale, c);
		width = 50;
		height = 50;
		ballIsHeld = false;
	}

	@Override
	public void drawMe(Graphics2D g2) {
		AffineTransform trans = g2.getTransform();
		g2.setColor(new Color(255, 100, 0, 100));
		if (!ballIsHeld) {
			g2.translate(xPos, yPos);
		} else {
			g2.translate(PongPanel.mouseX, PongPanel.mouseY);
		}
		g2.fillOval(-width / 2, -height / 2, width, height);
		g2.setTransform(trans);

	}

	@Override
	public void setBallIsHeld(boolean b) {
		ballIsHeld = b;
	}

	public boolean getBallIsHeld() {
		return ballIsHeld;
	}

	@Override
	public void clicked() {
		// TODO Auto-generated method stub
		if ((Util.dist(PongPanel.mouseX, PongPanel.mouseY, xPos, yPos)) < width / 2) {
			System.out.println("WOW");
			// xPos = PongPanel.mouseX;
			// yPos = PongPanel.mouseY;
			// speedX = 0;
			// speedY = 0;
			ballIsHeld = true;
		}
	}

	public void dragged() {

	}

	@Override
	public void released() {
		// TODO Auto-generated method stub

	}

}
