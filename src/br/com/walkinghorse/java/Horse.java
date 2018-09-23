package br.com.walkinghorse.java;

import java.util.Random;

public class Horse {
	
	private int x;
	private int y;
	private int min;
	private int lengthAvList;
	private final int [][] avList = {{0,2,1,-1,-2,-2,-1,1,2},
					  						{0,1,2,2,1,-1,-2,-2,-1}};

	public Horse(){
		this.x = -1;
		this.y = -1;
		this.min = 1;
		this.lengthAvList = 8; 
	}
	public void setPositionX(int x){
		this.x = x;
	}
	public void setPositionY(int y){
		this.y = y;
	}
	public int[][] getAvailableList(){
		return this.avList;
	}
	public int getPositionX(){
		return this.x;
	}
	public int getPositionY(){
		return this.y;
	}
	public int getLengthList() {
		return this.lengthAvList;
	}
	public int getNextPositionX(int x, int bid){
		return x + avList[0][bid];
	}
	public int getNextPositionY(int y, int bid){
		return y + avList[1][bid];
	}

	public void setRandomPosition(int max){
		int[] rPosition = new int[2];
		rPosition[0] = this.randomValue(max);
		rPosition[1] = this.randomValue(max);
		this.setPositionX(rPosition[0]);
		this.setPositionY(rPosition[1]);
	}
	private int randomValue(int max){
		Random rand = new Random();
		return rand.nextInt((max - this.min) + 1) + this.min;
	}
	
}
