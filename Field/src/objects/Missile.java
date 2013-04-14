package objects;

import field.CollisionChecker;

public class Missile extends Mover implements Runnable {
	
	Shooter owner;
	
	public Missile(Shooter own, int mX, int mY) {
		super(mX, mY, 5, 5);
		owner = own;
		System.out.println("Missile created");
		run();
	}

	@Override
	public void run() {
		while (!CollisionChecker.collision(x, y - 1, sizeX, sizeY)) {
			y -= 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		owner.removeMe(this);
	}

}
