package br.com.walkinghorse.java;

import java.util.concurrent.atomic.AtomicInteger;

public class Game {

    public static void main(String[] args) {

        long initialTime;
        BackTracking tryGame;
    	
        tryGame = new BackTracking();
        tryGame.randomHorse();
        tryGame.setGameBoard(tryGame.getPositionX(), tryGame.getPositionY(), 1);

        AtomicInteger it = new AtomicInteger(1);
        
        //Start count time
        initialTime = System.nanoTime();
        
        tryGame.tryMoveHorse(2, tryGame.getPositionX(), tryGame.getPositionY(), it);
        tryGame.printGame(initialTime, System.nanoTime(), it);
    }
}