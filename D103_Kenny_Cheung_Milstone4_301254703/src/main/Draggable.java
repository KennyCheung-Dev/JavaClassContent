package main;

import java.awt.Graphics2D;

//Early-use interface to make object draggable
public interface Draggable {

	public void clicked();

	public void released();

	public void move();

	public void drawMe(Graphics2D g2);

	public void dragged();

	public void setBallIsHeld(boolean b);

}
