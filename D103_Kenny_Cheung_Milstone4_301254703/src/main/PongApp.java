package main;

import javax.swing.JFrame;

//import sound.Sound;

public class PongApp extends JFrame {

	public PongApp(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PongPanel bpnl = new PongPanel(this);
		this.add(bpnl);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new PongApp("Surreal PingPong");

		// Play the background Music
//		Sound.play("assets/MizuHachisu.wav");
		
	}

}
