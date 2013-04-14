package objects;

import java.util.ArrayList;

public class Shooter extends Mover {
	
	ArrayList<Missile> missiles = new ArrayList<Missile>();

	public Shooter(int mX, int mY) {
		super(mX, mY, 20, 20);
	}
	

	public void shoot() {
		Missile m = new Missile(this, x + width / 2 - 2, y - 1);
		missiles.add(m);
		new Thread(m).start();
		
	}
	
	public ArrayList<Missile> getMissiles() {
		return missiles;
	}


	public void removeMe(Missile missile) {
		missiles.remove(missile);
		
	}
	
	

}
