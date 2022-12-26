package assig3_1;

public class Judge extends GamePlay{




    public void judgeRoll() throws InterruptedException {
        while (!is()) {
            makeCoinAvail(false);
            Thread.sleep(1000);
            makeCoinAvail(true);
            Thread.sleep(500);
        }
    }


}


