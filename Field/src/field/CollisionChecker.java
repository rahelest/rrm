package field;

public class CollisionChecker {
	
	public static int boardX;
	public static int boardY;
	
	public static boolean collision(int newX, int newY, int sizeX, int sizeY) {
		if (newX < 0 || newY < 0
				|| newX + sizeX >= boardX 
				|| newY + sizeY >= boardY) {
			System.out.println("collision");
			return true;
		}
			
		else return false;
	}

}
