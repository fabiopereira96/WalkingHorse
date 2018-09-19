public class Game {

    public static void main(String[] args) {
        BackTracking tryGame = new BackTracking();
        tryGame.randomHorse();
        tryGame.tryMoveHorse(2, tryGame.getPositionX(), tryGame.getPositionY());
        tryGame.printGame();
    }
}