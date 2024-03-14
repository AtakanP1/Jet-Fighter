package project_D;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayGame extends JFrame {

	Game game = new Game();

	int score;

	public PlayGame() {
		setLayout(new BorderLayout());
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.requestFocus();
		game.setFocusable(true);
		add(game, BorderLayout.CENTER);
		this.setVisible(true);

		// listens the key events and calls the function accordingly
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent event) {

				if (event.getKeyCode() == KeyEvent.VK_LEFT) {
					game.leftPressed();
				} else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
					game.rightPressed();
				} else if (event.getKeyCode() == KeyEvent.VK_SPACE) {
					synchronized (Game.bulletsList) {
						// creates bullets accordingly to fighterJet's position every time the space
						// pressed
						Bullet b = new Bullet(game.playerJet.getX(), game.playerJet.getY(), true, true);
						Game.bulletsList.add(b);
					}
				}

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}
}