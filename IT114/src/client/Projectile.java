package client;

public class Projectile {

	int speed = 1;
	int size = 1;
	boolean isShooting = false;
	int direction = 0;
	
	
	public void setIsShooting(boolean s) {
		isShooting=s;
	}
	
	public boolean getIsShooting() {
		return isShooting;
	}
	
	public void setDirection(int d) {
		direction =d;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public void setSize(int s) {
		size =s;
	}
	
	public int getSize(int s) {
		return s;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
}
