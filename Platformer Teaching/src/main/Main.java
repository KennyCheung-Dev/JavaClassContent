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
	private double ballSpeed = 0.5;
	private double gravity = 0.002;
	private int ballConsecutiveJumps = 2;
	private double jumpForce = 0.7;
	
	
	private JFrame frame;
	
	private boolean rightKeyDown = false;
	private boolean leftKeyDown = false;
	
	//Objects
	private Ball ball = new Ball(screenWidth/2 - 100, 80, 0, 0, 30, 30, 1, new Color(0, 0, 0));
	private Platform floor1 = new Platform(screenWidth/2, screenHeight-15, 0, 0, screenWidth, 30, 1, new Color(0, 0, 0));
	
	public Main(JFrame frame) {
		this.frame = frame;
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
	}
	
	public void GamePlay(Graphics2D g) {
		System.out.println(ball.GetJumpsLeft());
		//Gravity for  ball
		ball.SetYSpeed(ball.getySpeed() + gravity);
		
		if (leftKeyDown && rightKeyDown || !leftKeyDown && !rightKeyDown) {
			ball.SetXSpeed(0);
		} else if (leftKeyDown) {
			ball.SetXSpeed(-ballSpeed);
		} else if (rightKeyDown) {
			ball.SetXSpeed(ballSpeed);
		}
		
		//Hit Detection for ball
		//Left and Right
		if (ball.getxPos() > screenWidth - ball.getWidth()/2) {
			ball.SetXPos(screenWidth - ball.getWidth()/2);
		} else if (ball.getxPos() < 0 + ball.getWidth()/2) {
			ball.SetXPos(0 + ball.getWidth()/2);
		}

		//HitDetection for platforms
		if (Math.abs(ball.getxPos() - floor1.getxPos()) < ball.getWidth()/2 + floor1.getWidth()/2) {
			if (Math.abs(ball.getyPos() - floor1.getyPos()) < ball.getHeight()/2 + floor1.getHeight()/2) {
				if (ball.getySpeed() > 0) {
					ball.SetJumpsLeft(ballConsecutiveJumps);
					ball.SetYSpeed(0);
				}
			}
		}
		
		ball.Move();
	}
	
	public void BallJump() {
		if (ball.GetJumpsLeft() > 0) {
			ball.SetYSpeed(-jumpForce);
			ball.SetJumpsLeft(ball.GetJumpsLeft() - 1);
		}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GamePlay(g2);
		
		ball.drawMe(g2);
		floor1.drawMe(g2);
		super.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {}
	
	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyDown = true;
			}
			
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyDown = true;
			}
			
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				BallJump();
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


