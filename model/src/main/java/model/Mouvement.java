package model;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mouvement implements ActionListener{
		
    public view.RenderPanel renderPanel;
    
    public Snake Snake;
    public Mouvement (Snake Snake1)  { 
    	this.Snake=Snake1;
   }
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		renderPanel.repaint(); // Le probléme est surement ici probleme d'uptade C'est sur c'est la mise a jour
		Snake.ticks++;

		if (Snake.ticks % 2 == 0 && Snake.head1 != null && !Snake.over1 && !Snake.over2)
		{
			Snake.time++;

			Snake.snakeParts1.add(new Point(Snake.head1.x, Snake.head1.y)); // ajoute une ligne derriére le serpent

			if (Snake.direction1 == Snake.UP1)    // Les 4 directions fixe les limites de la map et les serpents ne peuvent se toucher
			{
				if (Snake.head1.y - 1 >= 0 && noTailAt1(Snake.head1.x, Snake.head1.y - 1)&& noTailAt2(Snake.head1.x, Snake.head1.y - 1))
				{
					Snake.head1 = new Point(Snake.head1.x, Snake.head1.y - 1);
				}
				else
				{
					Snake.over1 = true;

				}
			}

			if (Snake.direction1 == Snake.DOWN1)
			{
				if (Snake.head1.y + 1 < 73 && noTailAt1(Snake.head1.x, Snake.head1.y + 1)&& noTailAt2(Snake.head1.x, Snake.head1.y + 1))
				{
					Snake.head1 = new Point(Snake.head1.x, Snake.head1.y + 1);
				}
				else
				{
					Snake.over1 = true;
				}
			}

			if (Snake.direction1 == Snake.LEFT1)
			{
				if (Snake.head1.x - 1 >= 0 && noTailAt1(Snake.head1.x - 1, Snake.head1.y)&& noTailAt2(Snake.head1.x - 1, Snake.head1.y))
				{
					Snake.head1 = new Point(Snake.head1.x - 1, Snake.head1.y);
				}
				else
				{
					Snake.over1 = true;
				}
			} 

			if (Snake.direction1 == Snake.RIGHT1)
			{
				if (Snake.head1.x + 1 < 119 && noTailAt1(Snake.head1.x + 1, Snake.head1.y)&& noTailAt2(Snake.head1.x + 1, Snake.head1.y))
				{
					Snake.head1 = new Point(Snake.head1.x + 1, Snake.head1.y);
				}
				else
				{
					Snake.over1 = true;
				}
			}
		}
			
			if (Snake.ticks % 2 == 0 && Snake.head2 != null && !Snake.over1 && !Snake.over2) // 2nd Joueur
			{
				Snake.time++;

				Snake.snakeParts2.add(new Point(Snake.head2.x, Snake.head2.y)); // ajoute une ligne derriére le serpent

				if (Snake.direction2 == Snake.UP2)    // Les 4 directions fixe les limites de la map et les serpents ne peuvent se toucher
				{
					if (Snake.head2.y - 1 >= 0 && noTailAt2(Snake.head2.x, Snake.head2.y - 1)&& noTailAt1(Snake.head2.x, Snake.head2.y - 1))
					{
						Snake.head2 = new Point(Snake.head2.x, Snake.head2.y - 1);
					}
					else
					{
						Snake.over2 = true;

					}
				}

				if (Snake.direction2 == Snake.DOWN2)
				{
					if (Snake.head2.y + 1 < 73 && noTailAt2(Snake.head2.x, Snake.head2.y + 1)&& noTailAt1(Snake.head2.x, Snake.head2.y + 1))
					{
						Snake.head2 = new Point(Snake.head2.x, Snake.head2.y + 1);
					}
					else
					{
						Snake.over2 = true;
					}
				}

				if (Snake.direction2 == Snake.LEFT2)
				{
					if (Snake.head2.x - 1 >= 0 && noTailAt2(Snake.head2.x - 1, Snake.head2.y)&& noTailAt1(Snake.head2.x, Snake.head2.y - 1))
					{
						Snake.head2 = new Point(Snake.head2.x - 1, Snake.head2.y);
					}
					else
					{
						Snake.over2 = true;
					}
				} 

				if (Snake.direction2 == Snake.RIGHT2)
				{
					if (Snake.head2.x + 1 < 119 && noTailAt2(Snake.head2.x + 1, Snake.head2.y)&& noTailAt1(Snake.head2.x, Snake.head2.y + 1))
					{
						Snake.head2 = new Point(Snake.head2.x + 1, Snake.head2.y);
					}
					else
					{
						Snake.over2 = true;
					}
				}

		} 
	}

	public boolean noTailAt1(int x, int y) // Permet quand tu touche l'arriére de mourrir
	{
		for (Point point : Snake.snakeParts1)
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
		for (Point point : Snake.snakeParts2) // 2nd Joueur
		{
			if (point.equals(new Point(x, y)))
			{
				return false;
			}
		}
		return true;
	} 

}
