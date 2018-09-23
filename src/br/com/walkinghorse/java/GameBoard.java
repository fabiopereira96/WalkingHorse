package br.com.walkinghorse.java;

public class GameBoard {

	private int lin;
	private int col;
	private int availableValue;
	private int finalValue;
	private int finalPositionX;
	private int finalPositionY;
	
	protected int sizeBoard = 6; //Todo permitir definir as dimensoes do GameBoard
	protected int gameBoard[][];
 
	public GameBoard() {
		this.lin = 9;
		this.col = 9;
		this.availableValue = 0;
		this.gameBoard = new int[lin][col];
		this.initGameBoard();
		this.finalValue = -1;
	}
	public int getLines() {
		return this.lin;
	}
	public int getColumns() {
		return this.col;
	}
	public int getAvailableValue() {
		return this.availableValue;
	}
	public int getFinalPositionX() {
		return this.finalPositionX;
	}
	public int getFinalPositionY() {
		return this.finalPositionY;
	}
	public void setGameBoard(int lin, int col, int value) {
		this.gameBoard[lin][col] = value;
	}
	private void initGameBoard() {
		for(int i=1; i<=this.sizeBoard; i++) {
			for(int j=1; j<=this.sizeBoard; j++) {
				this.setGameBoard(i, j, this.getAvailableValue());
			}
		}
	}
	public void printGameBoard() {
		for(int i=1; i<=this.sizeBoard; i++) {
			System.out.print("\n\t");
			for(int j=1; j<=this.sizeBoard; j++) {
				if(this.gameBoard[i][j] > this.finalValue) {
					this.finalPositionX = i;
					this.finalPositionY = j;
					this.finalValue = this.gameBoard[i][j];
				}
				System.out.print(this.gameBoard[i][j] + " ");
			}
		}
		System.out.println();
	}
	
}
