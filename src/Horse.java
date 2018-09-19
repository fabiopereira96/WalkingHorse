import java.util.Random;

/**
 * @author fabiopereira
 *
 */
public class Horse {
	
	private int x;
	private int y;
	private final int [][] avList = {{0,2,1,-1,-2,-2,-1,1,2},
					  						{0,1,2,2,1,-1,-2,-2,-1}};

	public Horse(){
		this.x = -1;
		this.y = -1;
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
	public int getNextPositionX(int bid){
		return this.x + avList[0][bid];
	}
	public int getNextPositionY(int bid){
		return this.y + avList[1][bid];
	}

	public void setRandomPosition(int max){
		int[] rPosition = new int[2];
		rPosition[0] = this.randomValue(max);
		rPosition[1] = this.randomValue(max);
		this.setPositionX(rPosition[0]);
		this.setPositionY(rPosition[1]);
	}

	private int randomValue(int max){
		int min = 0;
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}
	
}
