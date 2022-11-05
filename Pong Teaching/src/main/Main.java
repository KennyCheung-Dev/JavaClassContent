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

import InteractableObjects.*;

public class Main extends JPanel implements ActionListener{
	
	//Variables we can control to tweak the difficulty
	private int screenWidth = 640;
	private int screenHeight = 480;
	private double ballSpeed = 0.2;
	private double paddleSpeed = 0.3;
	
	private JFrame frame;
	
	private boolean rightKeyDown = false;
	private boolean leftKeyDown = false;
	
	//Objects
	private Ball ball = new Ball(screenWidth/2 - 100, 80, ballSpeed, -ballSpeed, 30, 30, 1, new Color(0, 0, 0));
	private Paddle paddle = new Paddle(screenWidth/2, screenHeight - 40, paddleSpeed, 0, 150, 10, 1, new Color(0, 0, 0));
	
	public Main(JFrame frame) {
		this.frame = frame;
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
	}
	
	public void GamePlay(Graphics2D g) {
		if (leftKeyDown && rightKeyDown || !leftKeyDown && !rightKeyDown) {
			paddle.SetXSpeed(0);
		} else if (leftKeyDown) {
			paddle.SetXSpeed(-paddleSpeed);
		} else if (rightKeyDown) {
			paddle.SetXSpeed(paddleSpeed);
		}
		
		//Hit Detection for ball
		//Left and Right
		if (ball.getxPos() > screenWidth - ball.getWidth()/2 || 
				ball.getxPos() < 0 + ball.getWidth()/2) {
			ball.SetXSpeed(-ball.getxSpeed());
		}
		//Up
		if (ball.getyPos() < 0 + ball.getHeight()/2) {
			ball.SetYSpeed(-ball.getySpeed());
		}
		//HitDetection for Paddle and Ball
		if (Math.abs(ball.getxPos() - paddle.getxPos()) < ball.getWidth()/2 + paddle.getWidth()/2) {
			if (Math.abs(ball.getyPos() - paddle.getyPos()) < ball.getHeight()/2 + paddle.getHeight()/2) {
				ball.SetYSpeed(-ballSpeed);
			}
		}
		
		ball.Move();
		paddle.Move();
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GamePlay(g2);
		
		ball.drawMe(g2);
		paddle.drawMe(g2);
		
		super.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {}
	
	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("KeyPressed");
			
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


