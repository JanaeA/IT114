package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

import core.GameObject;

public class Projectile extends GameObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5449466103229754901L;
	/**
	 * 
	 */
	Color color = null;
	int speed = 1;
	boolean isShooting = false;
	int direction = 0; 
	
	
	public void paint(Graphics g) {
		g.fillOval(position.x, position.y, size.width, size.height);
	}
}
