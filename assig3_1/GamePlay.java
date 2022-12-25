package assig3_1;

import java.util.Random;

public class GamePlay {
    private Random rand = new Random();
    private int ran;
    private boolean coin_available;
    private int round_counter = 0;


    public void makeCoinAvail(boolean val) {
        if (val) {
            coin_available = val;
            notifyAll();
        } else {
            coin_available = val;
        }
    }

    public synchronized boolean flipCoin() throws InterruptedException {
        if (isCoin_available()) {
            System.out.println(Thread.currentThread().getName() + " is flipping coin");
            makeCoinAvail(false);
            incRound_counter();
            ran = rand.nextInt(2);
            makeCoinAvail(true);
            notifyAll();
        } else {
            while (!isCoin_available()) {
                this.wait();
                System.out.println(Thread.currentThread().getName() + " is waiting for coin");
            }

        }
        if (ran == 1) {
            return true;
        }

        return false;
    }

    public boolean isCoin_available() {
        return coin_available;
    }

    public void incRound_counter() {
        this.round_counter++;
    }

    public int getRound_counter() {
        return round_counter;
    }


    public void setCoin_available(boolean coin_available) {
        this.coin_available = coin_available;
    }
}
