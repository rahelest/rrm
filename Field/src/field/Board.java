package field;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import objects.Missile;
import objects.Mover;
import objects.Shooter;

public class Board extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	Shooter shooter = null;
	Timer timer;
	
	public Board(int sizeX, int sizeY) {
		CollisionChecker.boardX = sizeX;
		CollisionChecker.boardY = sizeY;
		shooter = new Shooter(sizeX / 2, sizeY / 2);
		setFocusable(true);
		timer = new Timer(10, this);
		timer.start();
		addKeyListener(new MyKeyListener(shooter));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		drawSquare(g, shooter);
		ArrayList<Missile> missiles = shooter.getMissiles();
		g.setColor(Color.RED);
		for (Missile m : missiles) {
			drawSquare(g, m);
		}
		
		
	}

	private void drawSquare(Graphics g, Mover mover) {
		g.fillRect(mover.x, mover.y, mover.sizeX, mover.sizeY);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//mover.move(0, 1);
		repaint();
		
	}
}
