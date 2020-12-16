package client; 

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

import core.GameObject;

public class Player extends GameObject implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6088251166673414031L;
    Color color = Color.WHITE;
    Point nameOffset = new Point(0, 5);
    Ticket ticket = null;
    Chair chair = null;
    int points = 0;
    boolean isReady = false;
    long lastAction = -1L;
    String team = null;
    int isHit =0;
    boolean isOut = false;

    public void setLastAction(Long l) {
	lastAction = l;
    }

    public long getTimeBetweenLastAction(Long compare) {
	return compare - lastAction;
    }

    public long getLastAction() {
	return lastAction;
    }

    public void setReady(boolean r) {
	isReady = r;
    }

    public boolean isReady() {
	return isReady;
    }

    public void setTeam(String t) {
    	team = t;
    }

    public String getTeam() {
    	return team;
    }

    public void isHit(int shot) {
    	isHit+=shot;
    }

    public boolean playerOut() {
    	if (isHit>=3){ //if hit three times, player is out
    		isOut=true;
    	}
    	return isOut;
    }

    public boolean hasTicket() {
    	return ticket != null;
        }

        public void setTicket(Ticket n) {
    	ticket = n;
        }

        public Ticket takeTicket() {
    	if (ticket == null) {
    	    return null;
    	}
    	Ticket t = ticket;
    	ticket = null;
    	return t;
        }

        public void setChair(Chair c) {
    	chair = c;
        }

        public boolean isSitting() {
    	return chair != null;
        }

        public void unsit() {
    	chair = null;
        }

        /**
         * Gets called by the game engine to draw the current location/size
         */
        @Override
        public boolean draw(Graphics g) {
    	// using a boolean here so we can block drawing if isActive is false via call to
    	// super
    	if (super.draw(g)) {
    	    g.setColor(color);
    	    g.fillOval(position.x, position.y, size.width, size.height);
    	    g.setColor(Color.WHITE);
    	    g.setFont(new Font("Monospaced", Font.PLAIN, 12));
    	    g.drawString("Name: " + name, position.x + nameOffset.x, position.y + nameOffset.y);
    	}
    	return true;
        }

        @Override
        public String toString() {
    	return String.format("Name: %s, p: (%d,%d), s: (%d, %d), d: (%d, %d), isActive: %s, Team: %s, Points: %s" , name, position.x,
    		position.y, speed.x, speed.y, direction.x, direction.y, isActive, team, points);
        }
    }