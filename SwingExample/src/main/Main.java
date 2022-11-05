package main;

import javax.swing.*;

import object.Ball;

import java.awt.*;

public class Main extends JPanel {
	
	private JFrame frame;
	private int screenWidth = 640;
	private int screenHeight = 480;
	
	private Ball ball = new Ball(320, 240, 15, 15, 0.05, 0.05, 1.0, new Color(69, 69, 69));
	
	public Main(JFrame frame) {
		super();
		this.frame = frame;
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		super.paintComponent(g2);
//		g2.drawRect(100, 100, 50, 50);
//		g2.drawArc(100, 200, 100, 200, 30, 70);
//		g2.drawLine(100, 300, 150, 350);
//		
//		g2.setStroke(new BasicStroke(10));
//		g2.setColor(new Color(200, 165, 100));
//		g2.fillRect(100, 400, 50, 50);
//		g2.drawRect(200, 100, 50, 50);
		
		ball.DrawMe(g2);
//		ball.Move();
		super.repaint();
		
	}
}
