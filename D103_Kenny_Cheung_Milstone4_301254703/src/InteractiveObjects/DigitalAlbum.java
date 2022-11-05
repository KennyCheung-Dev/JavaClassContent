package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//Digital Album on the right, constantly switching photos
public class DigitalAlbum extends Object {

	public DigitalAlbum(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawMe(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();

		g2.translate(xPos, yPos);

		// support
		g2.setColor(Color.BLACK);
		g2.fillPolygon(new int[] { -65, -65, -77, -67 }, new int[] { -45, 30, 30, -45 }, 4);

		// the frame
		g2.setColor(c);
		g2.fillPolygon(new int[] { 60, 60, -60, -60 }, new int[] { 40, -40, -40, 40 }, 4);
		g2.setColor(Color.GRAY);
		g2.fillPolygon(new int[] { -60, -60, -65, -65 }, new int[] { 40, -40, -45, 20 }, 4);
		g2.setColor(new Color(220, 220, 220));
		g2.fillPolygon(new int[] { 60, 55, -65, -60 }, new int[] { -40, -45, -45, -40 }, 4);
		g2.setColor(Color.BLACK);
		// the shadow of the frame
		g2.fillPolygon(new int[] { 50, 50, -50, -50 }, new int[] { 35, -35, -35, 35 }, 4);

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
