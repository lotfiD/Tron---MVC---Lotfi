package model;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Direction implements KeyListener  {
    
	public Snake Snake; 
	
    public Direction ()  {
     }
	public static final int UP1 = 0, DOWN1 = 1, LEFT1 = 2, RIGHT1 = 3, SCALE1 = 5; //sélectionne la taille du 1er serpent

	public static final int UP2 = 0, DOWN2 = 1, LEFT2 = 2, RIGHT2 = 3, SCALE2 = 5; // 2nd Joueur
	
	public int ticks = 0, direction1 = DOWN1,direction2 = UP2, tailLength1 = 10,tailLength2 = 10, time;

	public boolean over1 = false,over2 = false;
	
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

		if (i == KeyEvent.VK_SPACE) // Espace relancer le jeu
		{
			if (over1)                // Pour relancer le jeu
			{
				Snake.startGame(); //pourquoi ca marche pas
			}
			if (over2)                // Pour relancer le jeu
			{
				Snake.startGame(); //pourquoi ca marche pas
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
