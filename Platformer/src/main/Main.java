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
	private double ballSpeed = 0.5;
	private double paddleSpeed = 0.3;
	private double gravity  = 0.002;
	private double jumpForce = 0.7;
	private int ballConsecutiveJumps = 2;
	
	private JFrame frame;
	
	private Ball ball = new Ball(200, 435, 30, 30, 0, 0, 1, new Color(0, 0, 0));
	
	private InteractableObjects.Object[][] levels;
	private InteractableObjects.Object[] currentLevel;
	private int currentLevelIndex = 0;
	
	private Timer timer;
	
	private Boolean leftKeyDown = false;
	private Boolean rightKeyDown = false;
	
	public Main(JFrame frame) {
		super();

		this.frame = frame;
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255, 255, 255));
		
		levels = new InteractableObjects.Object[2][4];
		
		levels[0][0] = new Star(500, 100, 30, 30, 0, 0, 1, new Color(255, 165, 0));
		levels[0][1] = new Platform(200, 300, 200, 15, 0, 0, 1, new Color(0, 0, 0));
		levels[0][2] = new Platform(300, 400, 200, 15, 0, 0, 1, new Color(0, 0, 0));
		levels[0][3] = new Platform(screenWidth/2, screenHeight-15, screenWidth, 30, 0, 0, 1, new Color(0, 0, 0));
		
		levels[1][0] = new Platform(500, 300, 200, 15, 0, 0, 1, new Color(0, 0, 0));
		levels[1][1] = new Platform(200, 300, 200, 15, 0, 0, 1, new Color(0, 0, 0));
		levels[1][2] = new Platform(300, 400, 200, 15, 0, 0, 1, new Color(0, 0, 0));
		levels[1][3] = new Platform(screenWidth/2, screenHeight-15, screenWidth, 30, 0, 0, 1, new Color(0, 0, 0));
		
		currentLevel = levels[currentLevelIndex];
		
		// Key Adaptor
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
		// Mouse Adaptor
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());
		
	}
	
	public void GamePlay() {
		
		//Gravity for ball
		ball.setSpeedY(ball.getSpeedY() + gravity);
		
		//Change Paddle Speed based on keyPresses
		if (leftKeyDown) {
			ball.setSpeedX(-ballSpeed);
		} else if (rightKeyDown) {
			ball.setSpeedX(ballSpeed);
		} else {
			ball.setSpeedX(0);
		}
		
		//HitDetection for ball
		//Left and Right
		if (ball.getxPos() > screenWidth - ball.getWidth() / 2) { 
			ball.setxPos((screenWidth - ball.getWidth()/2));	
		}
		else if (ball.getxPos() < 0 + ball.getWidth() / 2) {
			ball.setxPos(0 + ball.getWidth() / 2);	
		}
		
		//HitDetection with Platform
		for (InteractableObjects.Object p : currentLevel) {
			if (p.getClass() == InteractableObjects.Platform.class) {
				if (Math.abs(ball.getxPos() - p.getxPos()) < ball.getWidth()/2 + p.getWidth()/2) {
					if (Math.abs(ball.getyPos() - p.getyPos()) < ball.getHeight()/2 + p.getHeight()/2) {
						if (ball.getSpeedY() > 0 && p.getyPos() - ball.getyPos() > 10) {
							ball.setSpeedY(0);
							ball.SetJumpsLeft(ballConsecutiveJumps);
						}
					}
				}
			}
		}
		
		//HitDetection with Stars
		for (InteractableObjects.Object p : currentLevel) {
			if (p.getClass() == InteractableObjects.Star.class) {
				if (Math.abs(ball.getxPos() - p.getxPos()) < ball.getWidth()/2 + p.getWidth()/2) {
					for (InteractableObjects.Object item : currentLevel) {
						NextLevel();
					}
				}
			}
		}
		
		ball.move();
	}
	
	public void BallJump() {
		if (ball.GetJumpsLeft() > 0) {
			ball.setSpeedY(-jumpForce);
			ball.SetJumpsLeft(ball.GetJumpsLeft() - 1);
		}
	}
	
	public void NextLevel() {
		if (currentLevelIndex < levels.length - 1) {
			currentLevelIndex++;
			currentLevel = levels[currentLevelIndex];
		}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Run the  game logics
		GamePlay();
		
		ball.drawMe(g2);
		for (InteractableObjects.Object p : currentLevel) {
			p.drawMe(g2);
		}
		
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

			if (e.getKeyCode() == KeyEvent.VK_UP) {
				BallJump();
			}

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
//			System.out.println("MouseMoved");
		}

	}

}
