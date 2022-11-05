package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import main.PongPanel;

//All the text datas
public class Text {
	private Font headFont;
	private Font overFont;
	private Font bodyText;
	private Font iconFont;

	private int instruction = 1;

	public Text(int serves) {
		bodyText = new Font("Arial", Font.BOLD, 20);
		headFont = new Font("Arial", Font.BOLD, 31);
		overFont = new Font("Arial", Font.BOLD, 60);
		iconFont = new Font("Arial", Font.BOLD, 80);

	}

	public void startScreen(Graphics2D g2) {
		g2.setColor(Color.WHITE);
		g2.setFont(iconFont);
		g2.drawString("ping pong", 110, 350);
		g2.setFont(bodyText);
		g2.drawString("serving simulator", 330, 390);
	}

	// heads up display
	public void headsUpDisplay(Graphics2D g2, int serves) {
		g2.setColor(Color.WHITE);
		g2.setFont(headFont);
		g2.drawString("Serves Attempt: " + serves, 20, 70);
		g2.drawString("", 100, 200);

		// instructions:
		g2.setColor(Color.WHITE);
		g2.setFont(headFont.deriveFont(Font.PLAIN, 17));
		if (instruction == 1) {
			g2.drawString("Please choose a paddle from the drawer", 690, 760);
		} else if (instruction == 2) {
			g2.drawString("Please click on the pool of balls to toss a ball", 275, 660);
		} else if (instruction == 3) {
			g2.drawString("Please move your paddle to hit the ball", 240, 740);
		}

		// draw words on paddles when choosing
		if (PongPanel.paddlesChoosing) {
			g2.drawString("intermedia", 260, 370);
			g2.drawString("weak", 480, 370);
			g2.drawString("strong", 675, 370);
		}

	}

	public void setInstruction(int i) {
		instruction = i;
	}

	// game over screen
	public void gameOver(Graphics2D g2) {

		g2.setFont(overFont);
		g2.setColor(Color.BLACK);
		g2.drawString("break time", PongPanel.RoomW / 6, 320);

		g2.setFont(overFont.deriveFont(Font.PLAIN, 20));
		g2.drawString("Total Serves Attempt: " + PongPanel.serves, PongPanel.RoomW - 370, 320);

	}

}