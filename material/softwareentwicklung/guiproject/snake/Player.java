/**
 * @author Fabio
 */
public class Player {
    private Snake snake;
    private int score;

    public Player(Snake snake) {
        this.snake = snake;
    }

    public Snake getSnake() {
        return snake;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore(int add) {
        score += add;
    }
}
