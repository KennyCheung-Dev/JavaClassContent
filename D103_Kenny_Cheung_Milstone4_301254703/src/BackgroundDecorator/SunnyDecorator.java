package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import static main.PongPanel.*;

//Sunny Day decorator,  the default outside view
public class SunnyDecorator implements Background {

	@Override
	public void showFace(Graphics2D g2) {
		AffineTransform tt = g2.getTransform();
		g2.setColor(new Color(135, 206, 255));
		g2.fillRect(0, 0, 1000, 800);
		g2.setColor(Color.WHITE);

		g2.fillOval(370, 90, 70, 40);
		g2.fillOval(410, 100, 70, 40);
		g2.fillOval(380, 100, 70, 40);
		g2.fillOval(400, 110, 70, 40);

		g2.fillOval(600, 130, 70, 40);
		g2.fillOval(570, 150, 70, 40);
		g2.fillOval(610, 140, 70, 40);
		g2.fillOval(560, 130, 70, 40);
		g2.setTransform(tt);
	}

}
