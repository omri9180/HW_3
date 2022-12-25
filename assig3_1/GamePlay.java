package assig3_1;

public class GamePlay {
    protected boolean coin_available = true;
    private int round_counter = 0;
    Player p1 = new Player();
    Player p2 = new Player();

    public void makeCoinAvail(boolean val) {
        if (val) {
            coin_available = false;
        } else {
            notifyAll();
            coin_available = true;
        }
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
