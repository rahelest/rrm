package tanks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tank myTank;

	public int height = 22;
	public int width = 22;
	public JLabel statusbar;

	public Board() {

		
	}
	
	public Board(Tanks parent) {

		setFocusable(true);
		myTank = new Tank(this);

		statusbar = parent.getStatusBar();
		addKeyListener(new TAdapter());
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	int squareWidth() {
		return (int) getSize().getWidth() / width;
	}

	int squareHeight() {
		return (int) getSize().getHeight() / height;
	}

	public void paint(Graphics g) {
		super.paint(g);

		Dimension size = getSize();
		drawSquare(g, myTank.x(), myTank.y());

	}

	private void drawSquare(Graphics g, int x, int y) {
		Color color = new Color(102, 204, 102);

		g.setColor(color);
		g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight() - 2);

		g.setColor(color.brighter());
		g.drawLine(x, y + squareHeight() - 1, x, y);
		g.drawLine(x, y, x + squareWidth() - 1, y);

		g.setColor(color.darker());
		g.drawLine(x + 1, y + squareHeight() - 1, x + squareWidth() - 1, y
				+ squareHeight() - 1);
		g.drawLine(x + squareWidth() - 1, y + squareHeight() - 1, x
				+ squareWidth() - 1, y + 1);

	}

	class TAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();

			switch (keycode) {
			case KeyEvent.VK_LEFT:
				myTank = myTank.move(-1, 0);
				break;
			case KeyEvent.VK_RIGHT:
				myTank = myTank.move(1, 0);
				break;
			case KeyEvent.VK_DOWN:
				myTank = myTank.move(0, 1);
				break;
			case KeyEvent.VK_UP:
				myTank = myTank.move(0, -1);
				break;
			}

		}
	}
}