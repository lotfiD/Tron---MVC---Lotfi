package view;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import model.Snake;


/**
 * @author Lotfi Djaileb
 */
public class RenderPanel extends JPanel  
{

	private static final long serialVersionUID = 1L;

	public ViewFacade ViewFacade;
	
	public Frame Frame;
	
	public Snake Snake;
	
	public RenderPanel (Snake Snake1)  { 
		this.Snake=Snake1;
    }
	
	public final Color GREEN= new Color(1666073); // Panel de couleur background
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Snake snake = Snake;

		g.setColor(GREEN); // Le background
		
		g.fillRect(0, 0, 595, 365);

		g.setColor(Color.BLUE); // Le snake
		
		for (Point point : snake.snakeParts1)
		{
			g.fillRect(point.x * model.Snake.SCALE1, point.y * model.Snake.SCALE1, model.Snake.SCALE1, model.Snake.SCALE1);
		}
				
		g.fillRect(snake.head1.x * model.Snake.SCALE1, snake.head1.y * model.Snake.SCALE1, model.Snake.SCALE1, model.Snake.SCALE1);
		
		g.setColor(Color.RED); // Le snake 2eme Joueur

		for (Point point : snake.snakeParts2)
		{
			g.fillRect(point.x * model.Snake.SCALE2, point.y * model.Snake.SCALE2, model.Snake.SCALE2, model.Snake.SCALE2);
		}
		g.fillRect(snake.head2.x * model.Snake.SCALE2, snake.head2.y * model.Snake.SCALE2, model.Snake.SCALE2, model.Snake.SCALE2); 
		

		String string = "Time: " + snake.time / 20;
		
		g.setColor(Color.white); // L'ecriture du temps
		
		g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), 10);

		string = "Red Team Win  !!! :)"; // L'ecriture du game over

		if (snake.over1)
		{
			g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), (int) model.Snake.dim.getHeight() / 4);
		}
		
		string = "Blue Team Win !!! :) ";
		if (snake.over2)
		{
			g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), (int) model.Snake.dim.getHeight() / 4);
		}
	}
}
