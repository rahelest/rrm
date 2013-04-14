package field;

import objects.BlockHolder;
import objects.Mover;

public class CollisionChecker {
	
	public static int boardX;
	public static int boardY;
	
	//public static ArrayList<Mover> objects = new ArrayList<Mover>();
	
	public static boolean wallCollision(Mover m, int newX, int newY) {
		if (newX < 0 || newY < 0
				|| newX + m.width >= boardX 
				|| newY + m.height>= boardY) {
			System.out.println("collision");
			return true;
		}
			
		else return false;
	}
	
	public static Mover objectCollision(Mover m, int newX, int newY) {

		for (Mover m2 : BlockHolder.blocks) {
			if (!m.equals(m2) && m2 != null) {
				if (m.intersects(m2)) {
					System.out.println("objectcollision to " + m2);
					return m2;
				}
					
			}
		}
		
		return null;		
	}
}
