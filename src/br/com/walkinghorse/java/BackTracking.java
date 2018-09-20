package br.com.walkinghorse.java;

import java.util.concurrent.atomic.AtomicInteger;

public class BackTracking extends GameBoard{

    private Horse horse;

    public BackTracking(){
        super();
        this.horse = new Horse();
    }
    public void randomHorse(){
        this.horse.setRandomPosition(super.sizeBoard);
    }
    public int getPositionX(){
		return this.horse.getPositionX();
	}
	public int getPositionY(){
		return this.horse.getPositionY();
	}

    public void tryMoveHorse(int i, int x, int y, AtomicInteger s){
        int u = 0, v = 0, k = 0;
        AtomicInteger ls = new AtomicInteger(0);
        do{
            k++;
            u = this.horse.getNextPositionX(x, k);
            v = this.horse.getNextPositionY(y, k);
            if (1<=u && u<=super.sizeBoard && 1<=v && v<=super.sizeBoard && super.gameBoard[u][v]==0){
                super.setGameBoard(u, v, i);
                if (i < super.sizeBoard*super.sizeBoard){
                    tryMoveHorse(i+1,u,v, ls);
                    if (ls.intValue() == 0) {
                    	super.setGameBoard(u, v, 0);                    	
                    }
                } else{
                    ls.set(1);
                }
            }
        } while (ls.intValue() == 0 && k < this.horse.getLengthList());
        s.set(ls.intValue());
    }
    
    //Todo Validar tabuleiro antes de imprimir.
    public void printGame(){
    	super.printGameBoard();
    }

} 