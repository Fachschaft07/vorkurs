
/**
 * @author Fabio
 */
public class Player {
    private Bar bar;
    private int score;

    public Player(Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        return bar;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore(int add) {
        score += add;
    }
}
