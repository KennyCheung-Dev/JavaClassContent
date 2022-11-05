package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import static main.PongPanel.*;

public class NightDecorator extends BasicDecorator {

	public NightDecorator(Background baseFace) {
		super(baseFace);

	}

	public void showFace(Graphics2D g2) {
		super.showFace(g2);
		nightTime(g2);
	}

	private void nightTime(Graphics2D g2) {
		//draw the night sky with clouds and moon
		g2.setColor(new Color(10, 20, 255));
		g2.fillRect(0, 0, 1000, 800);

		g2.setColor(new Color(255, 215, 0));
		g2.fillOval(370, 90, 70, 40);
		g2.fillOval(410, 100, 70, 40);
		g2.fillOval(380, 100, 70, 40);
		g2.fillOval(400, 110, 70, 40);

		g2.fillOval(600, 130, 70, 40);
		g2.fillOval(570, 150, 70, 40);
		g2.fillOval(610, 140, 70, 40);
		g2.fillOval(560, 130, 70, 40);

		g2.setColor(new Color(255, 255, 0));
		g2.fillOval(700, 50, 50, 50);
		g2.setColor(new Color(10, 20, 255));
		g2.fillOval(680, 50, 50, 50);

	}

}
