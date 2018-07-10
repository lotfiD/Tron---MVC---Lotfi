package model;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Direction implements KeyListener  {
    
	public Snake Snake;
	
    public Direction (Snake Snake1)  { 
    	this.Snake=Snake1;
     }
	
	@Override
	public void keyPressed(KeyEvent e) //Les touches et directions
	{
		int i = e.getKeyCode();
		int j = e.getKeyCode();
		
		if ((i == KeyEvent.VK_Q ) && Snake.direction1 != Snake.RIGHT1)
		{
			Snake.direction1 = Snake.LEFT1;
		}

		if ((i == KeyEvent.VK_D ) && Snake.direction1 != Snake.LEFT1)
		{
			Snake.direction1 = Snake.RIGHT1;
		}

		if ((i == KeyEvent.VK_Z ) && Snake.direction1 != Snake.DOWN1)
		{
			Snake.direction1 = Snake.UP1;
		}

		if ((i == KeyEvent.VK_S ) && Snake.direction1 != Snake.UP1)
		{
			Snake.direction1 = Snake.DOWN1;
		}
		if (( j == KeyEvent.VK_LEFT) && Snake.direction2 != Snake.RIGHT2)
		{
			Snake.direction2 = Snake.LEFT2;
		}

		if (( j == KeyEvent.VK_RIGHT) && Snake.direction2 != Snake.LEFT2)
		{
			Snake.direction2 = Snake.RIGHT2;
		}

		if (( j == KeyEvent.VK_UP) && Snake.direction2 != Snake.DOWN2)
		{
			Snake.direction2 = Snake.UP2;
		}

		if (( j == KeyEvent.VK_DOWN) && Snake.direction2 != Snake.UP2)
		{
			Snake.direction2 = Snake.DOWN2;  
		}  

		if (i == KeyEvent.VK_SPACE) // Espace relancer le jeu
		{
			if (Snake.over1)                // Pour relancer le jeu
			{
				Snake.startGame(); //pourquoi ca marche ici
			}
			if (Snake.over2)                // Pour relancer le jeu
			{
				Snake.startGame(); //pourquoi ca marche ici
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
	}

}
