package objects;

import field.CollisionChecker;

public class Missile extends Mover implements Runnable {
	
	Shooter owner;
	public int damage = 1;
	
	public Missile(Shooter own, int mX, int mY) {
		super(mX, mY, 5, 5);
		owner = own;
		System.out.println("Missile created");
	}

	@Override
	public void run() {
		while (!CollisionChecker.wallCollision(this, x, y - 1)) {
			Mover other = CollisionChecker.objectCollision(this, x, y - 1);
			
			if (other != null) {
				other.damage(this);
				break;
			}
			y -= 1;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		owner.removeMe(this);
	}

}
