package assig3_1;

public class Gamer extends Thread {
    GamePlay gp;
    private int tree_count = 0;
    int goodFilpCounter = 0;

    public Gamer(GamePlay game_p) {
        this.gp = game_p;
    }

    public void play() throws InterruptedException {
        if (gp.flipCoin()) {
            gp.incTree_count();
            incGoodFilpCounter();
            Thread.sleep(1000);
        }
    }


    public int getScore() {
        return getGoodFilpCounter();
    }

    @Override
    public boolean isInterrupted() {
        return super.isInterrupted();
    }

    public int getGoodFilpCounter() {
        return goodFilpCounter;
    }

    public void incGoodFilpCounter() {
        this.goodFilpCounter++;
    }


    @Override
    public void run() {
        while (!isInterrupted() && gp.getRound_counter() <= 10) {
            try {
                play();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
