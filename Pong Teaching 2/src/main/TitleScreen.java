package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TitleScreen extends JPanel implements ActionListener {
	
	private JFrame frame;
	private int screenWidth = 640;
	private int screenHeight = 480;
	private String START_GAME_TEXT = "Start Pong";
	
	public TitleScreen(JFrame frame) {
		super();
		this.frame = frame;
		
		this.setLayout(new FlowLayout(1));
		
		//Setup panel size 
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		
//		JButton startGameButton = new JButton(START_GAME_TEXT);
//		startGameButton.addActionListener(this);
		
		
		//All rows
		JPanel rowsPanel = new JPanel();
		BoxLayout rowsLayout = new BoxLayout(rowsPanel, 1);
		rowsPanel.setLayout(rowsLayout);
		this.add(rowsPanel);
		
		
		// Row 1
		JPanel row1Panel = new JPanel();
		FlowLayout row1Layout = new FlowLayout(0);
		row1Panel.setLayout(row1Layout);
		
		rowsPanel.add(row1Panel);
		
		JButton quartzButton = new JButton("Quark");
		quartzButton.setMaximumSize(new Dimension(screenWidth / 2, 80));
		quartzButton.setPreferredSize(new Dimension(screenWidth / 2, 80));
		row1Panel.add(quartzButton);
		
		JButton electronButton = new JButton("Electron");
		electronButton.setMaximumSize(new Dimension(screenWidth / 2, 80));
		electronButton.setPreferredSize(new Dimension(screenWidth / 2, 80));
		row1Panel.add(electronButton);
		
		
		// Row 2
		JPanel row2Panel = new JPanel();
		FlowLayout row2Layout = new FlowLayout(0);
		row2Panel.setLayout(row2Layout);
		
		rowsPanel.add(row2Panel);
		
		JButton neutronButton = new JButton("Neutron");
		neutronButton.setMaximumSize(new Dimension(screenWidth / 2, 80));
		neutronButton.setPreferredSize(new Dimension(screenWidth / 2, 80));
		row2Panel.add(neutronButton);
		
		JButton protonButton = new JButton("Proton");
		protonButton.setMaximumSize(new Dimension(screenWidth / 2, 80));
		protonButton.setPreferredSize(new Dimension(screenWidth / 2, 80));
		row2Panel.add(protonButton);
		
		
		//Tabbed Pane view
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setPreferredSize(new Dimension(screenWidth, 80));
		
		this.add(tabbedPane);
		JTextField textField = new JTextField(0);
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Current Content: " + textField.getText());
				
			}
		});
		String css =  "";
		String html1 = "<html><body style = '"+ css +"'>";
        String html2 =  "</body></html>";
		tabbedPane.addTab(html1 + "TextField tab" + html2, textField);
		
		JTextPane bigTextPane = new JTextPane();
		tabbedPane.addTab("<html>BiggerTextPane tab</html>", bigTextPane);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().contentEquals(START_GAME_TEXT)) {
			((App)frame).StartMainGame();
		}
		
	}
}
