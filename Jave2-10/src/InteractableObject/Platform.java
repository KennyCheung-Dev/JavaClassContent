package InteractableObject;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Platform extends Object implements iMovable{

	public Platform(double xPos, double yPos, double xSpeed, double ySpeed, double width, double height, double scale,
			Color c) {
		super(xPos, yPos, xSpeed, ySpeed, width, height, scale, c);
		
	}
	
	public void drawMe(Graphics2D h2) {
		//Storing
		AffineTransform translate = h2.getTransform();
		//Actually moving our coordinate system there
		h2.translate(xPos, yPos);
		
		//Now actually drawing the shapes
		h2.scale(scale, scale);
		
		//This line won't work, as we already translated our coordinate system to
		//(xPos, yPos). Adding xPos and  yPos on top of it is displacing it 
		//Further down to the right bottom corner
		//All the problem comes from this one line, such as the problem with 
		//right boundary detection  for  ball. Now that we don't have to 
		//accomodate the full screen of the game, we can  set it back to 
		//bounce  at screenWidth (640) and it'll work. 
//		h2.drawRect((int)xPos, (int)yPos, (int)width, (int)height);
		h2.drawRect(0 - ((int)width/2),  0 - ((int)height/2), (int)width, (int)height);
		
		h2.setTransform(translate);
		
	}
	
	@Override
	public void Move() {
		xPos += xSpeed;
		yPos += ySpeed;
	}
	
	public void setSpeed(double value){
		xSpeed = value;
	}

}
