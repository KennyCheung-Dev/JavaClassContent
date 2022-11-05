package DecorationObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//Object that cannot be interactive with
public class Wall {

	private int x, y, w, h;

	public Wall(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;

	}

	public void drawWall(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.setColor(new Color(105, 105, 105));
		g2.fillRect(x - w / 2, y - h / 2, w / 10, h);
		g2.fillRect(x + w / 2 - w / 10, y - h / 2, w / 10, h);
		g2.setColor(new Color(150, 150, 150));
		g2.fillRect(x - w / 2 + w / 10, y - h / 2, w / 5, h);
		g2.fillRect(x + w / 2 - w / 4, y - h / 2, w / 5, h);
		g2.fillRect(x - w / 2 + w / 5, y - h / 2 - h / 7, w / 5 * 3, h / 5);
		g2.fillRect(x - w / 2 + w / 5, y, w / 5 * 3, h);

		g2.setTransform(translate);
	}

}
