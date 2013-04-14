package objects;

import java.util.ArrayList;

public class Shooter extends Mover {
	
	ArrayList<Missile> missiles = new ArrayList<Missile>();

	public Shooter(int mX, int mY) {
		super(mX, mY, 20, 20);
	}
	

	public void shoot() {
		missiles.add(new Missile(this, x + sizeX / 2, y - 1));
		
	}
	
	public ArrayList<Missile> getMissiles() {
		return missiles;
	}


	public void removeMe(Missile missile) {
		missiles.remove(missile);
		
	}
	
	

}
