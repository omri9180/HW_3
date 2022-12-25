package assig3_1;

public class Gamer extends Thread {

    int goodFilpCounter = 0;
    GamePlay gmp;
    Player pl = new Player();

    public Gamer(GamePlay gp){
        this.gmp = gp;

    }



    public void  play() throws InterruptedException {
        while (!this.isInterrupted() && gmp.getRound_counter()<=10){
            if (pl.flipCoin()){
                goodFilpCounter++;
                Thread.sleep(1000);

            }

        }
    }

    public int getGoodFilpCounter() {
        return goodFilpCounter;
    }
}
