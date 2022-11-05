package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//Table class
public class Table extends Object {

	public Table(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
	}

	@Override
	public void drawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.scale(scale, scale);
		g2.translate(xPos, yPos);

		// Table top
		g2.setColor(new Color(50, 130, 100));
		g2.fillPolygon(new int[] { -300, -200, 250, 300 }, new int[] { -100, -200, -200, -100 }, 4);
		g2.fillPolygon(new int[] { -300, -200, 250, 300 }, new int[] { -100, -200, -200, -100 }, 4);
		g2.setColor(Color.WHITE);
		g2.fillRect(-300, -100, 600, 15);

		// White borders
		g2.setColor(Color.WHITE);
		g2.drawPolygon(new int[] { -300, -200, 250, 300 }, new int[] { -100, -200, -200, -100 }, 4);
		g2.drawLine(25, -200, 0, -100);
		g2.drawLine(-250, -150, 275, -150);

		// Net
		g2.setColor(Color.BLUE);
		g2.fillRect(23, -240, 4, 40);
		g2.fillRect(-2, -140, 4, 40);
		g2.drawLine(25, -200, 25, -230);
		g2.setColor(Color.WHITE);
		g2.drawLine(-2, -140, 23, -240);

		// Legs
		g2.setColor(Color.WHITE);
		g2.fillRect(290, -100, 5, 140);
		g2.fillRect(-290, -100, 5, 140);

		// Debugging use
		// g2.drawRect(-300, -240, 600, 280);

		g2.setTransform(translate);

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
