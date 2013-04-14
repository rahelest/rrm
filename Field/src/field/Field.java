package field;

import javax.swing.JFrame;

public class Field extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	int sizeX = 200;
	int sizeY = 400;

	public Field () {
		Board board = new Board(sizeX, sizeY);
		add(board);
		
		setSize(sizeX, sizeY);
		setTitle("Field");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		Field field = new Field();
		field.setLocationRelativeTo(null);
		field.setVisible(true);
	}
}
