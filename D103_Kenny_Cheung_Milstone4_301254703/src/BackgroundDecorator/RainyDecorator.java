package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

import main.PongPanel;
import main.Util;

import static main.PongPanel.*;

//Rainy Decorator,  switched to see the light sky outside of window
public class RainyDecorator extends BasicDecorator {

	public RainyDecorator(Background baseFace) {
		super(baseFace);

	}

	public void showFace(Graphics2D g2) {
		super.showFace(g2);
		addRain(g2);

	}

	private void addRain(Graphics2D g2) {

		int rainTimer = 1;
		rainTimer--;
		if (rainTimer == 0) {
			g2.setColor(Color.GRAY);
			PongPanel.rain.add(new Rain((int) Util.random(0, 1000), (int) Util.random(0, 800), (int) Util.random(1, 3),
					(int) Util.random(4, 9), (int) Util.random(2, 5)));
			rainTimer = 1;

		}

	}

}
