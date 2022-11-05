package BackgroundDecorator;

import java.awt.Color;
import java.awt.Graphics2D;

public class BasicDecorator implements Background {

	protected Background baseFace;

	public BasicDecorator(Background baseFace) {
		this.baseFace = baseFace;
	}

	@Override
	public void showFace(Graphics2D g2) {
		baseFace.showFace(g2);

	}

}
