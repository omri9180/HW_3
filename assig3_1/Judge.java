package assig3_1;

public class Judge extends Gamer {

    GamePlay judgeGp;

    public Judge() {
        judgeGp = new GamePlay();
    }

    public void judgeRoll() throws InterruptedException {
        while (!isInterrupted()) {
            judgeGp.makeCoinAvail(false);
            Thread.sleep(1000);
            judgeGp.makeCoinAvail(true);
            Thread.sleep(500);
        }
    }
}


