package objects;

import java.awt.Rectangle;

import field.CollisionChecker;

public abstract class Mover extends Rectangle {
	
	public Mover(int mX, int mY, int sX, int sY) {
		x = mX;
		y = mY;
		
		width = sX;
		height = sY;
	}

	public void move(int i, int j) {
		int newX = x + i * 10;
		int newY = y + j * 10;
		
		if (!CollisionChecker.wallCollision(this, newX, newY)) {
			x = newX;
			y = newY;
		}
		
		System.out.println(x + " " + y);
		
	}

	public void damage(Missile missile) {}


}
