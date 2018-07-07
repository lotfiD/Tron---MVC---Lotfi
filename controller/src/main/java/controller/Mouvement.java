package controller;
import model.*;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Mouvement implements ActionListener{
	
	public ControllerFacade ControllerFacade;
	
    public RenderPanel renderPanel;
    
	public static final int UP1 = 0, DOWN1 = 1, LEFT1 = 2, RIGHT1 = 3, SCALE1 = 5; //sélectionne la taille du 1er serpent

	public static final int UP2 = 0, DOWN2 = 1, LEFT2 = 2, RIGHT2 = 3, SCALE2 = 5; // 2nd Joueur
	
	public int ticks = 0, direction1 = DOWN1,direction2 = UP2, tailLength1 = 10,tailLength2 = 10, time;
	
	public ArrayList<Point> snakeParts1 = new ArrayList<Point>();
	
	public ArrayList<Point> snakeParts2 = new ArrayList<Point>();

	public Point head1,head2;

	public boolean over1 = false,over2 = false;

	
	// Comment utiliser les attributs présent dans Snake ?
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		renderPanel.repaint();
		ticks++;

		if (ticks % 2 == 0 && head1 != null && !over1 && !over2)
		{
			time++;

			snakeParts1.add(new Point(head1.x, head1.y)); // ajoute une ligne derriére le serpent

			if (direction1 == UP1)    // Les 4 directions fixe les limites de la map et les serpents ne peuvent se toucher
			{
				if (head1.y - 1 >= 0 && noTailAt1(head1.x, head1.y - 1)&& noTailAt2(head1.x, head1.y - 1))
				{
					head1 = new Point(head1.x, head1.y - 1);
				}
				else
				{
					over1 = true;

				}
			}

			if (direction1 == DOWN1)
			{
				if (head1.y + 1 < 73 && noTailAt1(head1.x, head1.y + 1)&& noTailAt2(head1.x, head1.y + 1))
				{
					head1 = new Point(head1.x, head1.y + 1);
				}
				else
				{
					over1 = true;
				}
			}

			if (direction1 == LEFT1)
			{
				if (head1.x - 1 >= 0 && noTailAt1(head1.x - 1, head1.y)&& noTailAt2(head1.x - 1, head1.y))
				{
					head1 = new Point(head1.x - 1, head1.y);
				}
				else
				{
					over1 = true;
				}
			} 

			if (direction1 == RIGHT1)
			{
				if (head1.x + 1 < 119 && noTailAt1(head1.x + 1, head1.y)&& noTailAt2(head1.x + 1, head1.y))
				{
					head1 = new Point(head1.x + 1, head1.y);
				}
				else
				{
					over1 = true;
				}
			}
		}
			
			if (ticks % 2 == 0 && head2 != null && !over1 && !over2) // 2nd Joueur
			{
				time++;

				snakeParts2.add(new Point(head2.x, head2.y)); // ajoute une ligne derriére le serpent

				if (direction2 == UP2)    // Les 4 directions fixe les limites de la map et les serpents ne peuvent se toucher
				{
					if (head2.y - 1 >= 0 && noTailAt2(head2.x, head2.y - 1)&& noTailAt1(head2.x, head2.y - 1))
					{
						head2 = new Point(head2.x, head2.y - 1);
					}
					else
					{
						over2 = true;

					}
				}

				if (direction2 == DOWN2)
				{
					if (head2.y + 1 < 73 && noTailAt2(head2.x, head2.y + 1)&& noTailAt1(head2.x, head2.y + 1))
					{
						head2 = new Point(head2.x, head2.y + 1);
					}
					else
					{
						over2 = true;
					}
				}

				if (direction2 == LEFT2)
				{
					if (head2.x - 1 >= 0 && noTailAt2(head2.x - 1, head2.y)&& noTailAt1(head2.x, head2.y - 1))
					{
						head2 = new Point(head2.x - 1, head2.y);
					}
					else
					{
						over2 = true;
					}
				} 

				if (direction2 == RIGHT2)
				{
					if (head2.x + 1 < 119 && noTailAt2(head2.x + 1, head2.y)&& noTailAt1(head2.x, head2.y + 1))
					{
						head2 = new Point(head2.x + 1, head2.y);
					}
					else
					{
						over2 = true;
					}
				}

		} 
	}

	public boolean noTailAt1(int x, int y) // Permet quand tu touche l'arriére de mourrir
	{
		for (Point point : snakeParts1)
		{
			if (point.equals(new Point(x, y)))
			{
				return false;
			}
		}
		return true;
	} 
	public boolean noTailAt2(int x, int y) // Permet quand tu touche l'arriére de mourrir
	{
		for (Point point : snakeParts2) // 2nd Joueur
		{
			if (point.equals(new Point(x, y)))
			{
				return false;
			}
		}
		return true;
	} 

}
