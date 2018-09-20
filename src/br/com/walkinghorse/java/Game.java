package br.com.walkinghorse.java;

import java.util.concurrent.atomic.AtomicInteger;

public class Game {

    public static void main(String[] args) {
    	
        BackTracking tryGame = new BackTracking();
        tryGame.randomHorse();
        
        tryGame.setGameBoard(tryGame.getPositionX(), tryGame.getPositionY(), 1);
        System.out.println("Posicao inicial do cavalo: " + tryGame.getPositionX() + "," + tryGame.getPositionY());

        AtomicInteger it = new AtomicInteger(1);
        tryGame.tryMoveHorse(2, tryGame.getPositionX(), tryGame.getPositionY(), it);
        
        tryGame.printGame();
    }
}