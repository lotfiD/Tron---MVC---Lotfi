package snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Direction extends Snake implements KeyListener  {
	
	//Comment utiliser les attributs présent dans le Snake ?
	@Override
	public void keyPressed(KeyEvent e) //Les touches et directions
	{
		int i = e.getKeyCode();
		int j = e.getKeyCode();
		
		if ((i == KeyEvent.VK_Q ) && direction1 != RIGHT1)
		{
			direction1 = LEFT1;
		}

		if ((i == KeyEvent.VK_D ) && direction1 != LEFT1)
		{
			direction1 = RIGHT1;
		}

		if ((i == KeyEvent.VK_Z ) && direction1 != DOWN1)
		{
			direction1 = UP1;
		}

		if ((i == KeyEvent.VK_S ) && direction1 != UP1)
		{
			direction1 = DOWN1;
		}
		if (( j == KeyEvent.VK_LEFT) && direction2 != RIGHT2)
		{
			direction2 = LEFT2;
		}

		if (( j == KeyEvent.VK_RIGHT) && direction2 != LEFT2)
		{
			direction2 = RIGHT2;
		}

		if (( j == KeyEvent.VK_UP) && direction2 != DOWN2)
		{
			direction2 = UP2;
		}

		if (( j == KeyEvent.VK_DOWN) && direction2 != UP2)
		{
			direction2 = DOWN2;  
		}  

		if (i == KeyEvent.VK_SPACE) // Espace pour pause
		{
			if (over1)                // Pour relancer le jeu
			{
				startGame();
			}
			if (over2)                // Pour relancer le jeu
			{
				startGame();
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
