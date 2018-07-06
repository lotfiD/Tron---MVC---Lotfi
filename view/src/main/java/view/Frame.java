package snake;

import java.awt.Toolkit;
import javax.swing.JFrame;


public class Frame extends Snake {
	
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

