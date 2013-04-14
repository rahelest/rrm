package tanks;

public class Tank {

	Board board;
	private int x = 0;
	private int y = 0;

	public Tank(Board b) {
		board = b;
	}

	public Tank move(int newX, int newY) {
		int x = this.x + newX;
		int y = this.y + newY;

		if (x < 0 || x >= board.getWidth() || y < 0 || y >= board.getHeight())
			return null;
		else {
			this.x = x;
			this.y = y;
			board.repaint();
			return this;
		}

	}

	public int x() {
		// TODO Auto-generated method stub
		return x;
	}

	public int y() {
		// TODO Auto-generated method stub
		return y;
	}

}
