package view;

import java.awt.Toolkit;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.*;

public class Frame implements KeyListener{
	
	public ViewFacade ViewFacade;
	
	public RenderPanel renderPanel;
	
	public Snake Snake;

	public Frame(Snake Snake1){
		
	this.Snake=Snake1;
	
	Snake.dim = Toolkit.getDefaultToolkit().getScreenSize();
	Snake.jframe = new JFrame("TRON");
	Snake.jframe.setVisible(true);
	Snake.jframe.setSize(600, 400);
	Snake.jframe.setResizable(false);
	Snake.jframe.setLocation(Snake.dim.width / 2 - Snake.jframe.getWidth() / 2, Snake.dim.height / 2 - Snake.jframe.getHeight() / 2);
	Snake.jframe.add(renderPanel = new RenderPanel(Snake));    
	Snake.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Snake.jframe.addKeyListener((KeyListener) this);
	Snake.startGame();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}

