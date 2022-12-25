package assig3_1;

import java.util.Random;

public class Player {
    int treeCount = 0;
    GamePlay gm = new GamePlay();
    int rand_coin;
    Random ran = new Random();


    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }

    public int getTreeCount() {
        return treeCount;
    }

    public boolean flipCoin() throws InterruptedException {

            if (!gm.coin_available) {
                while (gm.coin_available) {
                    System.out.println(Thread.currentThread().getName() + " is wating for coin");

                    this.wait();

                }
            } else {
                System.out.println(Thread.currentThread().getName() + " is flipping coin");
                gm.coin_available = false;
                gm.incRound_counter();
                rand_coin = ran.nextInt(2);

            }

            return rand_coin==0?false:true;

    }

}
