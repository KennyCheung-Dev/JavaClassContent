package Fractal;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.*;

//Fractal is used to create Snow in BackgroundDecorator package - SnowBall class
public class Tree {

	public void branch(Graphics2D g2, float len) {
		g2.setStroke(new BasicStroke(2));

		g2.draw(new Line2D.Float(0, 0, 0, -len));

		g2.translate(0, -len);

		len *= 0.66;

		// Left side
		if (len > 2) {
			AffineTransform at = g2.getTransform();
			g2.rotate(Math.PI / 5);
			branch(g2, len);
			g2.setTransform(at);

			// Right side
			at = g2.getTransform();
			g2.rotate(-Math.PI / 5);
			branch(g2, len);
			g2.setTransform(at);
		}
	}

}
