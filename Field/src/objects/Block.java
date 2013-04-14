package objects;

public class Block extends Mover {
	
	int health = 3;

	public Block(int mX, int mY) {
		super(mX, mY, 30, 30);
	}
	
	@Override
	public void damage (Missile m) {
		health -= m.damage;
		System.out.println(health);
		if (health <= 0) {
			BlockHolder.removeMe(this);
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Block@" + x + ":" + y; 
	}

}
