import java.util.Random;

/**
 * @author fabiopereira
 *
 */
public class BackTracking extends GameBoard{

    private Horse horse;
    private boolean success;

    public BackTracking(){
        super();
        this.horse = new Horse();
        this.success = false;
    }
    public void randomHorse(){
        this.horse.setRandomPosition(super.sizeBoard);
    }
    public int getPositionX(){
		return this.horse.getPositionX();
	}
	public int getPositionY(){
		return this.horse.getPositionX();
	}

    public void tryMoveHorse(int i, int x, int y){
        int u = 0, v = 0, k = 0;
        boolean lsuccess = false;
        do{
            k++;
            u = this.horse.getNextPositionX(k);
            v = this.horse.getNextPositionY(k);
            if (1<=u && u<=super.sizeBoard && 1<=v && v<=super.sizeBoard && super.gameBoard[u][v]==0){
                super.setGameBoard(u, v, i);
                if (i < super.sizeBoard*super.sizeBoard){
                    tryMoveHorse(i+1,u,v);
                    if (!lsuccess)
                    super.setGameBoard(u, v, 0);
                } else{
                    lsuccess = true;
                }
            }
        } while (!lsuccess && k < super.sizeBoard);
        this.success = lsuccess;
    }

    public void printGame(){
        //if(this.success){
            super.printGameBoard();
        //} else {
        //    System.out.println("Solução não encontrada!");
       // }
    }

} 