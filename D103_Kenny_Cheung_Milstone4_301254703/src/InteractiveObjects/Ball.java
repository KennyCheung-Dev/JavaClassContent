package InteractiveObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

//import sound.Sound;

//Class for ping pong balls
public class Ball extends Object implements Gravity {

	public boolean hover = true;

	public Ball(double x, double y, double speedX, double speedY, double scale, Color c) {
		super(x, y, speedX, speedY, scale, c);
		width = 10;
		height = 10;
	}

	@Override
	public void drawMe(Graphics2D g2) {
		// Draw simple ping pong balls
		AffineTransform translate = g2.getTransform();
		g2.scale(scale, scale);
		g2.translate(xPos, yPos);
		g2.setColor(c);
		g2.fillOval((int) -width / 2, (int) -height / 2, (int) width, (int) height);

		g2.setTransform(translate);

	}

	// Gravity
	@Override
	public void drop() {
		yPos += speedY;
		speedY += 1.3;
	}

	// Reaction to hitting surface
	@Override
	public void hitGrond() {
		speedY = -speedY * 0.85;
		if (speedY <= -3) {
//			Sound.play("assets/bounce2.wav");
		}

	}

	public void gotHit(Paddle p) {
		speedX -= 0.3;
		speedY -= 0.2;
	}

	@Override
	public boolean getChosen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRotate(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChosen(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
