package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

//Drawer on the right of the site that store Paddles
//Hover to open, and click to open and choose paddles
public class Drawer extends Object {

	private boolean open;
	public double soundTimer;

	public Drawer(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
		open = false;
		soundTimer = 50000;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawMe(Graphics2D g2) {
		if (!open) {

			AffineTransform translate = g2.getTransform();
			g2.translate(xPos, yPos);
			g2.setColor(c);
			g2.fillPolygon(new int[] { 100, 100, -100, -100 }, new int[] { 100, -100, -100, 100 }, 4);
			g2.setColor(new Color(149, 79, 29));
			g2.fillPolygon(new int[] { 100, 75, -125, -100 }, new int[] { -100, -145, -145, -100 }, 4);
			g2.setColor(new Color(139, 69, 19));
			g2.fillPolygon(new int[] { -100, -100, -125, -125 }, new int[] { 100, -100, -145, 45 }, 4);

			g2.setColor(new Color(139, 69, 19));
			g2.drawPolygon(new int[] { 100, 100, -100, -100 }, new int[] { 100, -100, -100, 100 }, 4);
			g2.setColor(new Color(149, 79, 29));
			g2.fillPolygon(new int[] { 100, 75, -125, -100 }, new int[] { -100, -145, -145, -100 }, 4);

			// Door Decoration
			g2.setColor(new Color(119, 59, 9));
			g2.draw(new Rectangle2D.Double(-85, -85, 170, 170));
			g2.drawLine(0, -85, 0, 85);
			g2.fillOval(-20, -5, 10, 10);
			g2.fillOval(20, -5, 10, 10);

			g2.setTransform(translate);

		} else {

			AffineTransform translate = g2.getTransform();
			g2.translate(xPos, yPos);
			g2.setColor(c);
			g2.fillPolygon(new int[] { 100, 100, -100, -100 }, new int[] { 100, -100, -100, 100 }, 4);
			g2.setColor(new Color(149, 79, 29));
			g2.fillPolygon(new int[] { 100, 75, -125, -100 }, new int[] { -100, -145, -145, -100 }, 4);
			g2.setColor(new Color(139, 69, 19));
			g2.fillPolygon(new int[] { -100, -100, -125, -125 }, new int[] { 100, -100, -145, 45 }, 4);

			g2.setColor(new Color(139, 69, 19));
			g2.drawPolygon(new int[] { 100, 100, -100, -100 }, new int[] { 100, -100, -100, 100 }, 4);
			g2.setColor(new Color(149, 79, 29));
			g2.fillPolygon(new int[] { 100, 75, -125, -100 }, new int[] { -100, -145, -145, -100 }, 4);

			// Door Decoration
			g2.setColor(new Color(99, 39, 0));
			g2.fill(new Rectangle2D.Double(-85, -85, 170, 170));
			g2.drawLine(0, -85, 0, 85);
			g2.fillOval(-20, -5, 10, 10);
			g2.fillOval(20, -5, 10, 10);

			g2.setColor(new Color(119, 59, 9));
			g2.fillPolygon(new int[] { -85, -85, -155, -155 }, new int[] { 85, -85, -45, 145 }, 4);
			g2.setColor(new Color(79, 19, 0));
			g2.drawLine(85, 85, 55, 15);
			g2.drawLine(-85, 15, 55, 15);
			g2.drawLine(55, -85, 55, 15);

			g2.setTransform(translate);
		}

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
