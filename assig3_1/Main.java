package assig3_1;

public class Main {
    public static void main(String[] args) {
        GamePlay g1 = new GamePlay();
        Gamer gam1 = new Gamer(g1);
        Gamer gam2 = new Gamer(g1);

        gam2.start();
        gam1.start();
    }
}