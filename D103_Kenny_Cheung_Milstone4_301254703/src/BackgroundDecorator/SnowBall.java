package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import Fractal.Tree;

//SnowBall class
public class SnowBall {

	private int x, y, w, h, s;
	private Tree tree = new Tree();
	private double rotation = Math.PI / 4.5;

	public SnowBall(int x, int y, int w, int h, int s) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.s = s;
	}

	public void drawSnow(Graphics2D g2) {
		AffineTransform translate = g2.getTransform();
		g2.translate(x, y);
		g2.setColor(Color.WHITE);

		// Using Fractal class Tree to create a snow shape
		// g2.rotate(Math.PI/4.5);
		g2.rotate(rotation);
		tree.branch(g2, 4);
		g2.rotate(Math.PI / 2);
		tree.branch(g2, 4);
		g2.rotate(Math.PI / 2);
		tree.branch(g2, 4);
		g2.rotate(Math.PI / 2);
		tree.branch(g2, 4);
		g2.setTransform(translate);
	}

	public void move() {
		y += s;
		rotation += 0.1;
	}

	public int getY() {
		return y;
	}

}
