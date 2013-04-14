package field;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import objects.Shooter;

public class MyKeyListener implements KeyListener {
	
	Shooter shooter;
	
	public MyKeyListener (Shooter s) {
		shooter = s;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		switch (keyCode) {
			case KeyEvent.VK_W:
				shooter.move(0, -1);
				break;
			case KeyEvent.VK_A:
				shooter.move(-1, 0);
				break;
			case KeyEvent.VK_S:
				shooter.move(0, 1);
				break;
			case KeyEvent.VK_D:
				shooter.move(1, 0);
				break;
			case KeyEvent.VK_SPACE:
				shooter.shoot();
				break;
		}
		
		System.out.println(keyCode);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
