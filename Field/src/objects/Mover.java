package objects;

import field.CollisionChecker;

public class Mover {

	public int x;
	public int y;	
	public int sizeX;
	public int sizeY;
	
	public Mover(int mX, int mY, int sX, int sY) {
		x = mX;
		y = mY;
		
		sizeX = sX;
		sizeY = sY;
	}

	public void move(int i, int j) {
		int newX = x + i * 10;
		int newY = y + j * 10;
		
		if (!CollisionChecker.collision(newX, newY, sizeX, sizeY)) {
			x = newX;
			y = newY;
		}
		
		System.out.println(x + " " + y);
		
	}


}
