package assig3_1;

public class Judge extends GamePlay {

//    GamePlay game_judge;
//
//    public Judge(GamePlay gp){
//        game_judge = gp;
//    }

    public void judgeRoll() throws InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            makeCoinAvail(false);
            Thread.sleep(1000);
            makeCoinAvail(true);
            Thread.sleep(500);
        }
    }


}


