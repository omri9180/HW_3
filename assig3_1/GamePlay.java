package assig3_1;

import java.util.Random;

public class GamePlay {
    private Random rand;
    private int ran;
    private boolean coin_available;
    private int round_counter = 0;

    private Judge game_judge;

    public GamePlay() {
        game_judge = new Judge();
        rand  = new Random();
    }

    public void makeCoinAvail(boolean val) {
        if (val) {
            setCoin_available(val);
            notifyAll();
        } else {
            setCoin_available(val);
        }
    }


    public synchronized boolean flipCoin() throws InterruptedException {
        while (!isCoin_available()) {
            this.wait();
            System.out.println(Thread.currentThread().getName() + " is waiting for coin");
            game_judge.judgeRoll();
            notifyAll();

            if (isCoin_available()) {
                this.makeCoinAvail(false);
                System.out.println(Thread.currentThread().getName() + " is flipping coin");
                incRound_counter();
                ran = rand.nextInt(2);
                this.makeCoinAvail(true);
                notifyAll();
            }
        }

        return ran == 1;
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
