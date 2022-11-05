package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

//import sound.Sound;

//The Board on the left of the site
//hover over it will slightly raise its yPos, in order to indicate
//that it can be clicked
//Click on it to open it, and function as a board that block incoming balls
//Click it the second time to close it
public class Board extends Object {

	private boolean open = false;
	private boolean hover = false;

	public Board(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawMe(Graphics2D g2) {
		if (open) {
			// clicked on
			if (!hover) {
				AffineTransform translate = g2.getTransform();
				g2.translate(xPos, yPos);
				g2.setColor(c);

				g2.fillPolygon(new int[] { 60, 60, -60, -60 }, new int[] { 120, -200, -140, 280 }, 4);
				g2.setColor(new Color(50, 50, 50));
				g2.fill(new Rectangle2D.Double(-80, -140, 20, 400));
				g2.setColor(new Color(70, 70, 70));
				g2.fillPolygon(new int[] { -60, 60, 40, -80 }, new int[] { -140, -200, -200, -140 }, 4);

				g2.setTransform(translate);
			} else if (hover) {
				// Raised version
				AffineTransform translate = g2.getTransform();
				g2.translate(xPos, yPos - 30);
				g2.setColor(c);

				g2.fillPolygon(new int[] { 60, 60, -60, -60 }, new int[] { 120, -200, -140, 280 }, 4);
				g2.setColor(new Color(50, 50, 50));
				g2.fill(new Rectangle2D.Double(-80, -140, 20, 420));
				g2.setColor(new Color(70, 70, 70));
				g2.fillPolygon(new int[] { -60, 60, 40, -80 }, new int[] { -140, -200, -200, -140 }, 4);

				g2.setTransform(translate);
			}
		} else {
			// closed
			if (!hover) {
				AffineTransform translate = g2.getTransform();
				g2.translate(xPos, yPos);
				g2.setColor(c);

				g2.fillRect(-100, -300, 100, 400);
				g2.setColor(new Color(50, 50, 50));
				g2.fillPolygon(new int[] { 0, 10, -90, -100 }, new int[] { -300, -310, -310, -300 }, 4);
				g2.fillPolygon(new int[] { 10, 10, 0, 0 }, new int[] { 80, -310, -300, 100 }, 4);

				g2.setTransform(translate);
			} else if (hover) {
				// Raised Version
				AffineTransform translate = g2.getTransform();
				g2.translate(xPos, yPos - 30);
				g2.setColor(c);

				g2.fillRect(-100, -300, 100, 400);
				g2.setColor(new Color(50, 50, 50));
				g2.fillPolygon(new int[] { 0, 10, -90, -100 }, new int[] { -300, -310, -310, -300 }, 4);
				g2.fillPolygon(new int[] { 10, 10, 0, 0 }, new int[] { 80, -310, -300, 100 }, 4);

				g2.setTransform(translate);

				// for future debugging
				// g2.drawRect(-80, -200, 160, 400);
			}
		}

	}

	public void reflect(Ball b) {
		b.setspeedX(-b.speedX * 1.3);
		b.setspeedY(speedY * 1.7);
//		Sound.play("assets/bounce2.wav");
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
