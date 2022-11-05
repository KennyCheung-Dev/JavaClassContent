package main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import objects.*;

public class Main extends JPanel implements ActionListener {
	
	//Properties that controls the game:
	private int screenWidth = 640;
	private int screenHeight = 480;
	private double ballSpeed = 0.2;
	private double paddleSpeed = 0.3;
	
	private boolean leftKeyDown = false;
	private boolean rightKeyDown = false;
	
	private Ball ball = new Ball(200, 150, 30, 30, -ballSpeed, -ballSpeed, 1, new Color(0, 0, 0));
	private Paddle paddle = new Paddle(screenWidth / 2, screenHeight - 40, 150, 10, 0, 0, 1, new Color(0, 0, 0));
	
	private boolean gameRunning = true;
	
	//Will Delete
	public int posX = 150;
	
	private JFrame frame;
	
	public Main(JFrame frame) {
		super();
		
		this.frame = frame;
		
		//Setup panel size 
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		//KeyAdapter
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
		//MouseAdapter
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
		
	}
	
	public void GamePlay() {
		//Hit Detection for Ball
		//Left and Right
		if (ball.GetxPos() > screenWidth - ball.GetWidth() / 2 ||
				ball.GetxPos() < 0 + ball.GetWidth() / 2)
			ball.speedX = -ball.speedX;
		//Up
		if (ball.GetyPos() < 0 + ball.GetHeight() / 2)
			ball.speedY = -ball.speedY;
		
		//Bottom
		if (ball.GetyPos() > screenHeight - ball.GetHeight() / 2)
			gameRunning = false;
		
		//Hit Detection for Ball and Paddle
		if (Math.abs(ball.GetxPos() - paddle.GetxPos()) < ball.GetWidth()/2 + paddle.GetWidth()/2) {
			if (Math.abs(ball.GetyPos() - paddle.GetyPos()) < ball.GetHeight()/2 + paddle.GetHeight()/2) {
				ball.speedY = -ballSpeed;
			}
		}
		
		//Change Paddle Speed based on keyPresses
		if (leftKeyDown && rightKeyDown) 
			paddle.speedX = 0;
		else if (leftKeyDown) 
			paddle.speedX = -paddleSpeed;
		else if (rightKeyDown)
			paddle.speedX = paddleSpeed;
		else 
			paddle.speedX = 0;
		
		ball.Move();
		paddle.Move();
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; 
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		ball.DrawMe(g2);
		paddle.DrawMe(g2);
		
		GamePlay();
		
		if (gameRunning)
			super.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public class MyKeyListener extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				rightKeyDown = true;
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				leftKeyDown = true;
		}
		
		
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				rightKeyDown = false;
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				leftKeyDown = false;
		}
	}
	
	public class MyMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	
	public class MyMouseMotionListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {
			paddle.SetxPos(e.getX());
		}
	}
	
}











