package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.AffineTransform;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import InteractableObjects.*;

public class Main extends JPanel implements ActionListener {

	//Properties that controls the game:
	private int screenWidth = 640;
	private int screenHeight = 480;
	private double ballSpeed = 0.2;
	private double paddleSpeed = 0.3;
	
	private JFrame frame;
	
	private Ball ball = new Ball(200, 80, 30, 30, ballSpeed, -ballSpeed, 1, new Color(0, 0, 0));
	private Paddle paddle = new Paddle(screenWidth / 2, screenHeight - 40, 150, 10, 0, 0, 1, new Color(0, 0, 0));
	private Timer timer;
	
	private Boolean leftKeyDown = false;
	private Boolean rightKeyDown = false;
	
	public Main(JFrame frame) {
		super();

		this.frame = frame;
		
//		timer = new Timer(30, this);
//		timer.start();
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		// Key Adaptor
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
		// Mouse Adaptor
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
		
	}
	
	public void GamePlay() {
		//Change Paddle Speed based on keyPresses
		if (leftKeyDown) {
			paddle.setSpeedX(-paddleSpeed);
		} else if (rightKeyDown) {
			paddle.setSpeedX(paddleSpeed);
		} else {
			paddle.setSpeedX(0);
		}
		
		//HitDetection for ball
		//Left and Right
		if (ball.getxPos() > screenWidth - ball.getWidth() / 2|| ball.getxPos() < 0 + ball.getWidth() / 2) {
			ball.setSpeedX(-ball.getSpeedX());		
		}
		//Up
		if (ball.getyPos() < 0 + ball.getHeight() / 2) {
			ball.setSpeedY(-ball.getSpeedY());		
		}
		//HitDetection with Paddle
		if (Math.abs(ball.getxPos() - paddle.getxPos()) < ball.getWidth()/2 + paddle.getWidth()/2) {
			if (Math.abs(ball.getyPos() - paddle.getyPos()) < ball.getHeight()/2 + paddle.getHeight()/2) {
				ball.setSpeedY(-ballSpeed);
			}
		}
		
		ball.move();
		paddle.move();
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Run the  game logics
		GamePlay();
		
		ball.drawMe(g2);
		paddle.drawMe(g2);
		
		super.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyDown = true;
				leftKeyDown = false;
			}

			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyDown = true;
				rightKeyDown = false;
			}

			if (e.getKeyCode() == KeyEvent.VK_UP) {}

			if (e.getKeyCode() == KeyEvent.VK_DOWN)  {}

		}
		
		public void keyReleased(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKeyDown = false;
			}

			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKeyDown = false;
			}

			if (e.getKeyCode() == KeyEvent.VK_UP) {}

			if (e.getKeyCode() == KeyEvent.VK_DOWN)  {}

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
			System.out.println((e.getPoint().x));
			paddle.setxPos(e.getPoint().x);
//			System.out.println("MouseMoved");
		}

	}

}
