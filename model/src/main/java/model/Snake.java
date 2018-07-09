package model;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.Timer;
/**
 * @author Lotfi Djaileb
 */

public class Snake implements IModel
{

	public Snake snake1;
	
	public JFrame jframe;

	//public Timer timer = new Timer(20,(ActionListener) this); // comment le faire marcher si il demande un action listenner?

	public ArrayList<Point> snakeParts1 = new ArrayList<Point>();

	public ArrayList<Point> snakeParts2 = new ArrayList<Point>();

	public final int UP1 = 0, DOWN1 = 1, LEFT1 = 2, RIGHT1 = 3, SCALE1 = 5; //sélectionne la taille du 1er serpent

	public final int UP2 = 0, DOWN2 = 1, LEFT2 = 2, RIGHT2 = 3, SCALE2 = 5; // 2nd Joueur
	
	public int ticks = 0, direction1 = DOWN1,direction2 = UP2, tailLength1 = 10,tailLength2 = 10, time;

	public Point head1,head2;

	public boolean over1 = false;

	public boolean over2 = false;
   
	public Dimension dim;
	
	public Snake()
	{
	}

	public void startGame() //Ce qui se passe au debut du jeu
	{
		over1 = false;
		over2 = false;
		time = 0;
		tailLength1 = 2;
		tailLength2 = 2;
		ticks = 0;
		direction1 = DOWN1;
		direction2 = UP2;
		head1 = new Point(0,-1);
		head2 = new Point(118,72);
		snakeParts1.clear();
		snakeParts2.clear();
	//	timer.start(); 
	}

	@Override
	public Example getExampleById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Example getExampleByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Example> getAllExamples() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}	

