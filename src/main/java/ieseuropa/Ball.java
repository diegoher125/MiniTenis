package main.java.ieseuropa;

import java.awt.Graphics2D;

public class Ball {
	
	private int x = 0;
	private int y = 0;
	private int xa = 1;
	private int ya = 1;
	private Game3 game;
	
	public Ball(Game3 game) {
		this.game = game;
	}
	
	void move() {
		if(x + xa < 0)
			xa = 1;
		if(x + xa > game.getWidth() - 30)
			xa = -1;
		if(y + ya < 0)
			ya = 1;
		if(y + ya > game.getHeight() - 30)
			ya = -1;
		
		x = x + xa;
		y = y + ya;
	}
	
	public void paint(Graphics2D g) {
		g.fillOval(x, y, 30, 30);
	}

}
