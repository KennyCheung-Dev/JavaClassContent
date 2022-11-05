package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;

//Raindrops
public class Rain {

	private int x, y, w, h, s;

	public Rain(int x, int y, int w, int h, int s) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.s = s;
	}

	public void drawRain(Graphics2D g2) {
		g2.setColor(Color.GRAY);
		g2.fillRect(x, y - h / 2, w, h);
	}

	public void move() {
		y += s;
	}

	public int getY() {
		return y;
	}

}
