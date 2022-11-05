package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import InteractableObject.*;

public class Main extends JPanel implements ActionListener{
	
	//Variables we can control to tweak the difficulty
	private int screenWidth = 640;
	private int screenHeight = 480;
	private double ballSpeed = 0.2;
	private double paddleSpeed = 0.5;
	
	
	private JFrame frame;
	private boolean rightKeyDown = false;
	private boolean leftKeyDown = false;
	
	//Object
	private Ball ball = new Ball(screenWidth / 2 - 100, 80, ballSpeed, ballSpeed, 30, 30, 1, new Color(0, 0, 0));
	private Platform plat = new Platform(screenWidth / 2, screenHeight - 40, paddleSpeed, 0, 70, 15, 1, new Color(0, 0, 0));
	
	public Main(JFrame frame) {
		this.frame = frame;
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GamePlay(g2);
		ball.drawMe(g2);
		plat.drawMe(g2);
		
		g2.drawLine(0, 0, screenWidth, screenHeight);
	
		super.repaint();
	}
	
	
	private void GamePlay(Graphics2D g2) {
		System.out.println(ball.getxPos() + " " + ball.getyPos());
		System.out.println(plat.getxPos() + " " + plat.getyPos());
		
		if((leftKeyDown && rightKeyDown) || !leftKeyDown && !rightKeyDown){
			plat.setSpeed(0);
		}
		else if(rightKeyDown) {
			plat.setSpeed(paddleSpeed);
		}
		else if(leftKeyDown) {
			plat.setSpeed(-paddleSpeed);
		}
		
		if(ball.getxPos() > screenWidth - ball.getWidth() / 2 || ball.getxPos() < 0 + ball.getWidth()/2) {
			ball.setxSpeed(-ball.getxSpeed());
		}
		
		if(ball.getyPos() < 0 + ball.getWidth() / 2){
			ball.setySpeed(-ball.getySpeed());
		}
		
		if(Math.abs(ball.getxPos() - plat.getxPos()) < ball.getWidth()/2 + plat.getWidth()/2){
			if (Math.abs(ball.getyPos() - plat.getyPos()) < ball.getHeight()/2 + plat.getHeight()/2) {
				
				ball.setySpeed(-ballSpeed);
				//ball.setxSpeed(-ball.getxSpeed());
			}
		}
		
		
		ball.Move();
		plat.Move();
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	public class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyDown = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyDown = true;
			}
		}
	
		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyDown = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyDown = false;
			}
		}
	}
	
}
