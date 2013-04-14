package objects;

import java.util.ArrayList;

import field.CollisionChecker;

public class BlockHolder {
	
	public static ArrayList<Block> blocks = new ArrayList<>();

	public static void removeMe(Block block) {
		blocks.remove(block);		
	}
	
	public static void newRandomBlock() {
		
		int randX = (int) Math.floor(Math.random()  * CollisionChecker.boardX);
		int randY = (int) Math.floor(Math.random()  * CollisionChecker.boardY);
		
		
		blocks.add(new Block(randX, randY));
	}

}
