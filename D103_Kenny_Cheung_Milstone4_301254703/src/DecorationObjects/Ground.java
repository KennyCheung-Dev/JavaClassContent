package DecorationObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//Object that cannot be interact with  Ground
public class Ground {
	private int x, y, w, h;

	public Ground(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;

	}

	public void drawGround(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.setColor(Color.GRAY);
		g2.fillPolygon(new int[] { 000, 100, 950, 1000 }, new int[] { 800, 600, 600, 800 }, 4);
		g2.setTransform(translate);
	}

}
