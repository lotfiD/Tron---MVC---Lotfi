package view;

import java.awt.Toolkit;
import javax.swing.JFrame;

import controller.ControllerFacade;


public class Frame extends ViewFacade{
	
	public Frame(){
	
	dim = Toolkit.getDefaultToolkit().getScreenSize();
	jframe = new JFrame("TRON");
	jframe.setVisible(true);
	jframe.setSize(600, 400);
	jframe.setResizable(false);
	jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
	jframe.add(renderPanel = new RenderPanel());
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.addKeyListener(this);
	startGame();
	}
	
}

