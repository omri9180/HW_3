package assig3_1;

public class Gamer extends Thread {
    GamePlay gp;
    int goodFilpCounter = 0;

    public Gamer() {
        gp = new GamePlay();
    }

    public void play() throws InterruptedException {
        while (!isInterrupted() && gp.getRound_counter() <= 10) {
            if (gp.flipCoin()) {
                incGoodFilpCounter();
                Thread.sleep(1000);
            }
        }
    }

    public int getScore() {
        return getGoodFilpCounter();
    }

    public int getGoodFilpCounter() {
        return goodFilpCounter;
    }

    public void incGoodFilpCounter() {
        this.goodFilpCounter++;
    }

    @Override
    public void run() {

    }
}
