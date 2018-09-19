/**
 * @author fabiopereira
 *
 */
public class GameBoard {

	private int lin;
	private int col;
	private int availableValue;
	
	protected int sizeBoard = 7;
	protected int gameBoard[][];

	public GameBoard() {
		this.lin = this.sizeBoard+1;
		this.col = this.sizeBoard+1;
		this.availableValue = 0;
		this.gameBoard = new int[lin][col];
		this.initGameBoard();
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
	public void setGameBoard(int lin, int col, int value) {
		this.gameBoard[lin][col] = value;
	}
	private void initGameBoard() {
		for(int i=0; i<this.getLines(); i++) {
			for(int j=0; j<this.getColumns(); j++) {
				this.setGameBoard(i, j, this.getAvailableValue());
			}
		}
	}
	public boolean availablePosition(int lin, int col) {
		return this.gameBoard[lin][col] == this.getAvailableValue();
	}
	public void printGameBoard() {
		for(int i=0; i<this.getLines(); i++) {
			for(int j=0; j<this.getColumns(); j++) {
				System.out.print(this.gameBoard[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
