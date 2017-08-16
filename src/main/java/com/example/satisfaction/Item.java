package com.example.satisfaction;

/**
 * Menu item, which defines time taken to complete an item and the satisfaction
 * achieved by having it.
 * 
 * @author kaushik
 *
 */
public class Item {

	private int time;
	private int satisfaction;

	public Item(int time, int satisfaction) {
		super();
		this.time = time;
		this.satisfaction = satisfaction;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}
}