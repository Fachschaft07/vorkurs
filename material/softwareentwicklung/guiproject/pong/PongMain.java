import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Fabio
 */
public class PongMain implements KeyListener {
    private ToolBox game;
    private Player playerLeft;
    private Player playerRight;
    private Ball ball;

    public PongMain() {
        game = new ToolBox(false); // Das Fenster, in dem das Spiel angezeigt wird
        game.addKeyListener(this); // Tastatureingaben abfragen
        game.setFont("Bauhaus 93", game.getFrameHeight() / 15);

        float marginBorder = game.getFrameWidth() / 25; // Abstand zum Fensterrand
        int barHeight = game.getFrameHeight() / 7; // H�he eines Balkens
        int barWidth = game.getFrameWidth() / 150; // Breite eines Balkens

        Bar barPlayerLeft = new Bar(
                marginBorder, // Abstand zum Fensterrand (links)
                game.getFrameHeight() / 2 - barHeight / 2, // Startposition des Balkens y-Achse
                barWidth, // Balken Breite
                barHeight, // Balken H�he
				Color.MAGENTA
        );
        playerLeft = new Player(barPlayerLeft);

        Bar barPlayerRight = new Bar(
                game.getFrameWidth() - marginBorder - barWidth, // Abstand zum Fensterrand (rechts)
                game.getFrameHeight() / 2 - barHeight / 2, // Startposition des Balkens y-Achse
                barWidth, // Balken Breite
                barHeight, // Balken H�he
				Color.GREEN
        );
        playerRight = new Player(barPlayerRight);

        int ballRadius = game.getFrameHeight() / 50;

        ball = new Ball(
                game.getFrameWidth() / 2 - ballRadius / 2, // Startposition des Balls x-Achse
                game.getFrameHeight() / 2 - ballRadius / 2, // Startposition des Balls y-Achse
                ballRadius, // Radius des Balls
                20.0f, // Startgeschwindigkeit
				Color.WHITE
        );

        if (game.nextRandomInt(10) > 5) {
            ball.setDirection(0.45f, 0.55f);
        } else {
            ball.setDirection(-0.45f, 0.55f);
        }
    }

    public static void main(String[] args) {
        new PongMain().run();
    }

    public void run() {
        float speed = 2.25f;
        int round = 0;

        while (true) {
            // ####################
            // Zeichnen

            // Hintergrund zeichnen
            game.setColor(Color.BLACK);
            game.fillRectangle(0, 0, game.getFrameWidth(), game.getFrameHeight());

            // Spieler auf der linken Seite
            Bar barLeft = playerLeft.getBar();
            game.setColor(barLeft.getColor());
            game.fillRectangle(barLeft.getX(), barLeft.getY(), barLeft.getWidth(), barLeft.getHeight());

            // Spieler auf der rechten Seite
            Bar barRight = playerRight.getBar();
            game.setColor(barRight.getColor());
            game.fillRectangle(barRight.getX(), barRight.getY(), barRight.getWidth(), barRight.getHeight());

            // Ball
            game.setColor(ball.getColor());
            game.fillOval(ball.getX(), ball.getY(), ball.getSize(), ball.getSize());

            // Spielstand
            game.drawString(game.getFrameWidth() / 2 - 100, 100, playerLeft.getScore() + " : " + playerRight.getScore());

            // ####################
            // Bewegungen

            playerLeft.getBar().move();
            playerRight.getBar().move();

            // Attribute vom Ball zwischenspeichern, falls eine Kollision aufkommen sollte
            float directionX = ball.getDirectionX();
            float directionY = ball.getDirectionY();
            int x = ball.getX();
            int y = ball.getY();

            ball.move(); // Als simulierte Bewegung

            // Randber�hrungen �berpr�fen

            if (ball.getX() < 0 || ball.getX() + ball.getSize() > game.getFrameWidth()) {
                // linker oder rechter Rand ber�hrt
                ball.setDirection(-directionX, directionY);
                if (ball.getX() < 0) {
                    // linker Rand ber�hrt
                    playerRight.incrementScore(1);
                } else {
                    // rechter Rand ber�hrt
                    playerLeft.incrementScore(1);
                }
                ball.increseSpeed(speed);
            } else if (ball.getY() < 0 || ball.getY() + ball.getSize() > game.getFrameHeight()) {
                // oberer oder unterer Rand ber�rt
                ball.setDirection(directionX, -directionY);
            }

            // Balkenber�hrungen �berpr�fen

            if (ball.getX() < barLeft.getX() + barLeft.getWidth() // Spieler auf der linken Seite
                    && ball.getX() < barLeft.getX()
                    && ball.getY() > barLeft.getY()
                    && ball.getY() + ball.getSize() < barLeft.getY() + barLeft.getHeight()
                    || ball.getX() + ball.getSize() > barRight.getX() // Spieler auf der rechten Seite
                    && ball.getX() < barRight.getX() + barRight.getWidth()
                    && ball.getY() > barRight.getY()
                    && ball.getY() + ball.getSize() < barRight.getY() + barRight.getHeight()) {
                // Balken an Vorderseite getroffen
                ball.setDirection(-directionX, directionY);
            }

            ball.setX(x); // Ball auf urspr�ngliche x-Position zur�cksetzen
            ball.setY(y); // Ball auf urspr�ngliche y-Position zur�cksetzen

            ball.move(); // Ball wirklich bewegen

            // ####################
            game.wait(40); // 40 Millisekunden warten

            if(round++ >= 1000) {
                round = 0;
                ball.increseSpeed(speed);
                barLeft.increaseSpeed(speed);
                barRight.increaseSpeed(speed);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            playerLeft.getBar().moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            playerLeft.getBar().moveDown();
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            playerRight.getBar().moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            playerRight.getBar().moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
            playerLeft.getBar().stop();
        }

        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
            playerRight.getBar().stop();
        }
    }
}
