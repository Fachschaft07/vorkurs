import java.awt.*;

/**
 * @author Fabio
 */
public class Snake {
    private BodyBlock head;

    private int directionX;
    private int directionY;

    public Snake(int x, int y, int blockSize, Color headColor, int directionX, int directionY) {
        head = new BodyBlock(x, y, blockSize, headColor);
        BodyBlock prev = head;
        for (int count = 0; count < 3; count++) {
            BodyBlock block = new BodyBlock(prev.getX() - prev.getSize(), prev.getY(), prev.getSize(), Color.GRAY);
            prev.setNext(block);
            prev = block;
        }
        this.directionX = directionX;
        this.directionY = directionY;
    }

    public BodyBlock getHead() {
        return head;
    }

    public boolean eat(Food food) {
        return food.getX() == head.getX() && food.getY() == head.getY();
    }

    public void turnUp() {
        if(directionX != 0) {
            directionY = -1;
            directionX = 0;
        }
    }

    public void turnDown() {
        if(directionX != 0) {
            directionY = 1;
            directionX = 0;
        }
    }

    public void turnLeft() {
        if(directionY != 0) {
            directionY = 0;
            directionX = -1;
        }
    }

    public void turnRight() {
        if(directionY != 0) {
            directionY = 0;
            directionX = 1;
        }
    }

    public void move() {
        int prevX = head.getX();
        int prevY = head.getY();

        head.move(directionX, directionY);

        BodyBlock body = head.getNext();
        while(body.hasNext()) {
            int x = body.getX();
            int y = body.getY();

            body.setX(prevX);
            body.setY(prevY);

            prevX = x;
            prevY = y;
            body = body.getNext();
        }
    }

    public void addBodyBlock() {
        BodyBlock lastBody = head;
        while(lastBody.hasNext()) {
            lastBody = lastBody.getNext();
        }
        lastBody.setNext(lastBody.duplicate());
    }

    public boolean biteItself() {
        BodyBlock body = head.getNext();
        while(body.hasNext()) {
            if(body.getY() == head.getY() && body.getX() == head.getX()) {
                return true;
            }
            body = body.getNext();
        }
        return false;
    }
}
