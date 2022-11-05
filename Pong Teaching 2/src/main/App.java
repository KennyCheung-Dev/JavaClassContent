package main;

import javax.swing.JFrame;

public class App extends JFrame {
	
	private TitleScreen titleScreen = new TitleScreen(this);

	public App(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(titleScreen);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new App("PongGame");
	}

	public void StartMainGame() {
		this.remove(titleScreen);
		System.out.println("Hmm?");
		Main mainGame = new Main(this);
		this.add(mainGame);
		this.pack();
		this.setVisible(true);
	}
	
}
