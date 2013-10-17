package bgs.core;

public class Player {
	
	public Player() {}
	
	public Player(String name, String position, int shoot, int accuracy,
			int rebound, int assist) {
		this.name = name;
		this.position = position;
		this.shoot = shoot;
		this.accuracy = accuracy;
		this.rebound = rebound;
		this.assist = assist;
	}
	
	
	String name;
	String position;
	int shoot;
	int accuracy;
	int rebound;
	int assist;
	
	public String getName() { return name; }
	public String getPosition() { return position; }
	public int getShoot() { return shoot; }
	public int getAccuracy() { return accuracy; }
	public int getRebound() { return rebound; }
	public int getAssist() { return assist; }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setShoot(int shoot) {
		this.shoot = shoot;
	}
	
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	public void setRebound(int rebound) {
		this.rebound = rebound;
	}
	
	public void setAssist(int assist) {
		this.assist = assist;
	}

}
