import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Fabio
 */
public class SnakeMain implements KeyListener {
    private ToolBox game;
    private Player player;
    private Food food;

    public SnakeMain() {
        game = new ToolBox(false);
        game.addKeyListener(this);
        game.setFont("Bauhaus 93", game.getFrameHeight() / 15);

        int blockSize = 20;

        player = new Player(new Snake(100, 100, blockSize, Color.RED, 1, 0));

        food = new Food(-100, -100, blockSize, Color.MAGENTA);
        placeFood();
    }

    public static void main(String[] args) {
        new SnakeMain().run();
    }

    public void run() {
        while (true) {
            // ####################
            // Zeichnen

            // Hintergrund zeichnen
            game.setColor(Color.WHITE);
            game.fillRectangle(0, 0, game.getFrameWidth(), game.getFrameHeight());

            // Spieler
            final Snake snake = player.getSnake();
            BodyBlock bodyBlock = snake.getHead();
            while(bodyBlock.hasNext()) {
                game.setColor(bodyBlock.getColor());
                game.fillRectangle(bodyBlock.getX(), bodyBlock.getY(), bodyBlock.getSize(), bodyBlock.getSize());
                bodyBlock = bodyBlock.getNext();
            }

            // Food
            game.setColor(food.getColor());
            game.fillOval(food.getX(), food.getY(), food.getSize(), food.getSize());

            // Spielstand
            game.setColor(Color.LIGHT_GRAY);
            game.drawString(game.getFrameWidth() / 2 - 150, 100, "Score = " + player.getScore());

            // ####################
            // Logik
            if(player.getSnake().eat(food)) {
                player.getSnake().addBodyBlock();
                player.incrementScore(1);
                placeFood();
            }

            if(!player.getSnake().biteItself()) {
                player.getSnake().move();
            } else {
                game.drawString(game.getFrameWidth() / 2 - 150, game.getFrameHeight() / 2, "GAME OVER!");
            }

            // Unsere Schlange kann durch Wände gehen!
            if(player.getSnake().getHead().getX() >= game.getFrameWidth()) {
                player.getSnake().getHead().setX(0);
            } else if(player.getSnake().getHead().getX() < 0) {
                player.getSnake().getHead().setX(game.getFrameWidth());
            } else if(player.getSnake().getHead().getY() >= game.getFrameHeight()) {
                player.getSnake().getHead().setY(0);
            } else if(player.getSnake().getHead().getY() < 0) {
                player.getSnake().getHead().setY(game.getFrameHeight());
            }

            // ####################
            game.wait(100); // 100 Millisekunden warten
        }
    }

    private void placeFood() {
        boolean intersects;
        do {
            intersects = false;

            food.setX(game.nextRandomInt(game.getFrameWidth() / food.getSize()) * food.getSize());
            food.setY(game.nextRandomInt(game.getFrameHeight() / food.getSize()) * food.getSize());

            BodyBlock body = player.getSnake().getHead();
            while(body.hasNext()) {
                if(body.getX() == food.getX() && body.getY() == food.getY()) {
                    intersects = true;
                    break;
                }
                body = body.getNext();
            }
        } while(intersects);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.getSnake().turnUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.getSnake().turnDown();
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.getSnake().turnLeft();
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.getSnake().turnRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
