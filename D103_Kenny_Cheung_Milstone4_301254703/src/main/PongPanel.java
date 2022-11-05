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
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import BackgroundDecorator.*;
import DecorationObjects.*;
//import sound.Sound;

import InteractiveObjects.*;
import InteractiveObjects.Object;
//import sun.audio.*;
import GUI.*;
import static main.ImageLoader.*;

public class PongPanel extends JPanel implements ActionListener, java.applet.AudioClip {
	// Basic timer
	private Timer timer;

	// boolean for showing snow
	public static boolean showSnow = false;
	// boolean to classify if holding paddle
	public boolean havePaddle = false;
	// boolean to classify if ball is touching the paddle
	public boolean touch = false;
	// booleans to classify what colour of paddle user has
	public boolean red = false;
	public boolean black = false;
	public boolean wood = false;
	// boolean to skip instruction
	public boolean doneInstruction2 = false;
	public boolean doneInstruction1 = false;
	// boolean to classify when choosing paddles
	public static boolean paddlesChoosing = false;

	// Text instance
	private Text txt;
	// Variable to count serves attempts
	public static int serves = 0;
	// Set Game states
	private int state = -1;
	// for day and night time
	public int time = 1;
	// for updating the ball and paddle
	public int touchTimer;
	public int snowTimer = 4;
	// timer for ball and paddle interaction - playing the sound
	public int paddleBallTimer = 50;
	// images for digital album, 3 of them looping using animation mechanic
	private int indexAthlete = 0;
	private BufferedImage[] athletes = new BufferedImage[3];
	private int indexTimer = 150;
	// Mouse locations
	public static int mouseX = 500;
	public static int mouseY = 400;
	// Room location
	public static int RoomX = 0;
	public static int RoomY = 0;
	public static int RoomW = 1000;
	public static int RoomH = 800;
	public Background background;

	// normal image
	private BufferedImage start = loadImage("assets/background.jpg");
	private BufferedImage end = loadImage("assets/end.jpg");

	// fields for replay
	private boolean replay = false;
	private JFrame frame;

	// JButton:
	JButton playButton;
	JButton replayButton;
	JButton closeWindow;
	JButton sunnyDay;
	JButton nightTime;
	JButton rainyDecor;
	JButton snowyDecor;
	JButton endPractice;

	// public static boolean hover = true;
	public static ArrayList<SnowBall> snow = new ArrayList<SnowBall>();
	public static ArrayList<Rain> rain = new ArrayList<Rain>();
	public ArrayList<Ball> balls = new ArrayList<Ball>();
	public ArrayList<Object> paddles = new ArrayList<Object>();

	// Stationary objects:
	public Wall wall = new Wall(500, 400, 1000, 800);
	public Ground ground = new Ground(0, 0, 0, 0);

	// Interactive Objects
	public Drawer drawer = new Drawer(875, 600, 0, 0, 1, new Color(160, 82, 45));
	public Board board = new Board(225, 540, 0, 0, 1, new Color(90, 90, 90));
	public Table table = new Table(500, 700, 0, 0, 1, new Color(190, 190, 190));
	public BallBasket basket = new BallBasket(640, 660, 0, 0, 1, new Color(205, 144, 50));
	public DigitalAlbum album = new DigitalAlbum(870, 440, 0, 0, 1, new Color(255, 255, 255));

	public PongPanel(JFrame frame) {
		super();

		// pass in frame for convenience, to destroy and rebuild the frame
		this.frame = frame;
		this.setPreferredSize(new Dimension(1000, 800));
		this.setBackground(new Color(100, 100, 100));
		timer = new Timer(30, this);
		timer.start();

		// load image for the digital album
		for (int i = 0; i < 3; i++) {
			athletes[i] = loadImage("assets/athlete" + i + ".jpg");
		}

		// // toss in Balls for testing
		// for (int i = 0; i < 10; i++) {
		// balls.add(new Ball(600, 300, (int) Util.random(-5, 5), 0, 1, new
		// Color(255, 165, 0)));
		// }

		// JButton for starting and ending the game
		playButton = new JButton("Start");
		// this.add(playButton, BorderLayout.NORTH);
		this.add(playButton, BorderLayout.EAST);
		playButton.setVisible(false);
		playButton.addActionListener(this);

		endPractice = new JButton("End Practice");
		add(endPractice);
		endPractice.addActionListener(this);
		this.add(endPractice, BorderLayout.EAST);

		replayButton = new JButton("Restart");
		add(replayButton);
		replayButton.addActionListener(this);
		this.add(replayButton, BorderLayout.EAST);
		replayButton.setVisible(false);

		// JButtons to change the background
		closeWindow = new JButton("Close Window");
		add(closeWindow);
		closeWindow.addActionListener(this);
		closeWindow.setVisible(false);

		sunnyDay = new JButton("Sunny Day");
		add(sunnyDay);
		sunnyDay.addActionListener(this);
		sunnyDay.setVisible(false);

		nightTime = new JButton("Night Time");
		add(nightTime);
		nightTime.addActionListener(this);
		nightTime.setVisible(false);

		rainyDecor = new JButton("Add Rain");
		add(rainyDecor);
		rainyDecor.addActionListener(this);
		rainyDecor.setVisible(false);

		snowyDecor = new JButton("Add Snow");
		add(snowyDecor);
		snowyDecor.addActionListener(this);
		snowyDecor.setVisible(false);

		// Texts
		txt = new Text(serves);

		// Key Adaptor
		MyKeyListener mkl = new MyKeyListener();
		this.addKeyListener(mkl);
		this.setFocusable(true);
		// Mouse Adaptor
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());

	}

	public void playGame(Graphics2D g2) {
		try {
			drawBackground(g2);
			if (background != null)
				background.showFace(g2);

			// draw the snowws
			for (int i = 0; i < snow.size(); i++) {
				snow.get(i).drawSnow(g2);
			}
			// draw the rain
			for (int i = 0; i < rain.size(); i++) {
				rain.get(i).drawRain(g2);
			}

			// drawStationary Objects:
			wall.drawWall(g2);
			ground.drawGround(g2);

			// drawInteractive Objects:
			basket.drawMe(g2);
			drawer.drawMe(g2);
			board.drawMe(g2);
			table.drawMe(g2);
			album.drawMe(g2);

			// draw The athlete album
			g2.drawImage(athletes[indexAthlete], 821, 406, 95, 65, this);
			// update the digital album
			if (indexTimer <= 0) {
				indexAthlete++;
				indexTimer = 150;
			}
			indexAthlete %= 3; // make index within length
			indexTimer--;

			// Draw the ping pong balls
			for (int i = 0; i < balls.size(); i++) {
				balls.get(i).drawMe(g2);
			}

			// Draw the paddles
			for (int i = 0; i < paddles.size(); i++) {
				paddles.get(i).drawMe(g2);
			}

			// Draw head display telling user about their serves attempts
			txt.headsUpDisplay(g2, serves);
		} catch (NullPointerException e) {
			System.out.println("null pointer exception!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("some arraylist is out of bound!");
		}
	}

	public void paintComponent(Graphics g) {
		System.out.println("painting");
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		super.paintComponent(g2);

		// state 0 = playing the game
		if (state == 0) {
			super.paintComponent(g);
			g2.setColor(new Color(0, 200, 0));
			g2.fill(new Rectangle2D.Double(RoomX, RoomY, RoomW, RoomH));
			playGame(g2);

			playButton.setVisible(false);
			closeWindow.setVisible(true);
			sunnyDay.setVisible(true);
			nightTime.setVisible(true);
			rainyDecor.setVisible(true);
			snowyDecor.setVisible(true);

		} else if (state == 1) {
			// state = 1 does nothing
		} else {
			// state != 1 or 0
			g2.drawImage(start, 0, 0, 1000, 800, this);
			txt.startScreen(g2);
			playButton.setVisible(true);
		}

		if (state == 2) {
			super.paintComponent(g2);
			// display GameOver screen
			g2.drawImage(end, 0, 0, 1000, 800, this);
			txt.gameOver(g2);
			// stop timer and enable restart button
			timer.stop();
			balls.clear();
			replay = true;

			playButton.setVisible(false);
			endPractice.setVisible(false);
			closeWindow.setVisible(false);
			sunnyDay.setVisible(false);
			nightTime.setVisible(false);
			rainyDecor.setVisible(false);
			snowyDecor.setVisible(false);
		}
	}

	public void drawBackground(Graphics2D g2) {
		AffineTransform background = g2.getTransform();
		g2.setColor(new Color(100, 39, 0));
		g2.fillRect(0, 0, 1000, 800);
		g2.setColor(new Color(139, 69, 19));
		g2.fillRect(520, 0, 20, 800);
		g2.fillRect(0, 200, 1000, 20);
		g2.setColor(Color.WHITE);
		g2.drawLine(525, 0, 525, 800);
		g2.drawLine(0, 205, 520, 205);
		g2.drawLine(540, 205, 1000, 205);
		g2.setTransform(background);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// When playButton is pressed, simulation starts
		if (e.getActionCommand() == "Start") {
			state = 0;
		}

		// Button to end practice
		if (e.getActionCommand() == "End Practice") {
			state = 2;
			endPractice.setVisible(false);
			replayButton.setVisible(true);
		}

		// when replay is true terminate the current window and start a new one
		if (replay) {
			balls.clear();
			frame.dispose();
			frame = new PongApp("New Practise");
			replay = false;
		}

		// After 20 serves attempt, replay button appear
		if (endPractice != null) {
			if (serves <= 20) {
				endPractice.setVisible(false);
			} else if (serves >= 20) {
				endPractice.setVisible(true);
			}
		}

		// If replayButton is pressed, replay the simulator
		if (e.getActionCommand() == "Restart") {
			replay = true;
			replayButton.setVisible(false);
		}

		// Weather changes through button
		if (e.getActionCommand() == "Close Window") {
			background = null;
			time = 1;
		}

		if (e.getActionCommand() == "Sunny Day") {
			background = new SunnyDecorator();
			time = 1;
		}

		if (e.getActionCommand() == "Night Time") {
			Background baseFace = new SunnyDecorator();
			background = new NightDecorator(baseFace);
			time = 2;
		}

		// update the Balls
		for (int i = 0; i < balls.size(); i++) {
			Ball ballz = balls.get(i);
			ballz.drop();
			ballz.move();

			// setting up the table height
			int tableTopHeight = 500;

			// ball return when it go lower than the ground
			if (ballz.getyPos() >= 750) {
				ballz.hitGrond();
			}

			// if ball is on top of the desk area, and it hits the table top
			// height, return
			if (ballz.getyPos() >= tableTopHeight && ballz.hover == true) {
				ballz.hitGrond();
			}

			// booleans to classify if ball is on top of the table
			if (ballz.getxPos() < 285 || ballz.getxPos() > 765) {
				ballz.hover = false;
			} else if (ballz.getxPos() > 285 || ballz.getxPos() < 765 && ballz.getyPos() < 530) {
				ballz.hover = true;
			}

			// if not hover, or if the ball is under the table, gravity would
			// still apply to the ball
			if (!ballz.hover) {
				ballz.speedY += 0.85;
			}
			if (ballz.hover && ballz.getyPos() > 530) {
				ballz.speedY += 0.85;
			}

			// remove balls when they go out of bound
			if (ballz.getxPos() > 1000 || ballz.getxPos() < 0 || ballz.getyPos() > 800 || ballz.getyPos() < 0) {
				balls.remove(ballz);
			}
		}

		// int time is used to record the current time : day / night
		if (time == 1) {
			if (e.getActionCommand() == "Add Snow") {
				Background baseFace = new SunnyDecorator();
				background = new SnowyDecorator(baseFace);
			}
		}
		if (time == 2) {
			if (e.getActionCommand() == "Add Snow") {
				Background baseFace = new SunnyDecorator();
				Background baseFaceatNight = new NightDecorator(baseFace);
				background = new SnowyDecorator(baseFaceatNight);
			}
		}

		if (time == 1) {
			if (e.getActionCommand() == "Add Rain") {
				Background baseFace = new SunnyDecorator();
				background = new RainyDecorator(baseFace);
			}
		}
		if (time == 2) {
			if (e.getActionCommand() == "Add Rain") {
				Background baseFace = new SunnyDecorator();
				Background baseFaceatNight = new NightDecorator(baseFace);
				background = new RainyDecorator(baseFaceatNight);
			}
		}

		// move and delete snows
		for (int i = 0; i < snow.size(); i++) {
			snow.get(i).move();
			if (snow.get(i).getY() > 800) {
				snow.remove(i);
			}
		}

		// move and delete rain
		for (int i = 0; i < rain.size(); i++) {
			rain.get(i).move();
			if (rain.get(i).getY() > 800) {
				rain.remove(i);
			}
		}

		// make the paddles follow the mouse when they are clicked
		for (int i = 0; i < paddles.size(); i++) {
			if (paddles.get(i).getChosen()) {
				paddles.get(i).setxPos(mouseX);
				paddles.get(i).setyPos(mouseY);
				paddles.get(i).setRotate(Math.PI / 8);
			}

		}

		// Update for balls bouncing off the board
		if (board.getOpen()) {
			for (int i = 0; i < balls.size(); i++) {
				if (balls.get(i).getxPos() < 225 && balls.get(i).getxPos() > 205 && balls.get(i).getyPos() > 300)
					board.reflect(balls.get(i));
			}
		}

		// Open the drawer by hovering
		if (Util.dist(mouseX, mouseY, drawer.getxPos(), drawer.getyPos()) < 90) {
			// this timer is meant to be infinitely long to restart,
			// so that the drawer sound do not loop infinitely
			if (drawer.soundTimer >= 50000) {
				drawer.soundTimer -= 0.1;
//				Sound.play("assets/door06.wav");
			}
			drawer.setOpen(true);
		} else {
			drawer.setOpen(false);
			drawer.soundTimer = 50000;
		}

		repaint();
	}

	public class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)

				if (e.getKeyCode() == KeyEvent.VK_LEFT)

					if (e.getKeyCode() == KeyEvent.VK_UP)

						if (e.getKeyCode() == KeyEvent.VK_DOWN) {

						}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)

				if (e.getKeyCode() == KeyEvent.VK_LEFT)

					if (e.getKeyCode() == KeyEvent.VK_UP)

						if (e.getKeyCode() == KeyEvent.VK_DOWN) {

						}

		}
	}

	public class MyMouseListener extends MouseAdapter {

		public void mouseEntered(MouseEvent e) {

		}

		public void mouseExited(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {
			if (!havePaddle) {
				// When clicked on the paddles, user chooses the paddle and the
				// other two disappear
				for (int i = 0; i < paddles.size(); i++) {
					if (Util.dist(paddles.get(i).getxPos(), paddles.get(i).getyPos(), mouseX, mouseY) < 50) {
						paddles.get(i).setChosen(true);
						if (i == 0) {
							paddles.remove(2);
							paddles.remove(1);
							red = true;
							black = false;
							wood = false;
							paddlesChoosing = false;
							// spawn instruction 2
							if (!doneInstruction2) {
								txt.setInstruction(2);
								doneInstruction1 = true;
							}
						} else if (i == 1) {
							paddles.remove(2);
							paddles.remove(0);
							red = false;
							black = true;
							wood = false;
							paddlesChoosing = false;
							// spawn instruction 2
							// spawn instruction 2
							if (!doneInstruction2) {
								txt.setInstruction(2);
								doneInstruction1 = true;
							}
						} else if (i == 2) {
							paddles.remove(1);
							paddles.remove(0);
							red = false;
							black = false;
							wood = true;
							paddlesChoosing = false;
							// spawn instruction 2
							// spawn instruction 2
							if (!doneInstruction2) {
								txt.setInstruction(2);
								doneInstruction1 = true;
							}
						}
						havePaddle = true;
					}
				}

				// When user clicked the drawer when it is opened, 3 paddles
				// appear
				if (Util.dist(mouseX, mouseY, drawer.getxPos(), drawer.getyPos()) < 90) {
					// toss in paddle objects from Paddle subclass under the
					// InteractiveObjects package
					paddles.add(new Paddle(300, 300, 0, 0, 1, new Color(255, 40, 40, 200)));
					paddles.add(new Paddle(500, 300, 0, 0, 1, new Color(10, 10, 10, 200)));
					paddles.add(new Paddle(700, 300, 0, 0, 1, new Color(205, 133, 60, 200)));
					paddlesChoosing = true;
				}
				// If user click the drawer when he has a paddle, he can return
				// the paddle with the first click
				// while the second click would open the paddle option again
			} else if (havePaddle && Util.dist(mouseX, mouseY, drawer.getxPos(), drawer.getyPos()) < 90) {
				paddles.remove(0);
				havePaddle = false;
			}

			// click on the balls to spawn one ball
			if (Util.dist(mouseX, mouseY, basket.getxPos(), basket.getyPos()) < 30) {
				balls.add(new Ball(700, 300, 0, 0, 1, new Color(255, 165, 0)));
				serves += 1;
				// skip instruction2 if clicked once
				if (!doneInstruction2 && doneInstruction1) {
					txt.setInstruction(3);
					doneInstruction2 = true;
				} else if (!doneInstruction2 && !doneInstruction1) {
					txt.setInstruction(1);
					doneInstruction1 = true;
				}
			}

			// when user click on the closed board, it opens
			if (mouseX > 125 && mouseX < 225 && mouseY > 240 && mouseY < 650 && !board.getOpen()) {
				board.setOpen(true);
//				Sound.play("assets/door04.wav");
				board.setHover(false);
			} else if (mouseX > 150 && mouseX < 300 && mouseY > 340 && mouseY < 850 && board.getOpen()) {
				board.setOpen(false);
//				Sound.play("assets/door04.wav");
			}

		}

		public void mouseReleased(MouseEvent e) {
		}

	}

	public class MyMouseMotionListener extends MouseMotionAdapter {

		public void mouseDragged(MouseEvent e) {
			mouseX = e.getX();
			mouseY = e.getY();
		}

		public void mouseMoved(MouseEvent e) {
			mouseX = e.getX();
			mouseY = e.getY();

			// select the board by hovering
			if (mouseX > 125 && mouseX < 225 && mouseY > 240 && mouseY < 650 && !board.getOpen()) {
				board.setHover(true);
			} else if (mouseX < 125 || mouseX > 225 || mouseY < 240 || mouseY > 650 && !board.getOpen()) {
				board.setHover(false);
			}

			if (mouseX > 150 && mouseX < 300 && mouseY > 340 && mouseY < 850 && board.getOpen()) {
				board.setHover(true);
			} else if (mouseX < 150 || mouseX > 300 || mouseY < 340 || mouseY > 850 && board.getOpen()) {
				board.setHover(false);
			}

			// when mouse hover over balls
			if (Util.dist(mouseX, mouseY, basket.getxPos(), basket.getyPos()) < 30) {
				basket.setHover(true);
			} else {
				basket.setHover(false);
			}

			// When paddle touches balls, balls shoot to the top left
			for (int i = 0; i < balls.size(); i++) {
				if (havePaddle) {
					if (Util.dist(mouseX, mouseY, balls.get(i).getxPos(), balls.get(i).getyPos()) < 50 && !touch) {

						balls.get(i).setspeedX(0);
						// balls.get(i).setspeedY(-7.5);
						// the choice of paddle colour affects the force
						if (red) {
							balls.get(i).speedX -= 19.8;
							balls.get(i).setspeedY(-7.5);

							if (paddleBallTimer >= 50) {
//								Sound.play("assets/bounce1.wav");
							}
							paddleBallTimer -= 10;
						}
						if (black) {
							balls.get(i).speedX -= 14.3;
							balls.get(i).setspeedY(-4.5);
//							Sound.play("assets/bounce1.wav");
						}
						if (wood) {
							balls.get(i).speedX -= 30;
							balls.get(i).setspeedY(-9.5);
//							Sound.play("assets/bounce1.wav");
						}
						touch = true;
					} else if (Util.dist(mouseX, mouseY, balls.get(i).getxPos(), balls.get(i).getyPos()) > 50
							&& touch) {
						touch = false;
						paddleBallTimer = 50;
					}

				}
			}
		}

	}

	@Override
	public void loop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}
}
