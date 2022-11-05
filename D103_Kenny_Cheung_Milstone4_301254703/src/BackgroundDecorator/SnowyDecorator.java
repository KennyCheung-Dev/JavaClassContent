package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.PongPanel;
import main.Util;

import static main.PongPanel.*;

//Snow decorator outside of window
public class SnowyDecorator extends BasicDecorator {

	public SnowyDecorator(Background baseFace) {
		super(baseFace);

	}

	public void showFace(Graphics2D g2) {
		super.showFace(g2);
		addSnow(g2);

	}

	public void addSnow(Graphics2D g2) {
		g2.setColor(Color.WHITE);
		int snowTimer = 1;
		snowTimer--;
		if (snowTimer == 0) {
			g2.setColor(Color.WHITE);
			PongPanel.snow.add(new SnowBall((int) Util.random(0, 1000), (int) Util.random(0, 800),
					(int) Util.random(1, 10), (int) Util.random(0, 10), (int) Util.random(2, 4)));
			snowTimer = 1;

		}

	}

}
